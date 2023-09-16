import java.util.Scanner;

public class MinMax27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int soni = 1, max = 0, orni = 0;
        int index1 = 1;

        for (int i = 2; i <= n; i++) {
            int b = scanner.nextInt();

            if ( a == b){
                soni++;
            }

            if (soni > max){
                max = soni;
                orni = i;
            }
            if ( a != b){
                soni = 1;
                a = b;
            }

        }
        index1 = orni - max + 1;

        System.out.println(index1+ "\n" +max);



    }
}
