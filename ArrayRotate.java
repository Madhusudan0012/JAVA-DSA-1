package Recursion;
import java.util.*;
public class ArrayRotate {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        int k = 98;
        k = k%arr.length;
        print(arr);
        reverse(0 , arr.length-1 , arr);
        reverse(0 , k-1 , arr);
        reverse(k , arr.length -1 , arr);
        print(arr);

    }
    public static void reverse(int si , int ei , int[] arr ){
        int temp = arr[si];
         arr[si]= arr[ei];
         arr[ei] = temp;
         si++;
         ei--;

    }
    public static void print(int[] arr){
        for(int i = 0 ; i<arr.length ; i++){
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }
    
}
