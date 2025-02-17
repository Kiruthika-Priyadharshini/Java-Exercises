package Set_6_Exercises;

public class ArrayMagic4 {

	/**
	 * This method reverses an array.
	 * 
	 * @param array the array to reverse
	 * @return a new array with elements in reverse order
	 */
	public int[] reverseArray(int[] array) {

		if (array.length < 1) {
			return array;
		}

		int start = 0;
		int end = array.length - 1;

		int[] reversedArray = new int[array.length];

		while (start <= end) {
			reversedArray[start] = array[end];
			reversedArray[end] = array[start];
			start++;
			end--;

		}
		return reversedArray;

	}
}