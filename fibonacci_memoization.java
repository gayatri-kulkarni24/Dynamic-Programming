import java.util.*;
public class DP1{
  public static int fibonacci_memoization(int n,int f[]){
        if(n==0 || n==1){
            return n;
        }
        if(f[n]!=0){
            return f[n];
        }
        f[n]=fibonacci_memoization(n-1,f) + fibonacci_memoization(n-2,f);
        return f[n];
    }
}
