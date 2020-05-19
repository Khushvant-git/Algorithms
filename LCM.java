import java.util.*;
public class LCM{
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    long a = s.nextInt();
    long b = s.nextInt();
    long r = a*b; 
    if(a>b){
      long o = r/gcd(a,b);
      System.out.println(o);
    }
    else{
      long o = r/gcd(b,a);
      System.out.println(o);
    }
  }
  public static long gcd(long a, long b){
    if (b ==0){
      return a;
    }
    long r = a%b;
    return gcd(b,r);
  }
}