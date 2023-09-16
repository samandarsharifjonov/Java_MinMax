import java.util.Scanner;

public class MinMax23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;

        for (int i = 0; i < n ; i++) {
            int a = scanner.nextInt();

            if (a >= max1){
                max3 = max2;
                max2 = max1;
                max1 = a;

            } else if (a > max2) {
                max3 = max2;
                max2 = a;

            } else if (a > max3) {
                max3 = a;

            }

        }

        System.out.println(max1);
        System.out.println(max2);
        System.out.println(max3);
    }
}
