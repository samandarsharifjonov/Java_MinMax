import java.util.Scanner;

public class MinMax8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        int k = 0;
        int q = 0;

        for (int i = 1; i <= n ; i++) {
            int a = scanner.nextInt();

            if ( a < min1){
                min1 = a;
                k = i;
            }

            if ( a <= min2 && a >= min1){
                min2 = a;
                q = i;
            }
        }
        System.out.println(k);
        System.out.println(q);
    }
}
