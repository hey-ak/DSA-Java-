public class ModifiedBS {
    static int OBS(int arr[], int key) {
        int start = 0;
        int end = arr.length-1;
        boolean isasc = arr[start] < arr[end];
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == key) {
                return mid;

            }
            if (isasc) {
                if (arr[mid] > key) {
                    
                    end = mid - 1;

                } else if (arr[mid] < key) {
                    start = mid + 1;
                }

            } else {
                if (arr[mid] > key) {
                    start = mid + 1;

                } else if (arr[mid] < key) {
                    end = mid - 1;
                }
            }

        }
        return -1;

    }
    public static void main(String[] args) {
        // int arr[] = { 1, 2, 3, 4, 5, 6 };
        int arr[] = { 6,5,4,3,2,1 };
        int key = 5;
        int ans = OBS(arr, key);
        System.out.println(ans);
    }
}