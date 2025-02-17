package Set_4_Exercises;

public class NumberUtils3 {

    /**
     * This method reverses a given integer and returns the reversed number.
     * If the number is negative, it returns -1 as the reverse of a negative number is undefined.
     * If the number is zero, it returns 0 as the reverse of 0 is 0.
     * @param number: an integer
     * @return reversed number, or -1 if number is negative, or 0 if number is zero.
     */
    public int reverseNumber(int number) {
        if(number<0){
            return -1;
        }
        if(number==0){
            return 0;
        }
        int reverseNumber =0;
        
        while(number>0){
            int digit=number%10;
            reverseNumber=reverseNumber*10+digit;
            number/=10;
            System.out.printf("digit-%d number-%d reversedNumber-%d",digit,number,reverseNumber).println();
        }
        return reverseNumber;
        // Write your code here
    }
}

