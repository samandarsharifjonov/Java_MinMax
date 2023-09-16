import java.util.Scanner;

public class MinMax20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int count2 = 1, count = 1;
        int k = 1, k2 = 1;

        for (int i = 1; i <= n ; i++) {
            int a = scanner.nextInt();
           if (a >= max){
               if ( max == a){
                   count++;
               }else {
                   max = a;
                   count = 1;
               }
           }

           if ( a <= min ){
               if (min == a){
                   count2++;
               }else {
                   min = a;
                   count2 = 1;
               }
           }

        }
        if (count2 == count){
            System.out.println(0);
        }else {
            System.out.println(count+count2);
        }







    }
}
