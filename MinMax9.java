import java.util.Scanner;

public class MinMax9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int k = 0, q = 0;

        for (int i = 1; i <= n ; i++) {
            int n1 = scanner.nextInt();

            if ( n1 > max1 ){
                max1 = n1;
                k = i;
            }

            if ( n1 >= max2){
                max2 = n1;
                q = i;
            }

        }

        System.out.println(k);
        System.out.println(q);


    }
}
