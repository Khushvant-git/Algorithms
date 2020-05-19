import java.util.Scanner;

public class FibonacciPartialSum{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long from = scanner.nextLong();
        long to = scanner.nextLong();
        System.out.println(getFibonacciPartialSumNaive(from, to));
    }

    public static int calc_fib(long n){
        int r = (int)(n%60);
        if(r==0||r==1){
            return r;
        }
        int[] f = new int[r+1];
        f[0]=0;
        f[1]=1;
        for(int i =2;i<=r;i++){
            f[i] = (f[i-1]%10+f[i-2]%10)%10;
        }
        return f[r];
    }
    public static int solution(long from, long to){
        int r = (int)(to-from);
        int z = 0;
        for(int i =0;i<=r;i++){
            z = (z%10+(calc_fib(from+(long)i))%10)%10;
        }
        return z;
    }
    public static int getFibonacciPartialSumNaive(long from, long to){
        long remainder1 = from%60;
        long remainder2 = to%60;
        if(to-from>60){
            if(remainder1 ==0){
                if(remainder2==0){
                    return 0;
                }
                else{
                    return solution(to-remainder2+1, to);
                }
            }
            else{
                if(remainder2==0){
                    return solution(from,from+(60-remainder1));
                }
                else{
                    return (solution(from,from+(60-remainder1))+solution(to-remainder2+1, to))%10;
                }
            }
        }
        else{
            return solution(from,to);
        }
    }
}
