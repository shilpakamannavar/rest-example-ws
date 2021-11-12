package com.example.rest.ws.ui.model.request;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class UserDetailsRequestModel {
	@NotNull(message ="FirstName Can not be empty")
	private String firstName;
	@NotNull(message ="last Name Can not be empty")
	private String lastName;
	@NotNull(message ="Email Can not be empty")
	@Email
	private String email;
	@NotNull(message ="userID Can not be empty")
	@Size(min=8,max=16, message="Password mush be eequal or greater that 8 characters and less than 16characters")
	private String password;
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
	@Override
	public String toString() {
		return "UserDetailsRequestModel [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", password=" + password + "]";
	}
}
