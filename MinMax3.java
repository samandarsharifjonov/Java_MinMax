import java.util.Scanner;

public class MinMax3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int max = Integer.MIN_VALUE;

        for (int i = 1; i <= n ; i++) {
            int a  = scanner.nextInt();
            int b  = scanner.nextInt();
            if ( (a + b) * 2 > max){
                max = (a + b) * 2;
            }

        }
        System.out.println(max);
    }
}
