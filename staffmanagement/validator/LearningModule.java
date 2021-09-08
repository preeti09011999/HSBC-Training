package com.hsbc.staffmanagement.validator;

import com.hsbc.staffmanagement.exception.InvalidAgeException;
import com.hsbc.staffmanagement.exception.WrongInputException;

public class LearningModule {
	public String getLearningCode(String name, int age) throws WrongInputException, InvalidAgeException{
		AgeValidator ageValidate = new AgeValidator();
		if(ageValidate.getAgeCode(age).equals("Adult") || ageValidate.getAgeCode(age).equals("Child")) {
			return name + age;
		}else throw new WrongInputException("Wrong Inputs");
	}
}
