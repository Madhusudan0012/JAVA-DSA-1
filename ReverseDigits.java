
//Reverse the Digits of a number 
//input 2346 = 6432 
import java.util.*;

public class ReverseDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);// getting input
        int n = sc.nextInt();
        int reversedNum = 0;
        int ans = 0;

        while (n > 0) {
            ans = ans * 10 + n % 10; // Logic Part of Questions
            n /= 10;
        }
        System.out.println(ans);
    }
}