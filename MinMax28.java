import java.util.Scanner;

public class MinMax28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k=0,t=0, k1=0, t1=0, ind=1;
        boolean b = true;
        int max = Integer.MIN_VALUE;
        int n = scanner.nextInt();
        for (int i = 1; i <=n ; i++) {
            int a = scanner.nextInt();
            if(a==1){
                b=false;
                if(t==0){
                    k=i;
                }
                t++;
            }else {
                k1=k;
                t1=t;
                t=0;
            }
            if(t>t1){
                max=t;
                ind = k;
            }else if(t1>t){
                max=t1;
                ind = k1;
            }
        }
       if (b){
           System.out.println(0);
       }else {
           System.out.println(ind);
           System.out.println(max);
       }

    }

}

