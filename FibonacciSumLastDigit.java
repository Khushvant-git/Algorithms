import java.util.Scanner;

public class FibonacciSumLastDigit{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long n = s.nextLong();
        System.out.println(calc_fib(n));

    }
    public static int calc_fib(long n){
        int r = (int)(n%60);
        if(r==0||r==1){
            return r;
        }
        int[] f = new int[r+1];
        int[] d = new int[r+1];
        f[0]=0;
        f[1]=1;
        d[1]=1;
        for(int i =2;i<=r;i++){
            f[i] = (f[i-1]%10+f[i-2]%10)%10;
            d[i] = (f[i]%10+d[i-1]%10)%10;
        }
        return d[r];
    }
}