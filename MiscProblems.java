import java.util.Scanner;

public class MiscProblems {
    static void swap(int a, int b) {
        System.out.println("Origial Values before swap");
        System.out.println("a: " + a);
        System.out.println("b:" + b);

        // logic part of this Question
        // method name is Swap
        // Temporary name of Variable

        int temp = a;
        a = b;
        b = temp;
        // a = 3 , b= 9

        System.out.println("Values After Swap");
        System.out.println("a: " + a);
        System.out.println("b: " + b);

    }

    public static void main(String[] args) {
        int a = 9;
        int b = 3;
        int[] arr = { 1, 2, 3, 4, 5 };
        swap(a, b);
    }

}
