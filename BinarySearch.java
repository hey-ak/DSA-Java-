public class BinarySearch {
    static int BS(int arr[], int key) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (key < arr[mid]) {
                end = mid - 1;

            } else if (key > arr[mid]) {
                start = mid + 1;

            } else {
                return mid;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 45, 89, 63, 99 };
        int key = 3;
        int ans = BS(arr, key);
        System.out.println(ans);
    }

    
}
