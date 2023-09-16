import java.util.Scanner;

public class MinMax19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int min = Integer.MAX_VALUE;
        int count = 0;
        int soni = 0;


        for (int i = 1; i <= n; i++) {
            int a = scanner.nextInt();

            if (a <= min) {
                soni ++;
                if (a == min) {
                    count++;
                } else {
                    min = a;
                    count = 1;
                }
            }

        }

        System.out.println(count);
        //System.out.println(soni);


    }
}
