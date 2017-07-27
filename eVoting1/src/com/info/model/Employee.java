package com.info.model;

public class Employee {
	private String username;
	private String password;
	private String name;
	private String email;
	private String phone;
	private String gender;
	private String address;
	private String city;
	private String state;
	private String aadhar;
	private String voter_id;
	private String dob;
	private String photo;
	private String country;
	private String pincode;
	private String party_name;
	
	public String getParty_name() {
		return party_name;
	}

	


	public Employee(String aadhar, String voter_id, String party_name) {
		super();
		this.aadhar = aadhar;
		this.voter_id = voter_id;
		this.party_name = party_name;
	}


	public void setParty_name(String party_name) {
		this.party_name = party_name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getAadhar() {
		return aadhar;
	}

	public void setAadhar(String aadhar) {
		this.aadhar = aadhar;
	}

	public String getVoter_id() {
		return voter_id;
	}

	public void setVoter_id(String voter_id) {
		this.voter_id = voter_id;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
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

	public Employee(String username, String password, String name, String email, String phone, String gender,
			String address, String city, String state, String aadhar, String voter_id, String dob, 
			String country, String pincode) {
		super();
		this.username = username;
		this.password = password;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.gender = gender;
		this.address = address;
		this.city = city;
		this.state = state;
		this.aadhar = aadhar;
		this.voter_id = voter_id;
		this.dob = dob;
		/*this.photo = photo;*/
		this.country = country;
		this.pincode = pincode;
	}

	public Employee( String password, String aadhar) {
		super();
	
		this.password = password;
		this.aadhar = aadhar;
	}
	
	
	

}
