package Set_4_Exercises;

public class NumberUtils {

    public int getLastDigit(int number) {
        if(number<0){
            return -1;
        }
        return number%10;
    }
}
