import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int storenum = 0;
        int ans = 0;
        while (number != 0) {
            storenum = number % 10;
            number = number / 10;
            ans = ans*10 +storenum;

        }
        System.out.println(ans);


    }
    
}
