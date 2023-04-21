public class factorial {
    static int fact(int number) {
        if (number == 0) {
            return 1;
        }
        return number * number - 1;
    }

    public static void main(String[] args) {
        int number = 5;
        int ans = fact(number);
        System.out.println(ans);
      
    }
    
}
