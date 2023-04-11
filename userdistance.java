import java.util.Scanner;

public class userdistance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the distance in meters: ");
        float distance = input.nextFloat();
        System.out.print("Enter the time taken in hours, minutes, and seconds: ");
        int hours = input.nextInt();
        int minutes = input.nextInt();
        int seconds = input.nextInt();
        float timeInSeconds = hours * 3600 + minutes * 60 + seconds;
        float metersPerSecond = distance / timeInSeconds;
        float kilometersPerHour = (distance / 1000) / (timeInSeconds / 3600);
        System.out.println("Speed in meters/second: " + metersPerSecond);
        System.out.println("Speed in kilometers/hour: " + kilometersPerHour);
    }
}