package com.school.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the sch_user_role database table.
 * 
 */
@Entity
@Table(name="sch_user_role")
@NamedQuery(name="SchUserRole.findAll", query="SELECT s FROM SchUserRole s")
public class SchUserRole implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="role_id")
	private int roleId;

	@Column(name="role_name")
	private String roleName;

	//bi-directional many-to-one association to SchUser
	@OneToMany(mappedBy="schUserRole")
	private List<SchUser> schUsers;

	public SchUserRole() {
	}

	public int getRoleId() {
		return this.roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return this.roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public List<SchUser> getSchUsers() {
		return this.schUsers;
	}

	public void setSchUsers(List<SchUser> schUsers) {
		this.schUsers = schUsers;
	}

	public SchUser addSchUser(SchUser schUser) {
		getSchUsers().add(schUser);
		schUser.setSchUserRole(this);

		return schUser;
	}

	public SchUser removeSchUser(SchUser schUser) {
		getSchUsers().remove(schUser);
		schUser.setSchUserRole(null);

		return schUser;
	}

}