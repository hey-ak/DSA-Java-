import java.util.Arrays;

public class SwapArray {
    
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Original array: " + Arrays.toString(arr));
        swap(arr, 1, 3);
        System.out.println("Swapped array: " + Arrays.toString(arr));
    }
    
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
