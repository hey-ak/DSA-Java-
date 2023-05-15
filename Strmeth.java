import java.util.Arrays;

public class Strmeth {
    public static void main(String[] args) {
        String name = "Akshay Jha";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.indexOf("a"));

        System.out.println("     Akshay    ".strip());

        System.out.println(Arrays.toString(name.split(" " )));
    }
    
}
