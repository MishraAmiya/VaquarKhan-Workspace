package com.school.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the sch_class_name database table.
 * 
 */
@Entity
@Table(name="sch_class_name")
@NamedQuery(name="SchClassName.findAll", query="SELECT s FROM SchClassName s")
public class SchClassName implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="class_id")
	private int classId;

	@Column(name="class_name")
	private String className;

	//bi-directional many-to-one association to SchSectionName
	@OneToMany(mappedBy="schClassName")
	private List<SchSectionName> schSectionNames;

	//bi-directional many-to-one association to SchTimeTable
	@OneToMany(mappedBy="schClassName")
	private List<SchTimeTable> schTimeTables;

	public SchClassName() {
	}

	public int getClassId() {
		return this.classId;
	}

	public void setClassId(int classId) {
		this.classId = classId;
	}

	public String getClassName() {
		return this.className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public List<SchSectionName> getSchSectionNames() {
		return this.schSectionNames;
	}

	public void setSchSectionNames(List<SchSectionName> schSectionNames) {
		this.schSectionNames = schSectionNames;
	}

	public SchSectionName addSchSectionName(SchSectionName schSectionName) {
		getSchSectionNames().add(schSectionName);
		schSectionName.setSchClassName(this);

		return schSectionName;
	}

	public SchSectionName removeSchSectionName(SchSectionName schSectionName) {
		getSchSectionNames().remove(schSectionName);
		schSectionName.setSchClassName(null);

		return schSectionName;
	}

	public List<SchTimeTable> getSchTimeTables() {
		return this.schTimeTables;
	}

	public void setSchTimeTables(List<SchTimeTable> schTimeTables) {
		this.schTimeTables = schTimeTables;
	}

	public SchTimeTable addSchTimeTable(SchTimeTable schTimeTable) {
		getSchTimeTables().add(schTimeTable);
		schTimeTable.setSchClassName(this);

		return schTimeTable;
	}

	public SchTimeTable removeSchTimeTable(SchTimeTable schTimeTable) {
		getSchTimeTables().remove(schTimeTable);
		schTimeTable.setSchClassName(null);

		return schTimeTable;
	}

}