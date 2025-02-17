package Set_3_Exercises;

public class Student {
	private int marks;

	public Student(int marks) {
		// TODO: Assign 'marks' to the instance variable 'this.marks'
	}

	public char assignGrade() {
		if (marks > 100 || marks < 0) {
			return 'Y';
		}
		if (marks >= 90) {
			return 'A';
		}
		if (marks >= 80) {
			return 'B';
		}
		if (marks >= 70) {
			return 'C';
		}
		if (marks >= 60) {
			return 'D';
		}
		if (marks >= 50) {
			return 'E';
		}

		return 'F';
	}
}