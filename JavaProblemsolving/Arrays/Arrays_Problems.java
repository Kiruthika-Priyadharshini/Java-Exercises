package JavaProblemsolving.Arrays;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

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
            System.out.println(num + " ");
        }
    }

    static int searchArray(int [] arr, int num){
        // int[] arr={2,3,3,4,1};
        // int num =4;
        for (int i=0;i<=arr.length;i++){
            if (arr[i]==num){
                return i;
            }
        }
                return 0;
    }


    static void dynammicArray(){
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter total number of elements");
        int n=sc.nextInt();

        int[] arr= new int[n];
        System.out.println("Enter" + n + "elements");

        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();

        }
        System.out.println("Array Created"+ Arrays.toString(arr));
        
    }

    static void frequencyCount(){
        int[] arr = {10, 20, 10, 30, 20, 40, 10};
        for (int i=0;i<arr.length;i++){
            int count=1;
            if (arr[i]==-1){
                continue;
            }
            for (int j=i+1;j<arr.length;j++){
                if (arr[i]==arr[j]){
                    count++;
                    arr[j]=-1;
                }
            }
            System.out.println(arr[i]+ "-"+ count);
        }

    }

    static void rotateArray() {
        int[] arr = {10, 20, 10, 30, 20, 40, 10};
        int num=2;

        for (int i = 0; i < num; i++) {
            int temp = arr[arr.length - 1];
            for (int j = arr.length - 1; j > 0; j--) {
                arr[j] = arr[j - 1]; 
            }
            arr[0] = temp; 
        }

        System.out.print("Rotated array: ");
        for (int n : arr) {
            System.out.println(n + " ");
        }
    }
    static int[] mergeArrays(int[] arr1, int[] arr2) {
        int[] merged = new int[arr1.length + arr2.length];
        int index = 0;
        for (int i = 0; i < arr1.length; i++) {
            merged[index] = arr1[i];
            index++; 
        }
        for (int i = 0; i < arr2.length; i++) {
            merged[index] = arr2[i];
            index++; 
        }
        return merged;
    }
    
    static void findDuplicates(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("The duplicate is "+ arr[i]);
                }
            }
        }
    }

    static ArrayList<Integer> arrayToList(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int num : arr) {
            list.add(num);   
        }
        return list;
    }

    static int[] listToArray(ArrayList<Integer> list) {
        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }

    static void findSubarraySum(int[] arr, int target) {

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;

            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum == target) {
                    System.out.println("Subarray: ");
                    for (int k = i; k <= j; k++) {
                        System.out.print(arr[k] + " ");
                    }
                    System.out.println();
                }
            }
        }
    } 
    static void transposeMatrix(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int[][] transpose = new int[col][row];

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                transpose[j][i] =matrix[i][j];
            }    
        }
        for(int i=0;i<col;i++){
            for(int j=0;j<row;j++){
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
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
        
        int[] arr2={2,3,3,4,1};
        System.out.println("Searching an element in an array"+ searchArray(arr2,4));

        dynammicArray();
        frequencyCount();

        rotateArray();

        System.out.println(Arrays.toString(mergeArrays(arr1, arr2)));
        findDuplicates(arr2);
        
        System.out.println((arrayToList(arr)));

        findSubarraySum(new int[]{1, 2, 3, 4, 5}, 7);

        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        transposeMatrix(matrix);


    }

}
