package q1;
import java.util.Arrays;
import java.util.Scanner;

public class Q1 {//heba jalil

     public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
        int n=4 ;
       int arr[]=new int[n];
         for (int i = 0; i < n; i++) {
             arr[i]=in.nextInt();
         }
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    
                    int min = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = min;
                }
            }
        }
        for (int number : arr) {
            System.out.print(number + " ");
        }
    }
        
              
              
              
        
}

