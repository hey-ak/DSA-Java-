import java.util.Arrays;
import java.util.Scanner;

public class SumofArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;

        int arr[] = new int[5];
        System.out.println("Enter Elements of Array");

        for (int index = 0; index < arr.length; index++) {
            arr[index] = input.nextInt();
            sum = sum+arr[index];

        }
        System.out.print("Output: ");
        // for (int element : arr) {
        // System.out.print(element+" ");

        // }
        System.out.println(sum);// Alternative Way to print Array 
    }

}