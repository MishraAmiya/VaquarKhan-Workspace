package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the sch_section_name database table.
 * 
 */
@Entity
@Table(name="sch_section_name")
@NamedQuery(name="SchSectionName.findAll", query="SELECT s FROM SchSectionName s")
public class SchSectionName implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="section_id")
	private int sectionId;

	@Column(name="section_name")
	private String sectionName;

	//bi-directional many-to-one association to SchAcademicYear
	@ManyToOne
	@JoinColumn(name="acyid")
	private SchAcademicYear schAcademicYear;

	//bi-directional many-to-one association to SchClassName
	@ManyToOne
	@JoinColumn(name="class_id")
	private SchClassName schClassName;

	//bi-directional many-to-one association to SchStdAttendance
	@OneToMany(mappedBy="schSectionName")
	private List<SchStdAttendance> schStdAttendances;

	//bi-directional many-to-one association to SchStdMark
	@OneToMany(mappedBy="schSectionName")
	private List<SchStdMark> schStdMarks;

	//bi-directional many-to-one association to SchStdRegistration
	@OneToMany(mappedBy="schSectionName")
	private List<SchStdRegistration> schStdRegistrations;

	//bi-directional many-to-one association to SchTeacherSubAssign
	@OneToMany(mappedBy="schSectionName")
	private List<SchTeacherSubAssign> schTeacherSubAssigns;

	//bi-directional many-to-one association to SchTimeTable
	@OneToMany(mappedBy="schSectionName")
	private List<SchTimeTable> schTimeTables;

	public SchSectionName() {
	}

	public int getSectionId() {
		return this.sectionId;
	}

	public void setSectionId(int sectionId) {
		this.sectionId = sectionId;
	}

	public String getSectionName() {
		return this.sectionName;
	}

	public void setSectionName(String sectionName) {
		this.sectionName = sectionName;
	}

	public SchAcademicYear getSchAcademicYear() {
		return this.schAcademicYear;
	}

	public void setSchAcademicYear(SchAcademicYear schAcademicYear) {
		this.schAcademicYear = schAcademicYear;
	}

	public SchClassName getSchClassName() {
		return this.schClassName;
	}

	public void setSchClassName(SchClassName schClassName) {
		this.schClassName = schClassName;
	}

	public List<SchStdAttendance> getSchStdAttendances() {
		return this.schStdAttendances;
	}

	public void setSchStdAttendances(List<SchStdAttendance> schStdAttendances) {
		this.schStdAttendances = schStdAttendances;
	}

	public SchStdAttendance addSchStdAttendance(SchStdAttendance schStdAttendance) {
		getSchStdAttendances().add(schStdAttendance);
		schStdAttendance.setSchSectionName(this);

		return schStdAttendance;
	}

	public SchStdAttendance removeSchStdAttendance(SchStdAttendance schStdAttendance) {
		getSchStdAttendances().remove(schStdAttendance);
		schStdAttendance.setSchSectionName(null);

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
		schStdMark.setSchSectionName(this);

		return schStdMark;
	}

	public SchStdMark removeSchStdMark(SchStdMark schStdMark) {
		getSchStdMarks().remove(schStdMark);
		schStdMark.setSchSectionName(null);

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
		schStdRegistration.setSchSectionName(this);

		return schStdRegistration;
	}

	public SchStdRegistration removeSchStdRegistration(SchStdRegistration schStdRegistration) {
		getSchStdRegistrations().remove(schStdRegistration);
		schStdRegistration.setSchSectionName(null);

		return schStdRegistration;
	}

	public List<SchTeacherSubAssign> getSchTeacherSubAssigns() {
		return this.schTeacherSubAssigns;
	}

	public void setSchTeacherSubAssigns(List<SchTeacherSubAssign> schTeacherSubAssigns) {
		this.schTeacherSubAssigns = schTeacherSubAssigns;
	}

	public SchTeacherSubAssign addSchTeacherSubAssign(SchTeacherSubAssign schTeacherSubAssign) {
		getSchTeacherSubAssigns().add(schTeacherSubAssign);
		schTeacherSubAssign.setSchSectionName(this);

		return schTeacherSubAssign;
	}

	public SchTeacherSubAssign removeSchTeacherSubAssign(SchTeacherSubAssign schTeacherSubAssign) {
		getSchTeacherSubAssigns().remove(schTeacherSubAssign);
		schTeacherSubAssign.setSchSectionName(null);

		return schTeacherSubAssign;
	}

	public List<SchTimeTable> getSchTimeTables() {
		return this.schTimeTables;
	}

	public void setSchTimeTables(List<SchTimeTable> schTimeTables) {
		this.schTimeTables = schTimeTables;
	}

	public SchTimeTable addSchTimeTable(SchTimeTable schTimeTable) {
		getSchTimeTables().add(schTimeTable);
		schTimeTable.setSchSectionName(this);

		return schTimeTable;
	}

	public SchTimeTable removeSchTimeTable(SchTimeTable schTimeTable) {
		getSchTimeTables().remove(schTimeTable);
		schTimeTable.setSchSectionName(null);

		return schTimeTable;
	}

}