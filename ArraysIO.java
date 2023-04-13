import java.util.Arrays;
import java.util.Scanner;

public class ArraysIO {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int arr[] = new int[5];
        System.out.println("Enter Elements of Array");

        for (int index = 0; index < arr.length; index++) {
            arr[index] = input.nextInt();

        }
        System.out.print("Output: ");
        // for (int element : arr) {
        // System.out.print(element+" ");

        // }
        System.out.println(Arrays.toString(arr));// Alternative Way to print Array 
    }

}