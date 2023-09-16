import java.util.Scanner;

public class MinMax25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int sum = 1;
        int k = 1;
        int k2 = 1;
        for (int i = 0; i < n ; i++) {
            int a = scanner.nextInt();

            if ( i % 2 != 0){
                max1 = a;

            }
            if ( i % 2 == 0){
                max2 = a;

            }

            int b = max1 * max2;

            if (sum < b){
                sum = b;

            }
        }
        System.out.println(sum);
        System.out.println(k);
        System.out.println(k2);

        /*
        JAVOB CHIQMAGAN

         */




    }
}
