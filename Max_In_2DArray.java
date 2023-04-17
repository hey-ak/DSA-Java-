import java.util.Arrays;

public class Max_In_2DArray {
    static int max(int arr[][]) {
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];

                }

            }

        }
        return max;
        
    }
    public static void main(String[] args) {
        int arr[][]= {
            {1,2,3},
            {4,5,6},
            {85,78,69},
        };
        
        int ans = max(arr);
        System.out.println(ans);
    }
    
}
