package com.exercises;

public class TimeConverter {
	public static int convertHoursToMinutes(int hours) {
		// Your task: complete this method
		if (hours < 0) {
			return -1;
		}
		int minutes = hours * 60;
		return minutes;

	}

	public static int convertDaysToMinutes(int days) {
		// Your task: complete this method
		if (days < 0) {
			return -1;
		}

		int minutes = days * 24 * 60;
		return minutes;

	}
}
