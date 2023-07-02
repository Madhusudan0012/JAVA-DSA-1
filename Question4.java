package Questions.java;

public class Question4 {
    // check array is sorted or not ?
    // increasing and Drecreseing order..
    // 12345 this type of array is called sortage array;
    static boolean isSorted(int[] arr) {
        boolean check = true;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                // not sorted
                // logic part of sorted question
                check = false;
                break;

            }
        }
        return check;

    }

}
