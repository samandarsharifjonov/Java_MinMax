import java.util.Scanner;

public class MinMax16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int min = Integer.MAX_VALUE;
        int k = - 1;

        for (int i = 1; i <= n ; i++) {
            int a = scanner.nextInt();

            if (a < min){
                min = a;
                k++;
            }

        }
        System.out.println(k);

    }
}
