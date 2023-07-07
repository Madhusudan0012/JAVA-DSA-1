import java.util.Scanner;

public class MiscProblems5 {
    // 123456789 this is an array

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr);
        }
    }

    static int[] rotate(int[] arr, int k) { // logic [part of the questions
        int n = arr.length;
        k = k % n;
        int[] ans = new int[n];
        int j = 0;

        for (int i = n - k; i < n; i++) { // original array
            ans[j++] = arr[i];
        }

        for (int i = 0; i < n - k; i++) {
            ans[j++] = arr[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter" + n + "elements ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter K: ");
        int k = sc.nextInt();

        System.out.println("Original array");
        printArray(arr);
        int[] ans = rotate(arr, k);
        System.out.println("Array Aftre the Rotation");
        printArray(ans);

    }

}
