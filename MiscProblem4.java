import java.util.Scanner;

public class MiscProblem4 {// swap value program
    // logic is simple you just swap first and last element of array !
    // logic part of the question

    // static void swapWithouttemp(int a, int b) {
    // System.out.println("Origial Values before swap");
    // System.out.println("a: " + a);
    // System.out.println("b:" + b);

    // logic part of this Question
    // method name is Swap
    // Temporary name of Variable

    // int temp = a;
    static void printArray(int[] arr) {
        System.out.println(arr);
    }

    static void swapInArray(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void reverseArray(int[] arr) {
        int i = 0, j = arr.length - 1;

        while (i < j) {
            swapInArray(arr, i, j);
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        int a = 9;
        int b = 3;
        int[] arr = { 1, 2, 3, 4, 5 };
        reverseArray(arr);
        printArray(arr);

    }

}
