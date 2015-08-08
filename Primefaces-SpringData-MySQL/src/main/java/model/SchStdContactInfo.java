package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the sch_std_contact_info database table.
 * 
 */
@Entity
@Table(name="sch_std_contact_info")
@NamedQuery(name="SchStdContactInfo.findAll", query="SELECT s FROM SchStdContactInfo s")
public class SchStdContactInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="contact_id")
	private int contactId;

	@Column(name="mobile_no")
	private String mobileNo;

	@Column(name="parmanent_addr")
	private String parmanentAddr;

	@Column(name="present_addr")
	private String presentAddr;

	@Column(name="tel_no")
	private String telNo;

	//bi-directional many-to-one association to SchStudentInfo
	@ManyToOne
	@JoinColumn(name="std_id")
	private SchStudentInfo schStudentInfo;

	public SchStdContactInfo() {
	}

	public int getContactId() {
		return this.contactId;
	}

	public void setContactId(int contactId) {
		this.contactId = contactId;
	}

	public String getMobileNo() {
		return this.mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getParmanentAddr() {
		return this.parmanentAddr;
	}

	public void setParmanentAddr(String parmanentAddr) {
		this.parmanentAddr = parmanentAddr;
	}

	public String getPresentAddr() {
		return this.presentAddr;
	}

	public void setPresentAddr(String presentAddr) {
		this.presentAddr = presentAddr;
	}

	public String getTelNo() {
		return this.telNo;
	}

	public void setTelNo(String telNo) {
		this.telNo = telNo;
	}

	public SchStudentInfo getSchStudentInfo() {
		return this.schStudentInfo;
	}

	public void setSchStudentInfo(SchStudentInfo schStudentInfo) {
		this.schStudentInfo = schStudentInfo;
	}

}