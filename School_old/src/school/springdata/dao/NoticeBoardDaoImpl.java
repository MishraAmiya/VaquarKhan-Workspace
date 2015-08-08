package school.springdata.dao;

import java.io.IOException;
import java.io.InputStream;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import org.springframework.beans.factory.annotation.Autowired;

import school.notice.NoticeBean;
import school.springdata.jpa.data.SchSchoolNotice;
import school.springdata.service.SchSchoolNoticeDataService;
import school.util.DBConnect;

public class NoticeBoardDaoImpl implements INoticeBoardDao {

	@Autowired
	private SchSchoolNoticeDataService SchSchoolNoticeDataService;

	// String sql =
	// "INSERT INTO sch_school_notice (notice_title, notice, notice_img, publish_date, expire_date) VALUES (?,?,?,?,?)"
	public void insertNotice(final NoticeBean noticeBean) {
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		String pd = df.format(noticeBean.getPublishDate());
		String vd = df.format(noticeBean.getPublishDate());
		if (noticeBean.getNoticeIamge() != null) {
			//
			//
			//

			// String sql =
			// "INSERT INTO sch_school_notice (notice_title, notice, notice_img, publish_date, expire_date)"+
			// "VALUES (?,?,?,?,?)";
			try {
				InputStream streamfile = noticeBean.getNoticeIamge()
						.getInputstream();

				SchSchoolNotice schSchoolNotice = new SchSchoolNotice();
				schSchoolNotice.setNoticeTitle(noticeBean.getNoticeTitle());
				schSchoolNotice.setNotice(noticeBean.getNotice());
				// TODO schSchoolNotice.setNoticeImg(streamfile
				// );//filenoticeBean.getNoticeIamge().getSize());
				schSchoolNotice.setPublishDate(convertStringToDate(pd));
				schSchoolNotice.setExpireDate(convertStringToDate(vd));
				/*
				 * 
				 * ps.setString(1, noticeBean.getNoticeTitle()); ps.setString(2,
				 * noticeBean.getNotice()); ps.setBinaryStream(3, streamfile,
				 * noticeBean.getNoticeIamge().getSize()); ps.setString(4, pd);
				 * ps.setString(5, vd);
				 */

				// Save
				SchSchoolNoticeDataService.getSchSchoolNoticeRepository().save(
						schSchoolNotice);

				int i = 0;// TODO need to fix
				if (i > 0) {
					FacesMessage msg = new FacesMessage(
							FacesMessage.SEVERITY_INFO, "Information",
							"New Notice add Successfully");
					//
					FacesContext.getCurrentInstance().addMessage(null, msg);

				} else {
					FacesMessage msg = new FacesMessage(
							FacesMessage.SEVERITY_ERROR, "Error",
							"Fail to save notice");
					//
					FacesContext.getCurrentInstance().addMessage(null, msg);
				}
			} catch (IOException ex) {
				System.out.println("Error from insert----------->"
						+ ex.getMessage());
			}
			//
			//
			//
			//

		} else {
			SchSchoolNotice schSchoolNotice = new SchSchoolNotice();
			schSchoolNotice.setNoticeTitle(noticeBean.getNoticeTitle());
			schSchoolNotice.setNotice(noticeBean.getNotice());
			// TODO schSchoolNotice.setNoticeImg(streamfile
			// );//filenoticeBean.getNoticeIamge().getSize());
			schSchoolNotice.setPublishDate(convertStringToDate(pd));
			schSchoolNotice.setExpireDate(convertStringToDate(vd));

			// Save
			SchSchoolNoticeDataService.getSchSchoolNoticeRepository().save(
					schSchoolNotice);

			int i = 0;// TODO need to fix
			if (i > 0) {
				FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO,
						"Information", "New Notice add Successfully");
				FacesContext.getCurrentInstance().addMessage(null, msg);
			} else {
				FacesMessage msg = new FacesMessage(
						FacesMessage.SEVERITY_ERROR, "Error",
						"Fail to save notice");
				FacesContext.getCurrentInstance().addMessage(null, msg);
			}
		}

	}

	// SELECT * FROM sch_school_notice ORDER BY notice_id DESC LIMIT 5
	public List<NoticeBean> getAllNotice() {

		Iterable<SchSchoolNotice> dataListIterable = SchSchoolNoticeDataService
				.getSchSchoolNoticeRepository().findAll();

		List<NoticeBean> SchSchoolNoticeList = new ArrayList<NoticeBean>();

		try {
			for (SchSchoolNotice schSchoolNotice : dataListIterable) {

				NoticeBean nb = new NoticeBean();

				nb.setNoticeId(schSchoolNotice.getNoticeId());
				nb.setNoticeTitle(schSchoolNotice.getNoticeTitle());
				nb.setNotice(schSchoolNotice.getNotice());
				// nb.setNoticeImage(file);
				nb.setPublishDate(schSchoolNotice.getPublishDate());
				nb.setValidateDate(schSchoolNotice.getExpireDate());
				// adding list
				SchSchoolNoticeList.add(nb);
			}
		} catch (Exception e) {
		}
		return SchSchoolNoticeList;
	}

	// notice_id, notice_title, notice, notice_img, publish_date, expire_date

	public void updateNotice(final NoticeBean noticeBean) {
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		String pd = df.format(noticeBean.getPublishDate());
		String vd = df.format(noticeBean.getValidateDate());

		// save
		SchSchoolNotice updateNoticeBean = SchSchoolNoticeDataService
				.getSchSchoolNoticeRepository().findOne(
						noticeBean.getNoticeId());

		if (updateNoticeBean == null) {
			System.err
					.println("updateNoticeBean is null insie of updateNotice methid");
		}
		updateNoticeBean.setNoticeTitle(noticeBean.getNoticeTitle());
		updateNoticeBean.setNotice(noticeBean.getNotice());
		updateNoticeBean.setPublishDate(convertStringToDate(pd));
		updateNoticeBean.setExpireDate(convertStringToDate(vd));
		updateNoticeBean.setNoticeId(noticeBean.getNoticeId());

		int i = 0;// TODO need to fix
		if (i > 0) {
			FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO,
					"Information", "Data Update Successfully");
			FacesContext.getCurrentInstance().addMessage(null, msg);
		} else {
			FacesMessage msg = new FacesMessage(
					FacesMessage.SEVERITY_ERROR, "Error",
					"Fail to update data");
			FacesContext.getCurrentInstance().addMessage(null, msg);
		}
	}

	private Date convertStringToDate(String dateInString) {

		SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy");
		Date date = null;
		try {

			date = formatter.parse(dateInString);
			/*
			 * System.out.println(date);
			 * System.out.println(formatter.format(date));
			 */
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}
//TODO need to fix
	public void updateNoticeImage(final NoticeBean noticeBean) {
		String sql = "UPDATE sch_school_notice SET notice_img=? WHERE notice_id=?";
		InputStream streamfile = null;
		try {
			streamfile = noticeBean.getNoticeIamge().getInputstream();
			PreparedStatement ps = DBConnect.getConnection().prepareStatement(
					sql);
			ps.setBinaryStream(1, streamfile, noticeBean.getNoticeIamge()
					.getSize());
			int i =0;//TODO need to update
			if (i > 0) {
				FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO,
						"Information", "Image Changed Successfully");
				FacesContext.getCurrentInstance().addMessage(null, msg);
			} else {
				FacesMessage msg = new FacesMessage(
						FacesMessage.SEVERITY_ERROR, "Error",
						"Fail to change Image");
				FacesContext.getCurrentInstance().addMessage(null, msg);
			}
		} catch (SQLException ex) {
			Logger.getLogger(NoticeBean.class.getName()).log(Level.SEVERE,
					null, ex);
		} catch (IOException ex) {
			Logger.getLogger(NoticeBean.class.getName()).log(Level.SEVERE,
					null, ex);
		} finally {
			try {
				streamfile.close();
			} catch (IOException ex) {
				Logger.getLogger(NoticeBean.class.getName()).log(Level.SEVERE,
						null, ex);
			}
		}
	}
//Need to fix
	public void deleteNotice(final NoticeBean noticeBean) {
		String sql = "DELETE FROM sch_school_notice WHERE notice_id=?";
		try {
			PreparedStatement ps = DBConnect.getConnection().prepareStatement(
					sql);
			ps.setInt(1, noticeBean.getNoticeId());
			int i = ps.executeUpdate();
			if (i > 0) {
				FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO,
						"Information", "One row deleted");
				FacesContext.getCurrentInstance().addMessage(null, msg);
			} else {
				FacesMessage msg = new FacesMessage(
						FacesMessage.SEVERITY_ERROR, "Error",
						"Fail to delete data");
				FacesContext.getCurrentInstance().addMessage(null, msg);
			}
		} catch (SQLException ex) {
			Logger.getLogger(NoticeBean.class.getName()).log(Level.SEVERE,
					null, ex);
		}
	}
}
