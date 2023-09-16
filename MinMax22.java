import java.util.Scanner;

public class MinMax22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        int son1= scanner.nextInt();
        min1=son1;
        int son2= scanner.nextInt();
        if (min1 > son2) {
            min2=min1;
            min1=son2;
        }
        else min2=son2;
        for (int i = 3; i <=n ; i++) {
             son2= scanner.nextInt();
            if (min1 > son2) {
                min2=min1;
                min1=son2;
            }
            else if(min2>=son2&&son2>min1) min2=son2;
        }
        System.out.println(min1);
        System.out.println(min2);
    }
}
