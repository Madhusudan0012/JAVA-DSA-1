class ArrayExample01 {
    void multiarrays() {
        int[][] arr_1 = new int[5][3];
        int[][] arr = { { 1, 2, 5 }, { 2, 3, 9 }, { 6, 7, 8 } };
        System.out.println(arr[0][0]);
        System.out.println(arr[0][1]);
        System.out.println(arr[0][2]);
    }

}

// calling a array
public class Main {
    public static void main(String[] args) {
        // ArrayExample obj = newArrayExample();
        obj.multiarrays();
    }
}