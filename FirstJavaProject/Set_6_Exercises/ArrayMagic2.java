package Set_6_Exercises;

public class ArrayMagic2 {

	/**
	 * This method finds and returns the second largest element in the given array.
	 * 
	 * @param array the array in which to find the second largest element
	 * @return the second largest element in the array
	 */

	public int findSecondLargestElement(int[] array) {
		// TODO: Write your code here
		if (array.length == 0) {
			return -1;
		}
		int largestElement = Integer.MIN_VALUE;
		int secondLargestElement = Integer.MIN_VALUE;

		for (int value : array) {
			if (value > largestElement) {
				secondLargestElement = largestElement;
				largestElement = value;
			} else if (value > secondLargestElement && value != largestElement) {
				secondLargestElement = value;
			}
		}
		if (secondLargestElement == Integer.MIN_VALUE) {
			return -1;
		}
		return secondLargestElement;
	}
}
