
//find the sum of digits ina given number n 
import java.util.*;

public class sumofDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sumofDigits = 0;
        int original_n = n;

        while (n > 0) {
            sumofDigits += n % 10; // logic part of the question
            n = n / 10;
        }
    }
}