package com.bean;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(name = "tbl_users")
public class UserDetails 
{
	 @Id
	 @GeneratedValue
	 private int userId;
	 @Column
	 private String firstName;
	 @Column
	 private String lastName;
	 @Column
	 private String emailId;
	 @NotNull
	// @Size(min=8,message = "password cant be less 8 chars ")
	/*
	 * @Pattern(regexp="(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])" +
	 * "(?=.*[@#$%^&+=])(?=\\S+$).+$", message =
	 * "-password mst contain at least one digit," +
	 * "one lower char and one upperchar,one Special char and doesnt contain spaces"
	 * )
	 */ 
	 @Column
	 private String password;
	 @Column
	 private String mobileNo;
	 @Column
	 private int roleId=3;
	 
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	
	//roleId
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "roleId")
	public int getRoleId() {
		return roleId;
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	 
}
