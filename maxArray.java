import java.util.Scanner;

public class maxArray {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        int arr[] = { 1, 2, 8, 36, 25, 99, 156 };
        int ans = max(arr);
        System.out.println(ans);
    }

    static int max(int arr[]) {
        int maxval = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxval) {
                maxval = arr[i];

            }

        }
        return maxval;
    }
    
}
