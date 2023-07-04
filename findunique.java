package Questions.java;
// array manipulation

// find the unique number in a given array where all the elements are being
// repeatedtwicw with one value being unique!
// 123
//only positive numbers 
//algorithm
//traverse all pairs 
//equal pairs mark 01 
//Traverse array again 

public class findunique {
    static int findunique(int[] arr){
        int n = arr.length;
        for(int i = 0 ; i<n ; i++){
            for(int j = i+1 ; j++){
                if(arr[i] == arr[j]){
                    arr[i] = -1;
                    arr[j] = -1;
                }
                
            }
        }
        for(int i = 0 ; i<n ; i++){
            if(arr[i] > 0){
                ans = arr[i];
            }
        }
        return ans;
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

        System.out.println("COUNT OF X " + findunique(arr, x));+

    }

}
