import java.util.Scanner;

public class MinMax12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int min =Integer.MAX_VALUE;
        int m=0;
        for (int i = 1; i <= n ; i++) {
            int a = scanner.nextInt();
            if ( a > 0) {
                if (a < min) {
                    min = a;
                }
            }
            else {
               m++;
            }
        }
        if (m==n) System.out.println(0);
          else  System.out.println(min);



    }
}
