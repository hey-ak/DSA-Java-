import java.util.Arrays;
import java.util.Scanner;

public class MergeArrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n ,m;
        System.out.println("Enter Size of First Array");
        n = input.nextInt();
        System.out.println("Enter Size of second Array");
        m = input.nextInt();

        int arr1[] = new int[n];
        System.out.println("Enter Elements of  First Array");

        for (int index = 0; index < arr1.length; index++) {
            arr1[index] = input.nextInt();

        }
        int arr2[] = new int[m];
        System.out.println("Enter Elements of  Second Array");

        for (int index = 0; index < arr2.length; index++) {
            arr2[index] = input.nextInt();

        }
        int s = n+m;
        int arr3[] = new int[s];

        System.out.print("Output: ");

        for (int i = 0; i < n; i++) {
            arr3[i] = arr1[i];

        }
        for (int i = 0; i < m; i++) {
            arr3[n + i] = arr2[i];
            
        }
        System.out.println(Arrays.toString(arr3));
        // for (int element : arr) {
        // System.out.print(element+" ");

        //// Alternative Way to print Array 
    }

}