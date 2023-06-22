import java.util.*;

public class Pattern4 {

    public static void main(String args[]) {
        int m = 4;
        for (int i = m; i >= 1; i--) {
            // inner Loop
            for (int j = 1; j <= i; j++) {

                System.out.print("#");
            }
            System.out.println();
        }
    }
}
