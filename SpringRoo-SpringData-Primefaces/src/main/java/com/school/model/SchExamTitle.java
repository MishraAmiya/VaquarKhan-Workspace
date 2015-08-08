package com.school.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the sch_exam_title database table.
 * 
 */
@Entity
@Table(name="sch_exam_title")
@NamedQuery(name="SchExamTitle.findAll", query="SELECT s FROM SchExamTitle s")
public class SchExamTitle implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ex_tt_id")
	private int exTtId;

	private String description;

	@Column(name="exam_title")
	private String examTitle;

	//bi-directional many-to-one association to SchStdMark
	@OneToMany(mappedBy="schExamTitle")
	private List<SchStdMark> schStdMarks;

	public SchExamTitle() {
	}

	public int getExTtId() {
		return this.exTtId;
	}

	public void setExTtId(int exTtId) {
		this.exTtId = exTtId;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getExamTitle() {
		return this.examTitle;
	}

	public void setExamTitle(String examTitle) {
		this.examTitle = examTitle;
	}

	public List<SchStdMark> getSchStdMarks() {
		return this.schStdMarks;
	}

	public void setSchStdMarks(List<SchStdMark> schStdMarks) {
		this.schStdMarks = schStdMarks;
	}

	public SchStdMark addSchStdMark(SchStdMark schStdMark) {
		getSchStdMarks().add(schStdMark);
		schStdMark.setSchExamTitle(this);

		return schStdMark;
	}

	public SchStdMark removeSchStdMark(SchStdMark schStdMark) {
		getSchStdMarks().remove(schStdMark);
		schStdMark.setSchExamTitle(null);

		return schStdMark;
	}

}