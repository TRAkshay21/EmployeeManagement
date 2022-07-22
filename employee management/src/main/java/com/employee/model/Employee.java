package com.employee.model;

public class Employee {
	
	int employeeId,  underManager;	
	String firstName,lastName,fatherName,gender,emailId,designation,streetAddress,address;
	String state,city,country,pincode,password,rollType;
	long phoneNumber; 
	int age;
	
	public Employee() {
		super();
		// TODO Auto-generated consgetInttructor stub
	}
	
	

	public Employee(int employeeId, String firstName, String lastName) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
	}



	public Employee(String rollType, int underManager, String firstName, String lastName, String fatherName, String gender,
			String emailId, String designation, String streetAddress, String address, String state, String city,
			String country, String pincode, String password, long phoneNumber, int age) {
		super();
		this.rollType = rollType;
		this.underManager = underManager;
		this.firstName = firstName;
		this.lastName = lastName;
		this.fatherName = fatherName;
		this.gender = gender;
		this.emailId = emailId;
		this.designation = designation;
		this.streetAddress = streetAddress;
		this.address = address;
		this.state = state;
		this.city = city;
		this.country = country;
		this.pincode = pincode;
		this.password = password;
		this.phoneNumber = phoneNumber;
		this.age = age;
	}
	
	public Employee(int employeeId, String rollType, int underManager, String firstName, String lastName,
			String fatherName, String gender, String emailId, String designation, String streetAddress, String address,
			String state, String city, String country, String pincode, String password, long phoneNumber, int age) {
		super();
		this.employeeId = employeeId;
		this.rollType = rollType;
		this.underManager = underManager;
		this.firstName = firstName;
		this.lastName = lastName;
		this.fatherName = fatherName;
		this.gender = gender;
		this.emailId = emailId;
		this.designation = designation;
		this.streetAddress = streetAddress;
		this.address = address;
		this.state = state;
		this.city = city;
		this.country = country;
		this.pincode = pincode;
		this.password = password;
		this.phoneNumber = phoneNumber;
		this.age = age;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getRollType() {
		return rollType;
	}

	public void setRollType(String rollType) {
		this.rollType = rollType;
	}

	public int getUnderManager() {
		return underManager;
	}

	public void setUnderManager(int underManager) {
		this.underManager = underManager;
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

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getStreetAddress() {
		return streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", rollType=" + rollType + ", underManager=" + underManager
				+ ", firstName=" + firstName + ", lastName=" + lastName + ", fatherName=" + fatherName + ", gender="
				+ gender + ", emailId=" + emailId + ", designation=" + designation + ", streetAddress=" + streetAddress
				+ ", address=" + address + ", state=" + state + ", city=" + city + ", country=" + country + ", pincode="
				+ pincode + ", password=" + password + ", phoneNumber=" + phoneNumber + ", age=" + age + "]";
	}
	
}
