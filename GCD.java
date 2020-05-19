import java.util.*;

public class GCD {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int a = s.nextInt();
    int b = s.nextInt();
    if(a>b){
      int o = gcd(a,b);
      System.out.println(o);
    }
    else{
      int o = gcd(b,a);
      System.out.println(o);
    }
  }
  public static int gcd(int a, int b){
    if (b ==0){
      return a;
    }
    int r = a%b;
    return gcd(b,r);
  }

}
