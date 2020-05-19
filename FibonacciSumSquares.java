import java.util.*;

public class FibonacciSumSquares {
    private static int getFibonacciSumSquaresNaive(long n) {
        int r = (int)(n%60);
        if(r==0||r==1){
            return r;
        }
        int[] f = new int[r+2];
        f[0]=0;
        f[1]=1;
        for(int i =2;i<r+2;i++){
            f[i] = (f[i-1]%10+f[i-2]%10)%10;
        }
        int p = (f[r]*f[r+1])%10;
        return p;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long s = getFibonacciSumSquaresNaive(n);
        System.out.println(s);
    }
}

