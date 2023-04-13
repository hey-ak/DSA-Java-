import java.util.Scanner;

public class MultiDimArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input for the size of the 2D array
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = sc.nextInt();

        // Creating the 2D array based on user input
        int[][] arr = new int[rows][cols];

        // Taking user input for the elements of the 2D array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Printing the 2D array
        System.out.println("The 2D array is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}