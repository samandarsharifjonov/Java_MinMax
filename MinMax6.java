import java.util.Scanner;

public class MinMax6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int Max = Integer.MIN_VALUE;
        int Min = Integer.MAX_VALUE;
        int k = 0, q = 0;

        for (int i = 1; i <= n ; i++) {
            int a = scanner.nextInt();
            if ( a > Max){
                Max = a;
                k = i;
            }
            if ( a < Min){
                Min = a;
                q = i;
            }
        }
        System.out.println(q+" "+k);
    }
}
