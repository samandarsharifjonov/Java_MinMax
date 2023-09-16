import java.util.Scanner;

public class MinMax14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int b = scanner.nextInt();
        int k = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 1; i <= 10; i++) {
            int a = scanner.nextInt();
            if (a < min && a > b) {
                min = a;
                k = i;
            }
        }
        if (k == 0) {
            System.out.println("00");
        } else {
            System.out.println(k);
        }

    }
}
