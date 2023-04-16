public class LinearSearch {
    
    static int linearsearch(int arr[], int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if (element == target) {
                return i;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int target = 4;
        int ans = linearsearch(arr, target);
        System.out.println("The element is present at "+ans+"th"+" index");
    }
}
