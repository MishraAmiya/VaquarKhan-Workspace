package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the sch_school_notice database table.
 * 
 */
@Entity
@Table(name="sch_school_notice")
@NamedQuery(name="SchSchoolNotice.findAll", query="SELECT s FROM SchSchoolNotice s")
public class SchSchoolNotice implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="notice_id")
	private int noticeId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="expire_date")
	private Date expireDate;

	private String notice;

	@Lob
	@Column(name="notice_img")
	private byte[] noticeImg;

	@Column(name="notice_title")
	private String noticeTitle;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="publish_date")
	private Date publishDate;

	public SchSchoolNotice() {
	}

	public int getNoticeId() {
		return this.noticeId;
	}

	public void setNoticeId(int noticeId) {
		this.noticeId = noticeId;
	}

	public Date getExpireDate() {
		return this.expireDate;
	}

	public void setExpireDate(Date expireDate) {
		this.expireDate = expireDate;
	}

	public String getNotice() {
		return this.notice;
	}

	public void setNotice(String notice) {
		this.notice = notice;
	}

	public byte[] getNoticeImg() {
		return this.noticeImg;
	}

	public void setNoticeImg(byte[] noticeImg) {
		this.noticeImg = noticeImg;
	}

	public String getNoticeTitle() {
		return this.noticeTitle;
	}

	public void setNoticeTitle(String noticeTitle) {
		this.noticeTitle = noticeTitle;
	}

	public Date getPublishDate() {
		return this.publishDate;
	}

	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}

}