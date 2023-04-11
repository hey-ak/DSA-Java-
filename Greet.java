import java.util.Scanner;

public class Greet {
    static String Greet(String name) {
        String Message = "Hello "+name;
        return Message;
        
        

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Name ");
        String name = input.next();
        String outpString = Greet(name);
        System.out.println(outpString);
        
    }
    
}
