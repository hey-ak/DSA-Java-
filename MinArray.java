import java.util.Scanner;

public class MinArray {
    static int minArray(int arr[]) {
        int ans = arr[0];
        
        for (int j = 0; j < arr.length; j++) {
            
            if (arr[j] < ans) {
                ans = arr[j];

            }

        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int arr [] = {1,5,63,25,41,255};
        int result = minArray(arr);
        System.out.println(result);
    }
    
}
