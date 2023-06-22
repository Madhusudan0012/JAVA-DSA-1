import java.util.*;

public class evenorodd {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        if (X % 2 == 0) {
            System.out.println("Even Number");

        } else {
            System.out.println("Odd Number");
        }
    }
}