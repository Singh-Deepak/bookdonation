package com.bookdonation.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="user_details")
public class UserDetails {
	@Column(name="first_name")
	@NotNull
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="mobile_number")
	@NotNull
	private Integer mobileNumber;
	
	@Id
	@Column(name="email_address")
	private String emailAddress;
	
	@Column(name="pswd")
	@NotNull
	private String password;
	
	@Column(name="address")
	private String address;
	
	@Column(name="pin_code")
	@NotNull
	private Integer pinCode;
	
	@Column(name="no_of_books_donated")
	private Integer noOfBooksDonated;
	
	@Column(name="gender")
	private String gender;
	
	@Column(name="user_type")
	@NotNull
	private String userType;

	public UserDetails(@NotNull String firstName, String lastName, @NotNull Integer mobileNumber, String emailAddress,
			@NotNull String password, String address, @NotNull Integer pinCode, Integer noOfBooksDonated, String gender,
			@NotNull String userType) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobileNumber = mobileNumber;
		this.emailAddress = emailAddress;
		this.password = password;
		this.address = address;
		this.pinCode = pinCode;
		this.noOfBooksDonated = noOfBooksDonated;
		this.gender = gender;
		this.userType = userType;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public UserDetails(@NotNull String firstName, String lastName, @NotNull Integer mobileNumber, String emailAddress,
			@NotNull String password, String address, @NotNull Integer pinCode, Integer noOfBooksDonated,
			String gender) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobileNumber = mobileNumber;
		this.emailAddress = emailAddress;
		this.password = password;
		this.address = address;
		this.pinCode = pinCode;
		this.noOfBooksDonated = noOfBooksDonated;
		this.gender = gender;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
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

	public Integer getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(Integer mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getPinCode() {
		return pinCode;
	}

	public void setPinCode(Integer pinCode) {
		this.pinCode = pinCode;
	}

	public Integer getNoOfBooksDonated() {
		return noOfBooksDonated;
	}

	public void setNoOfBooksDonated(Integer noOfBooksDonated) {
		this.noOfBooksDonated = noOfBooksDonated;
	}

	public UserDetails(String firstName, String lastName, Integer mobileNumber, String emailAddress, String password,
			String address, Integer pinCode, Integer noOfBooksDonated) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobileNumber = mobileNumber;
		this.emailAddress = emailAddress;
		this.password = password;
		this.address = address;
		this.pinCode = pinCode;
		this.noOfBooksDonated = noOfBooksDonated;
	}

	@Override
	public String toString() {
		return "UserDetails [firstName=" + firstName + ", lastName=" + lastName + ", mobileNumber=" + mobileNumber
				+ ", emailAddress=" + emailAddress + ", password=" + password + ", address=" + address + ", pinCode="
				+ pinCode + ", noOfBooksDonated=" + noOfBooksDonated + "]";
	}

}
