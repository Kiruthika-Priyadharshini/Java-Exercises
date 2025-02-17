package Set_9_Exercises;

import java.util.List;

public class FunctionalProgrammingMagic4 {

    public static long sumOfSquares(List<Integer> numbers) {
        
        if (numbers == null)
        {
            
            return 0;
        }
        
        return numbers.stream()
        .mapToLong(number -> number*number)
        .sum();
        // Check if the list is null. If so, return 0.

        // Stream over the list of numbers, find squares and sum them up
    }

}