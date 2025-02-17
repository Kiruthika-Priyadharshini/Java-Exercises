package Set_4_Exercises;

public class Factorial {
	public class FactorialCalculator {

		public int calculateFactorial(int number) {
			// Write your code here
			if (number < 0) {
				return -1;
			}
			int factorial = 1;

			for (int i = 2; i <= number; i++) {
				factorial *= i;
			}
			return factorial;
		}
	}

}
