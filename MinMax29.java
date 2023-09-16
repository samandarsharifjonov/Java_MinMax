import java.util.Scanner;
public class MinMax29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int count = 1;
        int MaxSoni = 1;
        int[] arr = new int[n];


        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();

            if (arr[i] < min){
                min = arr[i];
                count = 1;
            }else if (min == arr[i]){
                  count++;
            }else count = 0;

        }

        if (count > MaxSoni) {
            MaxSoni = count;
        }
        System.out.println(MaxSoni);

    }

}


