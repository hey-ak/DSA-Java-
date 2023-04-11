import java.util.Scanner;

public class Temp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter The Temperature in Celsius");
        float t = input.nextFloat();
        float res = (t * 9 / 5) + 32;
        System.out.println(res);
    }
    
}
