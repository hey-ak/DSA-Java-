public class CountEvenNumbers_In_Array {

    static boolean even(int num) {
        int digits = noofdigits(num);
        if (digits % 2 == 0) {
            return true;
        }
        return false;
    }

    static int noofdigits(int num) {
        if (num < 0) {
            num *= -1;
            
        }
        ;
        if (num == 0) {
            return 1;
            
        }
        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10;
        }
        return count;
    }

    static int findEvendigits(int arr[]) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (even(arr[i])) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[] = { 123, 786, 4586, 78 };
        int ans = findEvendigits(arr);
        System.out.println(ans);
    }
}
