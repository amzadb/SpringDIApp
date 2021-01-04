package com.spring.practice;

public class User {
	private String firstName;
	private String lastName;
	private String profession;
	private Long contactNo;

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

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public Long getContactNo() {
		return contactNo;
	}

	public void setContactNo(Long contactNo) {
		this.contactNo = contactNo;
	}

	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + ", profession=" + profession + ", contactNo="
				+ contactNo + "]";
	}

	public User() {

	}

	public User(String firstName, String lastName, String profession, Long contactNo) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.profession = profession;
		this.contactNo = contactNo;
	}

}
