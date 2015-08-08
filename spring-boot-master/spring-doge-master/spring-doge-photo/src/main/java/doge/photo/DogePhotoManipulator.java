/*
 * Copyright 2012-2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package doge.photo;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.font.GlyphVector;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import javax.imageio.IIOImage;
import javax.imageio.ImageIO;
import javax.imageio.ImageWriteParam;
import javax.imageio.ImageWriter;
import javax.imageio.stream.ImageOutputStream;

import org.springframework.core.io.ClassPathResource;

/**
 * A {@link PhotoManipulator} to add Doge images.
 *
 * @author Josh Long
 * @author Phillip Webb
 */
public class DogePhotoManipulator implements PhotoManipulator {

	private static final int IMAGE_WIDTH = 300;

	private final Random random = new Random();

	private final BufferedImage dogeLogo;

	private final List<Text> text;

	public DogePhotoManipulator() {
		this.dogeLogo = readClassImage("/doge-logo.png");
		List<Text> text = new ArrayList<Text>();
		text.add(new Text("pivotal", "abstractfactorybean", "java"));
		text.add(new Text("spring", "annotations", "boot"));
		text.add(new Text("code", "semicolonfree", "groovy"));
		text.add(new Text("clean", "juergenized", "spring"));
		text.add(new Text("js", "nonblocking", "wat"));
		text.add(new Text("dallas", "springone", "2gx"));
		this.text = Collections.unmodifiableList(text);
	}

	private BufferedImage readClassImage(String name) {

		try (InputStream imgInputStream = new ClassPathResource(name).getInputStream()) {
			return ImageIO.read(imgInputStream);
		}
		catch (IOException e) {
			throw new RuntimeException(e);
		}

	}

	@Override
	public Photo manipulate(Photo photo) throws IOException {
		BufferedImage sourceImage = readImage(photo);
		BufferedImage destinationImage = manipulate(sourceImage);
		Photo resultPhoto = () -> {
			ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
			ImageOutputStream ios = ImageIO.createImageOutputStream(outputStream);
			ImageWriter writer = ImageIO.getImageWritersByFormatName("jpeg").next();
			ImageWriteParam param = writer.getDefaultWriteParam();
			param.setCompressionMode(ImageWriteParam.MODE_EXPLICIT);
			param.setCompressionQuality(0.85f);
			writer.setOutput(ios);
			writer.write(null, new IIOImage(destinationImage, null, null), param);
			ImageIO.write(destinationImage, "jpeg", outputStream);
			return new ByteArrayInputStream(outputStream.toByteArray());
		};
		return resultPhoto;
	}

	private BufferedImage readImage(Photo photo) throws IOException {
		try (InputStream inputStream = photo.getInputStream()) {
			return ImageIO.read(inputStream);
		}
	}

	private BufferedImage manipulate(BufferedImage sourceImage) {
		double aspectRatio = sourceImage.getHeight() / (double) sourceImage.getWidth();
		int height = (int) Math.floor(IMAGE_WIDTH * aspectRatio);
		BufferedImage destinationImage = new BufferedImage(IMAGE_WIDTH, height,
				BufferedImage.TYPE_INT_RGB);
		render(sourceImage, destinationImage);
		return destinationImage;
	}

	private void render(BufferedImage sourceImage, BufferedImage destinationImage) {
		Graphics2D destinationGraphics = destinationImage.createGraphics();
		try {
			setGraphicsHints(destinationGraphics);
			renderBackground(sourceImage, destinationImage, destinationGraphics);
			renderOverlay(destinationImage, destinationGraphics);
		}
		finally {
			destinationGraphics.dispose();
		}
	}

	private void renderBackground(BufferedImage sourceImage,
			BufferedImage destinationImage, Graphics2D destinationGraphics) {
		destinationGraphics.drawImage(sourceImage, 0, 0, IMAGE_WIDTH,
				destinationImage.getHeight(), null);
	}

	private void renderOverlay(BufferedImage image, Graphics2D graphics) {
		getRandomText().render(image, graphics);
		int y = image.getHeight() - this.dogeLogo.getHeight();
		graphics.drawImage(this.dogeLogo, 0, y, null);
	}

	private Text getRandomText() {
		return this.text.get(this.random.nextInt(this.text.size()));
	}

	private void setGraphicsHints(Graphics2D graphics) {
		graphics.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
				RenderingHints.VALUE_INTERPOLATION_BILINEAR);
		graphics.setRenderingHint(RenderingHints.KEY_RENDERING,
				RenderingHints.VALUE_RENDER_QUALITY);
		graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
		graphics.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING,
				RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
		graphics.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING,
				RenderingHints.VALUE_TEXT_ANTIALIAS_GASP);
	}

	/**
	 * Text overlay
	 */
	private static class Text {

		private final String very;

		private final String so;

		private final String such;

		public Text(String very, String so, String such) {
			this.very = very;
			this.so = so;
			this.such = such;
		}

		public void render(BufferedImage image, Graphics2D g) {
			double r = image.getHeight() / 448.0;
			renderText(g, "wow", 32, Color.MAGENTA, 25, r * 43);
			renderText(g, "very " + this.very, 29, Color.GREEN, 105, r * 115);
			renderText(g, "so " + this.so, 20, Color.MAGENTA, 25, r * 330);
			renderText(g, "such " + this.such, 30, Color.ORANGE, 125, r * 385);
		}

		private void renderText(Graphics2D g, String text, int fontSize, Paint paint,
				double x, double y) {
			Font font = new Font("Comic Sans MS", Font.BOLD, fontSize);
			GlyphVector vector = font.createGlyphVector(g.getFontRenderContext(),
					text.toCharArray());
			Shape shape = vector.getOutline((int) x, (int) y);
			g.setStroke(new BasicStroke(0.5f));
			g.setPaint(paint);
			g.fill(shape);
			g.setColor(Color.BLACK);
			g.draw(shape);
		}
	}
}
