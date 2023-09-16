import java.util.Scanner;

public class MinMax4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int min = Integer.MAX_VALUE;
        int k = 0;

        for ( int i = 1; i <= n ; i++) {
            int a = scanner.nextInt();
            if (min > a){
                min = a;
                k = i;
            }
        }
        System.out.println(min+" "+k);
    }
}
