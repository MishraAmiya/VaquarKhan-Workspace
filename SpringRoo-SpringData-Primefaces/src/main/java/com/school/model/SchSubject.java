package com.school.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the sch_subject database table.
 * 
 */
@Entity
@Table(name="sch_subject")
@NamedQuery(name="SchSubject.findAll", query="SELECT s FROM SchSubject s")
public class SchSubject implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="subject_id")
	private int subjectId;

	@Column(name="subject_code")
	private int subjectCode;

	@Column(name="subject_name")
	private String subjectName;

	//bi-directional many-to-one association to SchClassTimeTableLine
	@OneToMany(mappedBy="schSubject")
	private List<SchClassTimeTableLine> schClassTimeTableLines;

	//bi-directional many-to-one association to SchStdMark
	@OneToMany(mappedBy="schSubject")
	private List<SchStdMark> schStdMarks;

	//bi-directional many-to-one association to SchTeacherInfo
	@OneToMany(mappedBy="schSubject")
	private List<SchTeacherInfo> schTeacherInfos;

	//bi-directional many-to-one association to SchTeacherSubAssign
	@OneToMany(mappedBy="schSubject")
	private List<SchTeacherSubAssign> schTeacherSubAssigns;

	public SchSubject() {
	}

	public int getSubjectId() {
		return this.subjectId;
	}

	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}

	public int getSubjectCode() {
		return this.subjectCode;
	}

	public void setSubjectCode(int subjectCode) {
		this.subjectCode = subjectCode;
	}

	public String getSubjectName() {
		return this.subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public List<SchClassTimeTableLine> getSchClassTimeTableLines() {
		return this.schClassTimeTableLines;
	}

	public void setSchClassTimeTableLines(List<SchClassTimeTableLine> schClassTimeTableLines) {
		this.schClassTimeTableLines = schClassTimeTableLines;
	}

	public SchClassTimeTableLine addSchClassTimeTableLine(SchClassTimeTableLine schClassTimeTableLine) {
		getSchClassTimeTableLines().add(schClassTimeTableLine);
		schClassTimeTableLine.setSchSubject(this);

		return schClassTimeTableLine;
	}

	public SchClassTimeTableLine removeSchClassTimeTableLine(SchClassTimeTableLine schClassTimeTableLine) {
		getSchClassTimeTableLines().remove(schClassTimeTableLine);
		schClassTimeTableLine.setSchSubject(null);

		return schClassTimeTableLine;
	}

	public List<SchStdMark> getSchStdMarks() {
		return this.schStdMarks;
	}

	public void setSchStdMarks(List<SchStdMark> schStdMarks) {
		this.schStdMarks = schStdMarks;
	}

	public SchStdMark addSchStdMark(SchStdMark schStdMark) {
		getSchStdMarks().add(schStdMark);
		schStdMark.setSchSubject(this);

		return schStdMark;
	}

	public SchStdMark removeSchStdMark(SchStdMark schStdMark) {
		getSchStdMarks().remove(schStdMark);
		schStdMark.setSchSubject(null);

		return schStdMark;
	}

	public List<SchTeacherInfo> getSchTeacherInfos() {
		return this.schTeacherInfos;
	}

	public void setSchTeacherInfos(List<SchTeacherInfo> schTeacherInfos) {
		this.schTeacherInfos = schTeacherInfos;
	}

	public SchTeacherInfo addSchTeacherInfo(SchTeacherInfo schTeacherInfo) {
		getSchTeacherInfos().add(schTeacherInfo);
		schTeacherInfo.setSchSubject(this);

		return schTeacherInfo;
	}

	public SchTeacherInfo removeSchTeacherInfo(SchTeacherInfo schTeacherInfo) {
		getSchTeacherInfos().remove(schTeacherInfo);
		schTeacherInfo.setSchSubject(null);

		return schTeacherInfo;
	}

	public List<SchTeacherSubAssign> getSchTeacherSubAssigns() {
		return this.schTeacherSubAssigns;
	}

	public void setSchTeacherSubAssigns(List<SchTeacherSubAssign> schTeacherSubAssigns) {
		this.schTeacherSubAssigns = schTeacherSubAssigns;
	}

	public SchTeacherSubAssign addSchTeacherSubAssign(SchTeacherSubAssign schTeacherSubAssign) {
		getSchTeacherSubAssigns().add(schTeacherSubAssign);
		schTeacherSubAssign.setSchSubject(this);

		return schTeacherSubAssign;
	}

	public SchTeacherSubAssign removeSchTeacherSubAssign(SchTeacherSubAssign schTeacherSubAssign) {
		getSchTeacherSubAssigns().remove(schTeacherSubAssign);
		schTeacherSubAssign.setSchSubject(null);

		return schTeacherSubAssign;
	}

}