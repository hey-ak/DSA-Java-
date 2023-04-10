import java.util.Scanner;

public class switchCase {
    public static void main(String[] args) {
        System.out.print("please enter Emp_id and department ");
        Scanner input = new Scanner(System.in);
        int Emp_id = input.nextInt();
        String  department = input.next();

        switch (Emp_id){
            case 1:
                System.out.println("Hari ohm");
                break;
            case 2:
                System.out.println("Poonam Pandey");
                break;
            case 3:
                System.out.println("sunita sharma");
                switch (department){
                    case "IT":
                        System.out.println("working in IT since 2000");
                        break;
                    case "Product Management":
                        System.out.println("working as project manager since 2010");
                        break;
                    default:
                        System.out.println("enter valid department");
                }
                break;
            default:
                System.out.println("enter valid Emp_no");
        }
        input.close();
    }
}