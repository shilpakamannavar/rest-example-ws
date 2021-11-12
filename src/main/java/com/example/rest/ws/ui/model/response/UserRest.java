package com.example.rest.ws.ui.model.response;

public class UserRest {
	
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	private String firstName;
	@Override
	public String toString() {
		return "UserRest [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", userId=" + password
				+ "]";
	}
	private String lastName;
	private String email;
	private String password;

}
