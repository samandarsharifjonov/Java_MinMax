import java.util.Scanner;

public class MinMax11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int k = 0, k2 = 0;
        for (int i = 1; i <= n ; i++) {
            int a = scanner.nextInt();

            if ( a >= max){
                max = a;
                k = i;
            }

            if ( a <= min){
                min = a;
                k2 = i;
            }
        }

        if ( k >= k2){
            System.out.println(k);
        }else {
            System.out.println(k2);
        }
    }
}
