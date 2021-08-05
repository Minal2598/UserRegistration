package com.userregistration;

public class UserRegistrationMain {
	public static void main(String[] args) {
		UserRegistration myObj = new UserRegistration();
		myObj.firstNameValidate();
		myObj.lastNameValidate();
		myObj.emailValidate();
		myObj.mobileValidate();
		myObj.passwordValidate();
	}

}
