package com.exception.model2;

public class AgeValidator {
	public void ageValidation(int age) throws InvalidAgeException{
	if(age>=18) {
		System.out.println(StringConstantPool.SUCCESS);
	}else {
		throw new InvalidAgeException(StringConstantPool.FAILED);
	}
		
	}

}
