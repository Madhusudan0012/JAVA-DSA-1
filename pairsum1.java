package Questions.java;

//stion5
//target = 07 , ans = (4,3)  and (5,2)

//logic part of Target Sum Problem 

public class pairSum {

    static int pairSum(int[] arr, int target) {
        int n = arr.length;
        int ans = 0;
        for (int i = 0; i < n; i++) { // first number
            for (int j = i + 1; j < n; j++) { // Second Number
                if (arr[i] + arr[j] == target) {
                    ans++;
                }
            }
            return ans;

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enetr" + n + " elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter Target Sum");
        int target = sc.nextInt();

        System.out.println(pairSum(arr, target));

    }
}
