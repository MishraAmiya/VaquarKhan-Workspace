package com.school.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the sch_teacher_grade database table.
 * 
 */
@Entity
@Table(name="sch_teacher_grade")
@NamedQuery(name="SchTeacherGrade.findAll", query="SELECT s FROM SchTeacherGrade s")
public class SchTeacherGrade implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="teacher_grade_id")
	private int teacherGradeId;

	@Column(name="teacher_grade")
	private String teacherGrade;

	//bi-directional many-to-one association to SchTeacherInfo
	@OneToMany(mappedBy="schTeacherGrade")
	private List<SchTeacherInfo> schTeacherInfos;

	public SchTeacherGrade() {
	}

	public int getTeacherGradeId() {
		return this.teacherGradeId;
	}

	public void setTeacherGradeId(int teacherGradeId) {
		this.teacherGradeId = teacherGradeId;
	}

	public String getTeacherGrade() {
		return this.teacherGrade;
	}

	public void setTeacherGrade(String teacherGrade) {
		this.teacherGrade = teacherGrade;
	}

	public List<SchTeacherInfo> getSchTeacherInfos() {
		return this.schTeacherInfos;
	}

	public void setSchTeacherInfos(List<SchTeacherInfo> schTeacherInfos) {
		this.schTeacherInfos = schTeacherInfos;
	}

	public SchTeacherInfo addSchTeacherInfo(SchTeacherInfo schTeacherInfo) {
		getSchTeacherInfos().add(schTeacherInfo);
		schTeacherInfo.setSchTeacherGrade(this);

		return schTeacherInfo;
	}

	public SchTeacherInfo removeSchTeacherInfo(SchTeacherInfo schTeacherInfo) {
		getSchTeacherInfos().remove(schTeacherInfo);
		schTeacherInfo.setSchTeacherGrade(null);

		return schTeacherInfo;
	}

}