package com.owiwi.model;

import com.owiwi.enumeration.Gender;
import com.owiwi.enumeration.EducationLevel;

import java.time.LocalDate;
import java.time.ZonedDateTime;

/**
 * This is how a user looks like...
 */
public class User extends Entity<Long> {

	private String name;
	private Gender gender;

	private EducationLevel educationLevel;

	private String address;

	private LocalDate dateOfBirth;

	public User(Long id, String name, Gender gender, EducationLevel educationLevel, String address, LocalDate dateOfBirth) {
		super(id, ZonedDateTime.now());
		this.name = name;
		this.gender = gender;
		this.educationLevel = educationLevel;
		this.address = address;
		this.dateOfBirth = dateOfBirth;
	}

	public String getName() {
		return name;
	}

	public Gender getGender() {
		return gender;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public String getAddress() {
		return address;
	}

	public EducationLevel getEducationLevel() {
		return educationLevel;
	}
}
