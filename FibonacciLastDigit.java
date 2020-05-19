import java.util.*;

public class FibonacciLastDigit {    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = n%60;
        long[] f = new long[m+1];
        if(m==0){
            f[0]=0;
        }
        else if (m==1) {
            f[1]=1;
        }
        else{
            f[0] = 0;
            f[1] = 1;
            for(int i =2;i<m+1;i++){
                f[i] = f[i-1]+f[i-2];
            }
        }
        long x = (f[m]);
        String p = Long.toString(x);
        int r = p.length();
        char q = p.charAt(r-1);
        System.out.println(q);        
    }
}

