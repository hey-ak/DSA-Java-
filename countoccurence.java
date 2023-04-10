import java.util.Scanner;
public class countoccurence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter The Original Number");
        int number = input.nextInt();
        System.out.println("Enter The Number Whose No of Occurrence You Want to Know ");
        int n = input.nextInt();
        int count = 0;
        while (number != 0) {
            int remainder = number % 10;

            if (n == remainder) {
                count++;

            }
            number = number / 10;

        }
        System.out.println("The Number of Occurence of " +" " + n + " is " + count);

        
    }

    
}
