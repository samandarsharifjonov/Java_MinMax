import java.util.Scanner;

public class MinMax18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int max = Integer.MIN_VALUE;

        int k1 = -1, k2 = 0;

        for (int i = 1; i <= n ; i++) {
            int a = scanner.nextInt();
            if (a > max){
                max = a;
                k1 = i;
            }
            if ( a >= max){
                k2 = i;
            }

        }

        if (k1 == k2){
            System.out.println(0);
        }else {
            System.out.println(k2-k1-1);
        }

    }
}
