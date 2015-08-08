package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the sch_std_group database table.
 * 
 */
@Entity
@Table(name="sch_std_group")
@NamedQuery(name="SchStdGroup.findAll", query="SELECT s FROM SchStdGroup s")
public class SchStdGroup implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="group_id")
	private int groupId;

	@Column(name="group_name")
	private String groupName;

	@Column(name="group_status")
	private byte groupStatus;

	//bi-directional many-to-one association to SchStdAttendance
	@OneToMany(mappedBy="schStdGroup")
	private List<SchStdAttendance> schStdAttendances;

	//bi-directional many-to-one association to SchStdMark
	@OneToMany(mappedBy="schStdGroup")
	private List<SchStdMark> schStdMarks;

	//bi-directional many-to-one association to SchStdRegistration
	@OneToMany(mappedBy="schStdGroup")
	private List<SchStdRegistration> schStdRegistrations;

	//bi-directional many-to-one association to SchTimeTable
	@OneToMany(mappedBy="schStdGroup")
	private List<SchTimeTable> schTimeTables;

	public SchStdGroup() {
	}

	public int getGroupId() {
		return this.groupId;
	}

	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}

	public String getGroupName() {
		return this.groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public byte getGroupStatus() {
		return this.groupStatus;
	}

	public void setGroupStatus(byte groupStatus) {
		this.groupStatus = groupStatus;
	}

	public List<SchStdAttendance> getSchStdAttendances() {
		return this.schStdAttendances;
	}

	public void setSchStdAttendances(List<SchStdAttendance> schStdAttendances) {
		this.schStdAttendances = schStdAttendances;
	}

	public SchStdAttendance addSchStdAttendance(SchStdAttendance schStdAttendance) {
		getSchStdAttendances().add(schStdAttendance);
		schStdAttendance.setSchStdGroup(this);

		return schStdAttendance;
	}

	public SchStdAttendance removeSchStdAttendance(SchStdAttendance schStdAttendance) {
		getSchStdAttendances().remove(schStdAttendance);
		schStdAttendance.setSchStdGroup(null);

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
		schStdMark.setSchStdGroup(this);

		return schStdMark;
	}

	public SchStdMark removeSchStdMark(SchStdMark schStdMark) {
		getSchStdMarks().remove(schStdMark);
		schStdMark.setSchStdGroup(null);

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
		schStdRegistration.setSchStdGroup(this);

		return schStdRegistration;
	}

	public SchStdRegistration removeSchStdRegistration(SchStdRegistration schStdRegistration) {
		getSchStdRegistrations().remove(schStdRegistration);
		schStdRegistration.setSchStdGroup(null);

		return schStdRegistration;
	}

	public List<SchTimeTable> getSchTimeTables() {
		return this.schTimeTables;
	}

	public void setSchTimeTables(List<SchTimeTable> schTimeTables) {
		this.schTimeTables = schTimeTables;
	}

	public SchTimeTable addSchTimeTable(SchTimeTable schTimeTable) {
		getSchTimeTables().add(schTimeTable);
		schTimeTable.setSchStdGroup(this);

		return schTimeTable;
	}

	public SchTimeTable removeSchTimeTable(SchTimeTable schTimeTable) {
		getSchTimeTables().remove(schTimeTable);
		schTimeTable.setSchStdGroup(null);

		return schTimeTable;
	}

}