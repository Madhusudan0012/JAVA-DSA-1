import java.util.Scanner;
public class Hare_Tortoise {
    

public static  int findDuplicate(int[] nums){
    int slow = nums[0];
    int fast = nums[0];
    do{
        slow = nums[slow];
        fast = nums[nums[fast]];

    }while(slow!=fast);
    fast = nums[0];
    while(slow!=fast ){
        slow = nums[slow];
        fast = nums[fast];

    }
    return fast;

}
public static void main(String[] args){
    int[] nums = { 1, 2, 2, 3 ,4 ,5};
    findDuplicate(nums);
    System.out.println(nums);
}
}
