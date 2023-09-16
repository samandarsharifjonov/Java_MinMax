import java.util.Scanner;

public class MinMax7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int k = 0;
        int q = 0;
        for (int i = 1; i <= n ; i++) {
            int a = scanner.nextInt();

            if (a > max){
                max = a;
                k = i; // k Maksimal sonni tartib raqamini sanaydi.
            }
            if ( a <= min){
                min = a;
                q = i; // q Minimal sonni tartib raqamini sanaydi.

            }

        }
        System.out.println(k);
        System.out.println(q);
    }
}
