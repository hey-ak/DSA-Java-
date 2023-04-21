public class fibonaciseries {
    public static void main(String[] args) {
        int n = 10;
        int t1 = 0;
        int t2 = 1;

        for (int i = 0; i <= n; i++) {
        
            System.out.print(t1+" ");
            int sum = t2+t1;
            t1 = t2;
            t2 = sum;
            
        }
    }
    
}
