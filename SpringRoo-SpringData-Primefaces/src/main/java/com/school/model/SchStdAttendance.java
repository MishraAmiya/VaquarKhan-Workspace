package com.school.model;


import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the sch_std_attendance database table.
 * 
 */
@Entity
@Table(name="sch_std_attendance")
@NamedQuery(name="SchStdAttendance.findAll", query="SELECT s FROM SchStdAttendance s")
public class SchStdAttendance implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="attend_id")
	private int attendId;

	@Temporal(TemporalType.DATE)
	@Column(name="attend_date")
	private Date attendDate;

	@Column(name="attend_status")
	private byte attendStatus;

	private String reason;

	@Column(name="std_roll_no")
	private int stdRollNo;

	//bi-directional many-to-one association to SchAcademicYear
	@ManyToOne
	@JoinColumn(name="acyid")
	private SchAcademicYear schAcademicYear;

	//bi-directional many-to-one association to SchStdGroup
	@ManyToOne
	@JoinColumn(name="group_id")
	private SchStdGroup schStdGroup;

	//bi-directional many-to-one association to SchSectionName
	@ManyToOne
	@JoinColumn(name="section_id")
	private SchSectionName schSectionName;

	//bi-directional many-to-one association to SchStudentInfo
	@ManyToOne
	@JoinColumn(name="std_id")
	private SchStudentInfo schStudentInfo;

	public SchStdAttendance() {
	}

	public int getAttendId() {
		return this.attendId;
	}

	public void setAttendId(int attendId) {
		this.attendId = attendId;
	}

	public Date getAttendDate() {
		return this.attendDate;
	}

	public void setAttendDate(Date attendDate) {
		this.attendDate = attendDate;
	}

	public byte getAttendStatus() {
		return this.attendStatus;
	}

	public void setAttendStatus(byte attendStatus) {
		this.attendStatus = attendStatus;
	}

	public String getReason() {
		return this.reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public int getStdRollNo() {
		return this.stdRollNo;
	}

	public void setStdRollNo(int stdRollNo) {
		this.stdRollNo = stdRollNo;
	}

	public SchAcademicYear getSchAcademicYear() {
		return this.schAcademicYear;
	}

	public void setSchAcademicYear(SchAcademicYear schAcademicYear) {
		this.schAcademicYear = schAcademicYear;
	}

	public SchStdGroup getSchStdGroup() {
		return this.schStdGroup;
	}

	public void setSchStdGroup(SchStdGroup schStdGroup) {
		this.schStdGroup = schStdGroup;
	}

	public SchSectionName getSchSectionName() {
		return this.schSectionName;
	}

	public void setSchSectionName(SchSectionName schSectionName) {
		this.schSectionName = schSectionName;
	}

	public SchStudentInfo getSchStudentInfo() {
		return this.schStudentInfo;
	}

	public void setSchStudentInfo(SchStudentInfo schStudentInfo) {
		this.schStudentInfo = schStudentInfo;
	}

}