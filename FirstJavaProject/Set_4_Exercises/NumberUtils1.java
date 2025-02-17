package Set_4_Exercises;

public class NumberUtils1 {

    /**
     * This method calculates and returns the number of digits in a given integer.
     * If the number is negative, it returns -1.
     * If the number is zero, it returns 1 as zero is considered to have one digit.
     * @param number: an integer
     * @return number of digits in number, or -1 if number is negative, or 1 if number is zero.
     */
    public int getNumberOfDigits(int number) {
        if(number<0){
            return -1;
        }
        if(number==0){
            return 1;
        }
        int noOfDigits =0;
        
        while(number>0){
            number=number/10;
            noOfDigits++;
        }
        return noOfDigits;
        // Write your code here
    }
}
