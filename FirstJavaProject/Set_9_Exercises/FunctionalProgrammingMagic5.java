package Set_9_Exercises;

import java.util.List;
import java.util.Optional;

public class FunctionalProgrammingMagic5 {

	public static int findMaxEvenNumber(List<Integer> numbers) {
		if (numbers == null) {
			return 0;
		}

		Optional<Integer> maxEven = numbers.stream().filter(number -> number % 2 == 0).max(Integer::compare);

		return maxEven.orElse(0);
	}
}