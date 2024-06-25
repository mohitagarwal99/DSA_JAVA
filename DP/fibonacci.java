package DP;
import java.util.*;

/**
 * fibonacci
 */
public class fibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int ans = fibo(n);
        System.out.println(ans);
    }

    public static int fibo(int n){
        int cache[] = new int[n+1];

        if( n < 2){
            return n;
        }
        if(cache[n] != 0)
        {
            return cache[n];
        }

        cache[n] = fibo(n-1) + fibo(n-2);
        return cache[n];
    }
}