package com.school.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the sch_time_table database table.
 * 
 */
@Entity
@Table(name="sch_time_table")
@NamedQuery(name="SchTimeTable.findAll", query="SELECT s FROM SchTimeTable s")
public class SchTimeTable implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int ttid;

	//bi-directional many-to-one association to SchClassTimeTableLine
	@OneToMany(mappedBy="schTimeTable")
	private List<SchClassTimeTableLine> schClassTimeTableLines;

	//bi-directional many-to-one association to SchClassName
	@ManyToOne
	@JoinColumn(name="class_id")
	private SchClassName schClassName;

	//bi-directional many-to-one association to SchStdGroup
	@ManyToOne
	@JoinColumn(name="group_id")
	private SchStdGroup schStdGroup;

	//bi-directional many-to-one association to SchSectionName
	@ManyToOne
	@JoinColumn(name="section_id")
	private SchSectionName schSectionName;

	public SchTimeTable() {
	}

	public int getTtid() {
		return this.ttid;
	}

	public void setTtid(int ttid) {
		this.ttid = ttid;
	}

	public List<SchClassTimeTableLine> getSchClassTimeTableLines() {
		return this.schClassTimeTableLines;
	}

	public void setSchClassTimeTableLines(List<SchClassTimeTableLine> schClassTimeTableLines) {
		this.schClassTimeTableLines = schClassTimeTableLines;
	}

	public SchClassTimeTableLine addSchClassTimeTableLine(SchClassTimeTableLine schClassTimeTableLine) {
		getSchClassTimeTableLines().add(schClassTimeTableLine);
		schClassTimeTableLine.setSchTimeTable(this);

		return schClassTimeTableLine;
	}

	public SchClassTimeTableLine removeSchClassTimeTableLine(SchClassTimeTableLine schClassTimeTableLine) {
		getSchClassTimeTableLines().remove(schClassTimeTableLine);
		schClassTimeTableLine.setSchTimeTable(null);

		return schClassTimeTableLine;
	}

	public SchClassName getSchClassName() {
		return this.schClassName;
	}

	public void setSchClassName(SchClassName schClassName) {
		this.schClassName = schClassName;
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

}