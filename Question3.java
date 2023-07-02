package Questions.java;

public class Question1 {
    // implementation //method
    static int StrictlyGreater(int[] arr, int x) {
        int lastIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > x) {
                count++;
            }
        }
        return count;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter" + n + "Elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("enter X");
        int x = sc.nextInt();

        System.out.println("COUNT OF X " + StrictlyGreater(arr, x));

    }

}
