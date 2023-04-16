import java.lang.annotation.Target;

public class CharacterSearch {
    static boolean charSearch(String str, char key) {
        if (str.length() == 0) {
            return false;

        }
        for (int i = 0; i < str.length(); i++) {
            char element = str.charAt(i);
            if (key == element) {
                return true;

            }

        }
        return false;
    }
    public static void main(String[] args) {
        String name = "Akshay";
        char key = 's';
        System.out.println(charSearch(name,key));
    }
    
}
