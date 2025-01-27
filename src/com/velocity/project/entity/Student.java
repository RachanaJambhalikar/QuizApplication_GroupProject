package com.velocity.project.entity;

public class Student {

	int studentId;
	String firstName;
	String lastName;
	String userName;
	String password;
	String city;
	String mailId;
	String mobileNumber;

	public Student(int studentId, String firstName, String lastName, String userName, String password, String city,
			String mailId, String mobileNumber) {
	}

	public int getStudentId() {
		return studentId;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getUserName() {
		return userName;
	}

	public String getPassword() {
		return password;
	}

	public String getCity() {
		return city;
	}

	public String getMailId() {
		return mailId;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setMailId(String mailId) {
		this.mailId = mailId;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", firstName=" + firstName + ", lastName=" + lastName + ", userName="
				+ userName + ", password=" + password + ", city=" + city + ", mailId=" + mailId + ", mobileNumber="
				+ mobileNumber + "]";
	}

}