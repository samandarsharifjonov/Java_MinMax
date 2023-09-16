import java.util.Scanner;

public class MinMax1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 1; i <=n ; i++) {
            int a = scanner.nextInt();
            if ( a > max)
                max = a;
            if ( a < min){
                min = a;
            }
        }
        System.out.println(min+" "+max);
    }
}