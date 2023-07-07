public class MiscProblem3 {
    //Reverse an array Consisiteing of integer Values.
    //12345 = 54321
    //Start loop from n-1 
    //ans[i+1]
    //arr[j-1]
    static int[] reverseArray(int[] arr){//method to reverse an Array 
        int n = arr.length;
        int[] ans = new int[n];
        int j = 0;
       
        //traverse orignal array in reverse direction
        //traverse from reverse Direction 
        //n-1 is used to reverse an array
        //made answer array of size of 05 
        //taken variable j =0
        //loop is used for travere of array
        //j intial is 0 a hten go to 4 
        //intial i = 4 and j = 0 ;

        for(int i = n-1 ; i<= 0; i--){
            ans[j++] = arr[i] //a[j++] is optional
            
        }

        static void printArray(int[] arr){
            for(int i = 0 ; i< arr.length ; i++){
                System.out.println(arr[i] + " ");
            }

        }

        public static void main(String[] args){
            int a = 9;
            int b = 3;
            int[] arr = {1,2,3,4,5};
            int[] ans = reverseArray(arr);
            printArray(ans);

                
                }
            
        }

    }
    

