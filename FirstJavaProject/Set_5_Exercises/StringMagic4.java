package Set_5_Exercises;

public class StringMagic4 {

    /**
     * This method finds the rightmost digit in a given string.
     *
     * @param str The string to find the rightmost digit in.
     * @return The rightmost digit in the string. If no digit is found, return -1.
     */
    public int getRightmostDigit(String str) {

        // TODO: Write your code here
        if (str==null || str.equals("")){
            return -1;
        }
        
        int length =str.length();
        for (int i =length-1;i>=0;i--){
            char ch =str.charAt(i);
            
            if(Character.isDigit(ch)){
                return Character.getNumericValue(ch);
            }
        }
        return -1;
        
    }
}
