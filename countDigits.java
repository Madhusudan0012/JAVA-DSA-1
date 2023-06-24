import java.util.Scanner;

public class countDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int numofDigits = 0;

        while (n > 0) {
            n = n / 10;
            numofDigits++;// numofdigits = numofdigits + 1
        }
        System.out.println("Number of digits " + n + "=" + "num of digits");
    }
}
