import java.util.Scanner;

public class MinMax17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int max = Integer.MIN_VALUE;
        int k = 0;

        for (int i = 1; i <= n ; i++) {
            int a = scanner.nextInt();

            if ( a >= max){
                max = a;
                k = 0;
            }
            if ( a < max){
                k++;
            }

        }
        System.out.println(k);

    }
}
