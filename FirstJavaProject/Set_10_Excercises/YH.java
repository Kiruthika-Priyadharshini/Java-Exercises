package Set_10_Excercises;

enum DaysOfWeek {
	MONDAY("Monday"), TUESDAY("Tuesday"), WEDNESDAY("Wednesday"), THURSDAY("Thursday"), FRIDAY("Friday"),
	SATURDAY("Saturday"), SUNDAY("Sunday");

	private String name;

	DaysOfWeek(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public boolean isWeekday() {
		return !isHoliday();
	}

	public boolean isHoliday() {
		switch (this) {
		case SATURDAY, SUNDAY:
			return true;
		default:
			return false;

		}
	}
}