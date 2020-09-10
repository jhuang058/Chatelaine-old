package com.revature.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="user_roles")
public class Role implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="user_role_id", nullable=false)
	private int roleID;
	@Column(name="user_role", nullable=false)
	private String role;
	

	@OneToMany(mappedBy="roleID", fetch=FetchType.LAZY)
	private List<User> userList;


	public Role(String role, List<User> userList) {
		super();
		this.role = role;
		this.userList = userList;
	}


	public Role(int roleID, String role, List<User> userList) {
		super();
		this.roleID = roleID;
		this.role = role;
		this.userList = userList;
	}


	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getRoleID() {
		return roleID;
	}


	public void setRoleID(int roleID) {
		this.roleID = roleID;
	}


	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}


	public List<User> getUserList() {
		return userList;
	}


	public void setUserList(List<User> userList) {
		this.userList = userList;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((role == null) ? 0 : role.hashCode());
		result = prime * result + roleID;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Role other = (Role) obj;
		if (role == null) {
			if (other.role != null)
				return false;
		} else if (!role.equals(other.role))
			return false;
		if (roleID != other.roleID)
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Role [roleID=" + roleID + ", role=" + role + "]";
	}
	
	

}
