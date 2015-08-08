package school.springdata.jpa.data;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the sch_std_registration database table.
 * 
 */
@Entity
@Table(name="sch_std_registration")
@NamedQuery(name="SchStdRegistration.findAll", query="SELECT s FROM SchStdRegistration s")
public class SchStdRegistration implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="reg_id")
	private int regId;

	@Temporal(TemporalType.DATE)
	@Column(name="reg_date")
	private Date regDate;

	@Column(name="std_roll_no")
	private int stdRollNo;

	//bi-directional many-to-one association to SchRegFee
	@OneToMany(mappedBy="schStdRegistration")
	private List<SchRegFee> schRegFees;

	//bi-directional many-to-one association to SchAcademicYear
	@ManyToOne
	@JoinColumn(name="acyid")
	private SchAcademicYear schAcademicYear;

	//bi-directional many-to-one association to SchStdGroup
	@ManyToOne
	@JoinColumn(name="group_id")
	private SchStdGroup schStdGroup;

	//bi-directional many-to-one association to SchSectionName
	@ManyToOne
	@JoinColumn(name="section_id")
	private SchSectionName schSectionName;

	//bi-directional many-to-one association to SchStudentInfo
	@ManyToOne
	@JoinColumn(name="std_id")
	private SchStudentInfo schStudentInfo;

	public SchStdRegistration() {
	}

	public int getRegId() {
		return this.regId;
	}

	public void setRegId(int regId) {
		this.regId = regId;
	}

	public Date getRegDate() {
		return this.regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public int getStdRollNo() {
		return this.stdRollNo;
	}

	public void setStdRollNo(int stdRollNo) {
		this.stdRollNo = stdRollNo;
	}

	public List<SchRegFee> getSchRegFees() {
		return this.schRegFees;
	}

	public void setSchRegFees(List<SchRegFee> schRegFees) {
		this.schRegFees = schRegFees;
	}

	public SchRegFee addSchRegFee(SchRegFee schRegFee) {
		getSchRegFees().add(schRegFee);
		schRegFee.setSchStdRegistration(this);

		return schRegFee;
	}

	public SchRegFee removeSchRegFee(SchRegFee schRegFee) {
		getSchRegFees().remove(schRegFee);
		schRegFee.setSchStdRegistration(null);

		return schRegFee;
	}

	public SchAcademicYear getSchAcademicYear() {
		return this.schAcademicYear;
	}

	public void setSchAcademicYear(SchAcademicYear schAcademicYear) {
		this.schAcademicYear = schAcademicYear;
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

	public SchStudentInfo getSchStudentInfo() {
		return this.schStudentInfo;
	}

	public void setSchStudentInfo(SchStudentInfo schStudentInfo) {
		this.schStudentInfo = schStudentInfo;
	}

}