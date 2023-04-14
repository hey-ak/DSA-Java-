import java.util.Scanner;

public class JaggedArray {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Read the number of rows in the jagged array
    System.out.print("Enter the number of rows: ");
    int numRows = scanner.nextInt();

    // Create the jagged array
    int[][] jaggedArray = new int[numRows][];

    // Read the elements of each row
    for (int i = 0; i < numRows; i++) {
      System.out.print("Enter the number of elements in row " + i + ": ");
      int numCols = scanner.nextInt();

      jaggedArray[i] = new int[numCols];

      System.out.print("Enter the elements of row " + i + ": ");
      for (int j = 0; j < numCols; j++) {
        jaggedArray[i][j] = scanner.nextInt();
      }
    }

    // Print the jagged array
    for (int i = 0; i < jaggedArray.length; i++) {
      for (int j = 0; j < jaggedArray[i].length; j++) {
        System.out.print(jaggedArray[i][j] + " ");
      }
      System.out.println();
    }
  }
}