package school.springdata.jpa.data;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the sch_user database table.
 * 
 */
@Entity
@Table(name="sch_user")
@NamedQuery(name="SchUser.findAll", query="SELECT s FROM SchUser s")
public class SchUser implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="user_id")
	private int userId;

	private byte isactive;

	private String password;

	private String uname;

	//bi-directional many-to-one association to SchStudentInfo
	@OneToMany(mappedBy="schUser")
	private List<SchStudentInfo> schStudentInfos;

	//bi-directional many-to-one association to SchTeacherInfo
	@OneToMany(mappedBy="schUser")
	private List<SchTeacherInfo> schTeacherInfos;

	//bi-directional many-to-one association to SchUserRole
	@ManyToOne
	@JoinColumn(name="role_id")
	private SchUserRole schUserRole;

	public SchUser() {
	}

	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public byte getIsactive() {
		return this.isactive;
	}

	public void setIsactive(byte isactive) {
		this.isactive = isactive;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUname() {
		return this.uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public List<SchStudentInfo> getSchStudentInfos() {
		return this.schStudentInfos;
	}

	public void setSchStudentInfos(List<SchStudentInfo> schStudentInfos) {
		this.schStudentInfos = schStudentInfos;
	}

	public SchStudentInfo addSchStudentInfo(SchStudentInfo schStudentInfo) {
		getSchStudentInfos().add(schStudentInfo);
		schStudentInfo.setSchUser(this);

		return schStudentInfo;
	}

	public SchStudentInfo removeSchStudentInfo(SchStudentInfo schStudentInfo) {
		getSchStudentInfos().remove(schStudentInfo);
		schStudentInfo.setSchUser(null);

		return schStudentInfo;
	}

	public List<SchTeacherInfo> getSchTeacherInfos() {
		return this.schTeacherInfos;
	}

	public void setSchTeacherInfos(List<SchTeacherInfo> schTeacherInfos) {
		this.schTeacherInfos = schTeacherInfos;
	}

	public SchTeacherInfo addSchTeacherInfo(SchTeacherInfo schTeacherInfo) {
		getSchTeacherInfos().add(schTeacherInfo);
		schTeacherInfo.setSchUser(this);

		return schTeacherInfo;
	}

	public SchTeacherInfo removeSchTeacherInfo(SchTeacherInfo schTeacherInfo) {
		getSchTeacherInfos().remove(schTeacherInfo);
		schTeacherInfo.setSchUser(null);

		return schTeacherInfo;
	}

	public SchUserRole getSchUserRole() {
		return this.schUserRole;
	}

	public void setSchUserRole(SchUserRole schUserRole) {
		this.schUserRole = schUserRole;
	}

}