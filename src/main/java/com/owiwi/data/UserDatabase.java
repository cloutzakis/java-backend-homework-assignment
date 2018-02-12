package com.owiwi.data;

import com.owiwi.enumeration.EducationLevel;
import com.owiwi.enumeration.Gender;
import com.owiwi.model.User;

import java.text.MessageFormat;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

/**
 * In-Memory User's Database
 */
public class UserDatabase {

	/**
	 * Call this method to generate the users.
	 */
	public static List<User> generateUsers() {
		List<User> out = new ArrayList<User>();

		for (int i = 0; i < 1000; i++) {
			out.add(new User(
					(long) i,
					MessageFormat.format("User{0}", String.valueOf(i)),
					generateGender(i),
					generateEducationLevel(i),
					generateAddress(i),
					generateDob(i)
			));
		}

		return out;
	}

	private static Gender generateGender(int i) {
		if (i % 2 == 0) {
			return Gender.MALE;
		} else if (i % 3 == 0) {
			return Gender.FEMALE;
		} else {
			return Gender.OTHER;
		}
	}

	private static EducationLevel generateEducationLevel(int i) {
		if (i % 2 == 0) {
			return EducationLevel.GRADUATE_EDUCATION;
		} else if (i % 3 == 0) {
			return EducationLevel.HIGHER_EDUCATION;
		} else if (i % 5 == 0) {
			return EducationLevel.POST_GRADUATE_EDUCATION;
		} else if (i % 7 == 0) {
			return EducationLevel.SECONDARY_EDUCATION;
		} else {
			return EducationLevel.POST_SECONDARY_EDUCATION;
		}
	}

	private static LocalDate generateDob(int i) {
		return LocalDate.of(1980 + (i % 25), Month.NOVEMBER, 25);
	}

	private static String generateAddress(int i) {
		if (i % 2 == 0) {
			return "Greece";
		} else if (i % 3 == 0) {
			return "USA";
		} else if (i % 5 == 0) {
			return "Sweden";
		} else if (i % 7 == 0) {
			return "UK";
		} else {
			return "Australia";
		}
	}

}
