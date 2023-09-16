import java.util.Scanner;

public class MinMax21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        double sum = 0, count = 0;
        double k = 1, k2 = 1;
        double natija = 1;
        for (int i = 0; i < n; i++) {
            count = n;
            int a = scanner.nextInt();
            sum = sum + a;

            if (a >= max) {
                if (max == a) {
                    sum -= a;
                    count--;
                }
                max = a;
            }

            if (a <= min) {
                k2++;
                if (min == a) {
                    sum -= a;
                    count--;
                }
                min = a;

            }

        }

        natija = sum / count;
        if (natija == 2) natija += 1;
        System.out.println(natija);

    }
}
