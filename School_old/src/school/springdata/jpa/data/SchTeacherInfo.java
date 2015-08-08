package school.springdata.jpa.data;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the sch_teacher_info database table.
 * 
 */
@Entity
@Table(name="sch_teacher_info")
@NamedQuery(name="SchTeacherInfo.findAll", query="SELECT s FROM SchTeacherInfo s")
public class SchTeacherInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="teacher_id")
	private int teacherId;

	@Column(name="depart_date")
	private String departDate;

	private byte ispresent;

	@Column(name="teacher_addr")
	private String teacherAddr;

	@Column(name="teacher_email")
	private String teacherEmail;

	@Temporal(TemporalType.DATE)
	@Column(name="teacher_join_date")
	private Date teacherJoinDate;

	@Column(name="teacher_mobile")
	private String teacherMobile;

	@Column(name="teacher_name")
	private String teacherName;

	@Lob
	@Column(name="teacher_photo")
	private byte[] teacherPhoto;

	//bi-directional many-to-one association to SchClassTimeTableLine
	@OneToMany(mappedBy="schTeacherInfo")
	private List<SchClassTimeTableLine> schClassTimeTableLines;

	//bi-directional many-to-one association to SchSubject
	@ManyToOne
	@JoinColumn(name="subject_id")
	private SchSubject schSubject;

	//bi-directional many-to-one association to SchTeacherGrade
	@ManyToOne
	@JoinColumn(name="teacher_grade_id")
	private SchTeacherGrade schTeacherGrade;

	//bi-directional many-to-one association to SchUser
	@ManyToOne
	@JoinColumn(name="user_id")
	private SchUser schUser;

	//bi-directional many-to-one association to SchTeacherSubAssign
	@OneToMany(mappedBy="schTeacherInfo")
	private List<SchTeacherSubAssign> schTeacherSubAssigns;

	public SchTeacherInfo() {
	}

	public int getTeacherId() {
		return this.teacherId;
	}

	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}

	public String getDepartDate() {
		return this.departDate;
	}

	public void setDepartDate(String departDate) {
		this.departDate = departDate;
	}

	public byte getIspresent() {
		return this.ispresent;
	}

	public void setIspresent(byte ispresent) {
		this.ispresent = ispresent;
	}

	public String getTeacherAddr() {
		return this.teacherAddr;
	}

	public void setTeacherAddr(String teacherAddr) {
		this.teacherAddr = teacherAddr;
	}

	public String getTeacherEmail() {
		return this.teacherEmail;
	}

	public void setTeacherEmail(String teacherEmail) {
		this.teacherEmail = teacherEmail;
	}

	public Date getTeacherJoinDate() {
		return this.teacherJoinDate;
	}

	public void setTeacherJoinDate(Date teacherJoinDate) {
		this.teacherJoinDate = teacherJoinDate;
	}

	public String getTeacherMobile() {
		return this.teacherMobile;
	}

	public void setTeacherMobile(String teacherMobile) {
		this.teacherMobile = teacherMobile;
	}

	public String getTeacherName() {
		return this.teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public byte[] getTeacherPhoto() {
		return this.teacherPhoto;
	}

	public void setTeacherPhoto(byte[] teacherPhoto) {
		this.teacherPhoto = teacherPhoto;
	}

	public List<SchClassTimeTableLine> getSchClassTimeTableLines() {
		return this.schClassTimeTableLines;
	}

	public void setSchClassTimeTableLines(List<SchClassTimeTableLine> schClassTimeTableLines) {
		this.schClassTimeTableLines = schClassTimeTableLines;
	}

	public SchClassTimeTableLine addSchClassTimeTableLine(SchClassTimeTableLine schClassTimeTableLine) {
		getSchClassTimeTableLines().add(schClassTimeTableLine);
		schClassTimeTableLine.setSchTeacherInfo(this);

		return schClassTimeTableLine;
	}

	public SchClassTimeTableLine removeSchClassTimeTableLine(SchClassTimeTableLine schClassTimeTableLine) {
		getSchClassTimeTableLines().remove(schClassTimeTableLine);
		schClassTimeTableLine.setSchTeacherInfo(null);

		return schClassTimeTableLine;
	}

	public SchSubject getSchSubject() {
		return this.schSubject;
	}

	public void setSchSubject(SchSubject schSubject) {
		this.schSubject = schSubject;
	}

	public SchTeacherGrade getSchTeacherGrade() {
		return this.schTeacherGrade;
	}

	public void setSchTeacherGrade(SchTeacherGrade schTeacherGrade) {
		this.schTeacherGrade = schTeacherGrade;
	}

	public SchUser getSchUser() {
		return this.schUser;
	}

	public void setSchUser(SchUser schUser) {
		this.schUser = schUser;
	}

	public List<SchTeacherSubAssign> getSchTeacherSubAssigns() {
		return this.schTeacherSubAssigns;
	}

	public void setSchTeacherSubAssigns(List<SchTeacherSubAssign> schTeacherSubAssigns) {
		this.schTeacherSubAssigns = schTeacherSubAssigns;
	}

	public SchTeacherSubAssign addSchTeacherSubAssign(SchTeacherSubAssign schTeacherSubAssign) {
		getSchTeacherSubAssigns().add(schTeacherSubAssign);
		schTeacherSubAssign.setSchTeacherInfo(this);

		return schTeacherSubAssign;
	}

	public SchTeacherSubAssign removeSchTeacherSubAssign(SchTeacherSubAssign schTeacherSubAssign) {
		getSchTeacherSubAssigns().remove(schTeacherSubAssign);
		schTeacherSubAssign.setSchTeacherInfo(null);

		return schTeacherSubAssign;
	}

}