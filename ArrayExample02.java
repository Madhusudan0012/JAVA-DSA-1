class ArrayExample02 {
    void sumOfArray(){
        int[] arr = {1 ,4, 5, 6, 1};
        int sum = 0;

        for(int i =0 ; i<arr.length ; i++){

            sum = sum + arr[i];
        }
        System.out.println(sum);
        
         
    }
}