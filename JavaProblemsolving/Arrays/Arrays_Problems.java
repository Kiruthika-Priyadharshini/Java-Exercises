package JavaProblemsolving.Arrays;
import java.util.Arrays;

public class Arrays_Problems {
    static void ArrayDeclaration(){

        int[] numbers; 
      
        numbers = new int[]{10, 20, 30, 40, 50}; 
        System.out.print("Declared Array values are:");
        for (int i = 0; i < numbers.length; i++) {
            
            System.out.print(numbers[i]+" ");
        }
        System.out.println();
    }
    static void ArrayInitialization(){
        int[] arr={1,3,5,4,7};
        System.out.print("Initilized values of arrays: ");
        for (int i: arr) {
            
            System.out.print(i+" ");
        }
        System.out.println();
    }
    static int SumOfArray(){
        int[] arr={1,3,5,4,7};
        int sum=0;
        
        for (int i: arr) {
            sum+=i;
        }
                return sum;
    }
    static double AverageOfArray(){
        int[] arr={1,3,5,4,7};
        int sum=0;
        
        for (int i: arr) {
            sum+=i;
        }
                return sum/arr.length-1;
    }
    static void LargestAndSmallest(){
        int[] arr={8,3,5,-1,4,7};
        Arrays.sort(arr);
        System.out.println("Smallest number in array is: "+arr[0]);
        System.out.println("Smallest number in array is: "+arr[arr.length-1]);
        
    }
    
    static int[] reverseArray(int[] arr){
        int revArr[]= new int[arr.length];
        int j=0;
        for (int i =arr.length-1; i>=0;i--){
            revArr[j]=arr[i];
            j++;
        }
       return revArr;
    }

    static void copyArray(int arr[]){
        int[] copy = Arrays.copyOf(arr, arr.length);

        System.out.println("Copied Array: " + Arrays.toString(copy));

    }
    static void twoDimArray()
    {
        int arr[][]= {{10, 20, 30},{15,45,60},{40, 50,45} };
        for (int i = 0; i < arr.length; i++) { 
            for (int j = 0; j < arr[i].length; j++) { 
                System.out.print(arr[i][j] + " ");  
            }
            System.out.println();
         
        }
    }

    static void diagonalSum(){
        int arr[][]= {{10, 20, 30},{15,45,60},{40, 50,45} };
        int sum=0;
        for (int x =0;x<arr.length;x++){
            sum += arr[x][x];
        }
        System.out.println("Sum of Diagonal elements in an matrix: "+ sum);
    }

    static void bubbleSort(int[] arr) {
         for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }


    public static void main(String[] args) {
        ArrayDeclaration();   
        ArrayInitialization();
        int arrSum=SumOfArray();
        System.out.println("Sum of array:"+arrSum);
        System.out.println("Average of array:"+ AverageOfArray());
        LargestAndSmallest();
        int arr1[]={1,2,3,4,5};
        System.out.println("Reversed array:"+ Arrays.toString(reverseArray(arr1)));
        copyArray(arr1);
        twoDimArray();
        diagonalSum();
        int[] arr = {56, 25, 11, 42, 7};
        bubbleSort(arr);
        

    }

}
