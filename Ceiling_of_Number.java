public class Ceiling_of_Number {

    static int Bs(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > target) {
                mid = start + 1;

            } else if (arr[mid] < target) {
                end = mid - 1;

            } else {
                return target;
            }

        }
        return start;
        

    }
    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 5, 63, 78, 98 };
        int target = 5;
        int ans = Bs(arr, target);
        System.out.println(ans);

    }
    
}
