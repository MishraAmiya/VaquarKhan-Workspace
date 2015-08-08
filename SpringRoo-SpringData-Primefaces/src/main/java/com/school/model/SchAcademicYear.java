package com.school.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;


/**
 * The persistent class for the sch_academic_year database table.
 * 
 */
@Entity
@Table(name="sch_academic_year")
@NamedQuery(name="SchAcademicYear.findAll", query="SELECT s FROM SchAcademicYear s")
public class SchAcademicYear implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int acyid;

	private String acyear;

	private byte isclosed;

	@Column(name="no_of_exam")
	private int noOfExam;

	//bi-directional many-to-one association to SchSectionName
	@OneToMany(mappedBy="schAcademicYear")
	private List<SchSectionName> schSectionNames;

	//bi-directional many-to-one association to SchStdAttendance
	@OneToMany(mappedBy="schAcademicYear")
	private List<SchStdAttendance> schStdAttendances;

	//bi-directional many-to-one association to SchStdMark
	@OneToMany(mappedBy="schAcademicYear")
	private List<SchStdMark> schStdMarks;

	//bi-directional many-to-one association to SchStdRegistration
	@OneToMany(mappedBy="schAcademicYear")
	private List<SchStdRegistration> schStdRegistrations;

	public SchAcademicYear() {
	}

	public int getAcyid() {
		return this.acyid;
	}

	public void setAcyid(int acyid) {
		this.acyid = acyid;
	}

	public String getAcyear() {
		return this.acyear;
	}

	public void setAcyear(String acyear) {
		this.acyear = acyear;
	}

	public byte getIsclosed() {
		return this.isclosed;
	}

	public void setIsclosed(byte isclosed) {
		this.isclosed = isclosed;
	}

	public int getNoOfExam() {
		return this.noOfExam;
	}

	public void setNoOfExam(int noOfExam) {
		this.noOfExam = noOfExam;
	}

	public List<SchSectionName> getSchSectionNames() {
		return this.schSectionNames;
	}

	public void setSchSectionNames(List<SchSectionName> schSectionNames) {
		this.schSectionNames = schSectionNames;
	}

	public SchSectionName addSchSectionName(SchSectionName schSectionName) {
		getSchSectionNames().add(schSectionName);
		schSectionName.setSchAcademicYear(this);

		return schSectionName;
	}

	public SchSectionName removeSchSectionName(SchSectionName schSectionName) {
		getSchSectionNames().remove(schSectionName);
		schSectionName.setSchAcademicYear(null);

		return schSectionName;
	}

	public List<SchStdAttendance> getSchStdAttendances() {
		return this.schStdAttendances;
	}

	public void setSchStdAttendances(List<SchStdAttendance> schStdAttendances) {
		this.schStdAttendances = schStdAttendances;
	}

	public SchStdAttendance addSchStdAttendance(SchStdAttendance schStdAttendance) {
		getSchStdAttendances().add(schStdAttendance);
		schStdAttendance.setSchAcademicYear(this);

		return schStdAttendance;
	}

	public SchStdAttendance removeSchStdAttendance(SchStdAttendance schStdAttendance) {
		getSchStdAttendances().remove(schStdAttendance);
		schStdAttendance.setSchAcademicYear(null);

		return schStdAttendance;
	}

	public List<SchStdMark> getSchStdMarks() {
		return this.schStdMarks;
	}

	public void setSchStdMarks(List<SchStdMark> schStdMarks) {
		this.schStdMarks = schStdMarks;
	}

	public SchStdMark addSchStdMark(SchStdMark schStdMark) {
		getSchStdMarks().add(schStdMark);
		schStdMark.setSchAcademicYear(this);

		return schStdMark;
	}

	public SchStdMark removeSchStdMark(SchStdMark schStdMark) {
		getSchStdMarks().remove(schStdMark);
		schStdMark.setSchAcademicYear(null);

		return schStdMark;
	}

	public List<SchStdRegistration> getSchStdRegistrations() {
		return this.schStdRegistrations;
	}

	public void setSchStdRegistrations(List<SchStdRegistration> schStdRegistrations) {
		this.schStdRegistrations = schStdRegistrations;
	}

	public SchStdRegistration addSchStdRegistration(SchStdRegistration schStdRegistration) {
		getSchStdRegistrations().add(schStdRegistration);
		schStdRegistration.setSchAcademicYear(this);

		return schStdRegistration;
	}

	public SchStdRegistration removeSchStdRegistration(SchStdRegistration schStdRegistration) {
		getSchStdRegistrations().remove(schStdRegistration);
		schStdRegistration.setSchAcademicYear(null);

		return schStdRegistration;
	}

}