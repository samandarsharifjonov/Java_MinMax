import java.util.Scanner;

public class MinMax26 {
    public static void main(String[] args) {
        Scanner  scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int max = Integer.MIN_VALUE;
        int k = 0;
        for (int i = 0; i < n ; i++) {
            int a = scanner.nextInt();
            if ( a % 2 == 0){
                k++;
            }else if (max <= a){
                max = a;
                k = 1;
            }


        }

        if (k == 1) {
            System.out.println(0);
        } else if ( k != 0){
            System.out.println(k);
        }else {
            System.out.println(0);
        }


    }
}