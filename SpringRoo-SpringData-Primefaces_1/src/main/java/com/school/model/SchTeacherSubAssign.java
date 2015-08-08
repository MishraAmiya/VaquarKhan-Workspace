package com.school.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the sch_teacher_sub_assign database table.
 * 
 */
@Entity
@Table(name="sch_teacher_sub_assign")
@NamedQuery(name="SchTeacherSubAssign.findAll", query="SELECT s FROM SchTeacherSubAssign s")
public class SchTeacherSubAssign implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="teach_sub_assign_id")
	private int teachSubAssignId;

	//bi-directional many-to-one association to SchSectionName
	@ManyToOne
	@JoinColumn(name="section_id")
	private SchSectionName schSectionName;

	//bi-directional many-to-one association to SchSubject
	@ManyToOne
	@JoinColumn(name="subject_id")
	private SchSubject schSubject;

	//bi-directional many-to-one association to SchTeacherInfo
	@ManyToOne
	@JoinColumn(name="teacher_id")
	private SchTeacherInfo schTeacherInfo;

	public SchTeacherSubAssign() {
	}

	public int getTeachSubAssignId() {
		return this.teachSubAssignId;
	}

	public void setTeachSubAssignId(int teachSubAssignId) {
		this.teachSubAssignId = teachSubAssignId;
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

	public SchTeacherInfo getSchTeacherInfo() {
		return this.schTeacherInfo;
	}

	public void setSchTeacherInfo(SchTeacherInfo schTeacherInfo) {
		this.schTeacherInfo = schTeacherInfo;
	}

}