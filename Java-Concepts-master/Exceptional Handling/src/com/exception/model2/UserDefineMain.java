package com.exception.model2;

import com.exception.mode1.AgeInvalidatorException;

public class UserDefineMain {
	public static void main(String[] args) throws InvalidAgeException {
		AgeValidator ageObj = new AgeValidator();
		ageObj.ageValidation(11);
	}

}
