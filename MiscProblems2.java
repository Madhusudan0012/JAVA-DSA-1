import java.util.Scanner;

public class MiscProblems2 {
    static void swapWithouttemp(int a, int b) {
        System.out.println("Origial Values before swap");
        System.out.println("a: " + a);
        System.out.println("b:" + b);

        // logic part of this Question
        // method name is Swap
        // Temporary name of Variable

        // int temp = a;
        a = a + b;//logic is a origibnal and changed are used 
        b = a - b;
        a = a - b;
        // a = 3 , b= 9

        System.out.println("Values After Swap");
        System.out.println("a: " + a);
        System.out.println("b: " + b);

    }

    public static void main(String[] args) {
        int a = 9;
        int b = 3;
        int[] arr = { 1, 2, 3, 4, 5 };
        swapWithouttemp(a, b);
    }
}
