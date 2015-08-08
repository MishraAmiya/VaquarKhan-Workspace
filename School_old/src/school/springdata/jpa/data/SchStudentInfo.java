package school.springdata.jpa.data;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the sch_student_info database table.
 * 
 */
@Entity
@Table(name="sch_student_info")
@NamedQuery(name="SchStudentInfo.findAll", query="SELECT s FROM SchStudentInfo s")
public class SchStudentInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="std_id")
	private int stdId;

	@Column(name="std_age")
	private int stdAge;

	@Temporal(TemporalType.DATE)
	@Column(name="std_dob")
	private Date stdDob;

	@Column(name="std_father_name")
	private String stdFatherName;

	@Column(name="std_gender")
	private String stdGender;

	@Column(name="std_mother_name")
	private String stdMotherName;

	@Column(name="std_name")
	private String stdName;

	@Lob
	@Column(name="std_photo")
	private byte[] stdPhoto;

	@Column(name="std_status")
	private byte stdStatus;

	//bi-directional many-to-one association to SchStdAttendance
	@OneToMany(mappedBy="schStudentInfo")
	private List<SchStdAttendance> schStdAttendances;

	//bi-directional many-to-one association to SchStdContactInfo
	@OneToMany(mappedBy="schStudentInfo")
	private List<SchStdContactInfo> schStdContactInfos;

	//bi-directional many-to-one association to SchStdRegistration
	@OneToMany(mappedBy="schStudentInfo")
	private List<SchStdRegistration> schStdRegistrations;

	//bi-directional many-to-one association to SchUser
	@ManyToOne
	@JoinColumn(name="user_id")
	private SchUser schUser;

	public SchStudentInfo() {
	}

	public int getStdId() {
		return this.stdId;
	}

	public void setStdId(int stdId) {
		this.stdId = stdId;
	}

	public int getStdAge() {
		return this.stdAge;
	}

	public void setStdAge(int stdAge) {
		this.stdAge = stdAge;
	}

	public Date getStdDob() {
		return this.stdDob;
	}

	public void setStdDob(Date stdDob) {
		this.stdDob = stdDob;
	}

	public String getStdFatherName() {
		return this.stdFatherName;
	}

	public void setStdFatherName(String stdFatherName) {
		this.stdFatherName = stdFatherName;
	}

	public String getStdGender() {
		return this.stdGender;
	}

	public void setStdGender(String stdGender) {
		this.stdGender = stdGender;
	}

	public String getStdMotherName() {
		return this.stdMotherName;
	}

	public void setStdMotherName(String stdMotherName) {
		this.stdMotherName = stdMotherName;
	}

	public String getStdName() {
		return this.stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	public byte[] getStdPhoto() {
		return this.stdPhoto;
	}

	public void setStdPhoto(byte[] stdPhoto) {
		this.stdPhoto = stdPhoto;
	}

	public byte getStdStatus() {
		return this.stdStatus;
	}

	public void setStdStatus(byte stdStatus) {
		this.stdStatus = stdStatus;
	}

	public List<SchStdAttendance> getSchStdAttendances() {
		return this.schStdAttendances;
	}

	public void setSchStdAttendances(List<SchStdAttendance> schStdAttendances) {
		this.schStdAttendances = schStdAttendances;
	}

	public SchStdAttendance addSchStdAttendance(SchStdAttendance schStdAttendance) {
		getSchStdAttendances().add(schStdAttendance);
		schStdAttendance.setSchStudentInfo(this);

		return schStdAttendance;
	}

	public SchStdAttendance removeSchStdAttendance(SchStdAttendance schStdAttendance) {
		getSchStdAttendances().remove(schStdAttendance);
		schStdAttendance.setSchStudentInfo(null);

		return schStdAttendance;
	}

	public List<SchStdContactInfo> getSchStdContactInfos() {
		return this.schStdContactInfos;
	}

	public void setSchStdContactInfos(List<SchStdContactInfo> schStdContactInfos) {
		this.schStdContactInfos = schStdContactInfos;
	}

	public SchStdContactInfo addSchStdContactInfo(SchStdContactInfo schStdContactInfo) {
		getSchStdContactInfos().add(schStdContactInfo);
		schStdContactInfo.setSchStudentInfo(this);

		return schStdContactInfo;
	}

	public SchStdContactInfo removeSchStdContactInfo(SchStdContactInfo schStdContactInfo) {
		getSchStdContactInfos().remove(schStdContactInfo);
		schStdContactInfo.setSchStudentInfo(null);

		return schStdContactInfo;
	}

	public List<SchStdRegistration> getSchStdRegistrations() {
		return this.schStdRegistrations;
	}

	public void setSchStdRegistrations(List<SchStdRegistration> schStdRegistrations) {
		this.schStdRegistrations = schStdRegistrations;
	}

	public SchStdRegistration addSchStdRegistration(SchStdRegistration schStdRegistration) {
		getSchStdRegistrations().add(schStdRegistration);
		schStdRegistration.setSchStudentInfo(this);

		return schStdRegistration;
	}

	public SchStdRegistration removeSchStdRegistration(SchStdRegistration schStdRegistration) {
		getSchStdRegistrations().remove(schStdRegistration);
		schStdRegistration.setSchStudentInfo(null);

		return schStdRegistration;
	}

	public SchUser getSchUser() {
		return this.schUser;
	}

	public void setSchUser(SchUser schUser) {
		this.schUser = schUser;
	}

}