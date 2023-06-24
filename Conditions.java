import java.util.*;

public class Conditions {
    /**
     * @param args
     */
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a == b) {
            System.out.println("Equal number");
        } else {
            if (a > b) {
                System.out.println("a is Greater than b");

            } else {
                System.out.println("b ia Greater than a");
            }
        }
    }
}