public class RichestCustomerWealth {
    static int calwealth(int arr[][]) {
        int maxwealth = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum = sum + arr[i][j];
            }
            if (sum > maxwealth) {
                maxwealth = sum;
            }
        }
        return maxwealth;
    }

    public static void main(String[] args) {
        int arr[][] = {
            {1,2,3},
            {9,4,7},
            {5,8,6},
        };
        int ans = calwealth(arr);
        System.out.println(ans);
    }
}
