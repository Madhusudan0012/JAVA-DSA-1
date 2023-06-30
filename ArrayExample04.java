
//Lecture 15
//Java Array - 2
import java.util.Scanner;

public class ArrayExample04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // loop used to enter value
        System.out.println("Enter the value Array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        // arr[0] = sc.nextInt();
        // arr[1] = sc.nextInt();
        // arr[2] = sc.nextInt();
        System.out.println("Enter the value Array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }

        // System.out.println(arr[0]);
        // System.out.println(arr[1]);
        // System.out.println(arr[2]);
    }
}