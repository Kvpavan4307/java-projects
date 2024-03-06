package com.exception.mode1;

import java.util.Scanner;

public class AgeValidator {

	public static void main(String[] args) throws AgeInvalidatorException{
		Scanner sc = new Scanner(System.in);
		int age =sc.nextInt();
		if(age>=18) {
			System.out.println("right to vote");
		}
		else {
			throw new AgeInvalidatorException();
		}
	}

}
