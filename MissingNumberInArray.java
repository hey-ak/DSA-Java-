public class MissingNumberInArray {
    static int FindMissingNumber(int arr[]) {
        int n = arr.length+1;
        int sum = n * (n - 1) / 2;
        int arrsum = 0;
        for (int i = 0; i < arr.length-1; i++) {
            arrsum += arr[i];

        }
        return sum - arrsum;
    }

    public static void main(String[] args) {
        int arr [ ] = {1,2,3,5};
        int ans = FindMissingNumber(arr);
        System.out.println(ans);
        
    }
}