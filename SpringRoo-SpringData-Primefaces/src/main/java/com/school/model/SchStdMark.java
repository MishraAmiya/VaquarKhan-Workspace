package com.school.model;


import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the sch_std_marks database table.
 * 
 */
@Entity
@Table(name="sch_std_marks")
@NamedQuery(name="SchStdMark.findAll", query="SELECT s FROM SchStdMark s")
public class SchStdMark implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="marks_id")
	private int marksId;

	@Column(name="marks_obtain")
	private int marksObtain;

	@Column(name="std_roll_no")
	private int stdRollNo;

	@Column(name="sub_grade")
	private String subGrade;

	//bi-directional many-to-one association to SchAcademicYear
	@ManyToOne
	@JoinColumn(name="acyid")
	private SchAcademicYear schAcademicYear;

	//bi-directional many-to-one association to SchExamTitle
	@ManyToOne
	@JoinColumn(name="ex_tt_id")
	private SchExamTitle schExamTitle;

	//bi-directional many-to-one association to SchStdGroup
	@ManyToOne
	@JoinColumn(name="group_id")
	private SchStdGroup schStdGroup;

	//bi-directional many-to-one association to SchSectionName
	@ManyToOne
	@JoinColumn(name="section_id")
	private SchSectionName schSectionName;

	//bi-directional many-to-one association to SchSubject
	@ManyToOne
	@JoinColumn(name="subject_id")
	private SchSubject schSubject;

	public SchStdMark() {
	}

	public int getMarksId() {
		return this.marksId;
	}

	public void setMarksId(int marksId) {
		this.marksId = marksId;
	}

	public int getMarksObtain() {
		return this.marksObtain;
	}

	public void setMarksObtain(int marksObtain) {
		this.marksObtain = marksObtain;
	}

	public int getStdRollNo() {
		return this.stdRollNo;
	}

	public void setStdRollNo(int stdRollNo) {
		this.stdRollNo = stdRollNo;
	}

	public String getSubGrade() {
		return this.subGrade;
	}

	public void setSubGrade(String subGrade) {
		this.subGrade = subGrade;
	}

	public SchAcademicYear getSchAcademicYear() {
		return this.schAcademicYear;
	}

	public void setSchAcademicYear(SchAcademicYear schAcademicYear) {
		this.schAcademicYear = schAcademicYear;
	}

	public SchExamTitle getSchExamTitle() {
		return this.schExamTitle;
	}

	public void setSchExamTitle(SchExamTitle schExamTitle) {
		this.schExamTitle = schExamTitle;
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

	public SchSubject getSchSubject() {
		return this.schSubject;
	}

	public void setSchSubject(SchSubject schSubject) {
		this.schSubject = schSubject;
	}

}