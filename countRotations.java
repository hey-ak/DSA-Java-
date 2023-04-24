public class countRotations {
    static int CountRotations(int arr[]) {
        int pivot = findpivot(arr);
        return pivot + 1;
    }
    public static int findpivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            } else if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            } else if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        RBS rbs = new RBS();
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        int result = rbs.search(nums, target);
        System.out.println("Index of target element in nums: " + result);
        
    }
    
}
