package schoo.chart;

import java.io.Serializable;

import org.primefaces.model.chart.BubbleChartModel;
import org.primefaces.model.chart.CartesianChartModel;
import org.primefaces.model.chart.ChartModel;
import org.primefaces.model.chart.HorizontalBarChartModel;
import org.primefaces.model.chart.LineChartModel;
import org.primefaces.model.chart.MeterGaugeChartModel;
import org.primefaces.model.chart.PieChartModel;

public abstract class ChartView implements Serializable {

	private static final long serialVersionUID = 1L;

	private HorizontalBarChartModel horizontalBarChartModel;
	private PieChartModel pieChartModel;
	private MeterGaugeChartModel meterGaugeChartModel;
	private CartesianChartModel cartesianChartModel;
	private BubbleChartModel buChartModel;
	private LineChartModel areaChartModel;
	private LineChartModel lineChartModel;
	
	
	
	public HorizontalBarChartModel getHorizontalBarChartModel() {
		return horizontalBarChartModel;
	}
	public void setHorizontalBarChartModel(
			HorizontalBarChartModel horizontalBarChartModel) {
		this.horizontalBarChartModel = horizontalBarChartModel;
	}
	public PieChartModel getPieChartModel() {
		return pieChartModel;
	}
	public void setPieChartModel(PieChartModel pieChartModel) {
		this.pieChartModel = pieChartModel;
	}
	public MeterGaugeChartModel getMeterGaugeChartModel() {
		return meterGaugeChartModel;
	}
	public void setMeterGaugeChartModel(MeterGaugeChartModel meterGaugeChartModel) {
		this.meterGaugeChartModel = meterGaugeChartModel;
	}
	public CartesianChartModel getCartesianChartModel() {
		return cartesianChartModel;
	}
	public void setCartesianChartModel(CartesianChartModel cartesianChartModel) {
		this.cartesianChartModel = cartesianChartModel;
	}
	public BubbleChartModel getBuChartModel() {
		return buChartModel;
	}
	public void setBuChartModel(BubbleChartModel buChartModel) {
		this.buChartModel = buChartModel;
	}
	public LineChartModel getAreaChartModel() {
		return areaChartModel;
	}
	public void setAreaChartModel(LineChartModel areaChartModel) {
		this.areaChartModel = areaChartModel;
	}
	public LineChartModel getLineChartModel() {
		return lineChartModel;
	}
	public void setLineChartModel(LineChartModel lineChartModel) {
		this.lineChartModel = lineChartModel;
	}
	
	
}
