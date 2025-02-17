package Set_6_Exercises;

import java.util.ArrayList;
import java.util.List;

public class NumberMagic2 {
    /**
     * This method generates a list of multiples of a given number less than a specified limit.
     * 
     * @param number the number to find multiples of
     * @param limit the upper bound for the multiples
     * @return a List of multiples of the number less than the limit
     */
    public List<Integer> determineMultiples(int number, int limit) {
        List<Integer> multiples =new ArrayList<Integer>();
        if(number<=0 || limit<=0){
            return multiples;
        }
        for (int i=1;number*i<limit;i++){
            multiples.add(number*i);
            
        }
        return multiples;
        // TODO: Write your code here
    }
}
