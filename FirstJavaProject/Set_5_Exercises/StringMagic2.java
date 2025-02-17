package Set_5_Exercises;

public class StringMagic2 {

    /**
     * This method checks if a given string has two consecutive identical characters.
     *
     * @param str The string to check for consecutive duplicates.
     * @return true if the string has consecutive duplicates, false otherwise.
     */
    public boolean hasConsecutiveDuplicates(String str) {
        
        // TODO: Write your code here
        for(int i =0;i<str.length()-1;i++){
            char currentCharacter = str.charAt(i);
            char nextCharacter = str.charAt(i+1);
            
            if(currentCharacter == nextCharacter){
                return true;
            }
            
        }
        return false;
    }
}