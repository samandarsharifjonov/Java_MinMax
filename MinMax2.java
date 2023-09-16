import java.util.Scanner;

public class MinMax2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int min = Integer.MAX_VALUE;

        for (int i = 1; i <=n  ; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            if (a*b < min ){
                min = a * b;
            }
        }
        System.out.println(min);
    }
}
