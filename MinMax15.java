import java.util.Scanner;

public class MinMax15 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int max = Integer.MIN_VALUE;
        int k = 0;
        for (int i = 1; i <= 10; i++) {
            int a = scanner.nextInt();
            if ( a > max && a > b && a < c){
                max = a;
                k = i;
            }
        }

        if (k == 0) System.out.print(k);
        System.out.println(k);
    }
}
