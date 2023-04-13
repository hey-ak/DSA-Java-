import java.util.Arrays;
import java.util.Scanner;

class Solution {
    public int[] runningSum(int[] nums) {
        int result[] = new int[nums.length];
        int sum = 0;
        for(int i=0; i<nums.length; i++){
            sum = sum + nums[i];
            result[i] = sum;
        }
        return result;
    }
}

public class RunningSumofArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("Enter Elements of Array");
        for (int index = 0; index < arr.length; index++) {
            arr[index] = input.nextInt();
        }
        Solution solution = new Solution();
        int[] result = solution.runningSum(arr);
        System.out.println("Output: " + Arrays.toString(result));
    }
}
