package com.example.app.entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Users {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String fullName;
	private String address;
	private String phone;
	private String email;
	private String profilePhotoUrl;
	private String userRole;
	private String userName;
	private Date DoB;
	public Users() {
		super();
	}
	public Users(long id, String fullName, String address, String phone, String email,String profilePhotoUrl, String userRole, String userName, Date DoB) {
		super();
		this.id = id;
		this.fullName = fullName;
		this.address = address;
		this.phone = phone;
		this.email = email;
		this.profilePhotoUrl = profilePhotoUrl;
		this.userRole = userRole;
		this.userName = userName;
		this.DoB = DoB;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getProfilePhotoUrl() {
		return profilePhotoUrl;
	}
	public void setProfilePhotoUrl(String profilePhotoUrl) {
		this.profilePhotoUrl = profilePhotoUrl;
	}
	public String getUserRole() {
		return userRole;
	}
	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Date getDoB() {
		return DoB;
	}
	public void setDoB(Date DoB) {
		this.DoB = DoB;
	}
	@Override
	public String toString() {
		return "Users [id=" + id + ", fullName=" + fullName + ", address=" + address + ", phone=" + phone + ", email="
				+ email + ", profilePhotoUrl=" + profilePhotoUrl + ", userRole=" + userRole + ", userName=" + userName
				+ ", DoB=" + DoB + "]";
	}
}
