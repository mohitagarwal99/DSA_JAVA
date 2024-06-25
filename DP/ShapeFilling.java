// https://codeforces.com/gym/302977/problem/A
// Optimized solution can be 2^(n/2), if even else no solution
import java.util.Scanner;

public class ShapeFilling{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int f[] = new int[n+1];
        f[0] = 1;
        f[1] = 0;

        for(int i = 2; i <= n; i++){
            f[i] = 2 * f[i-2];
        }

        System.out.println(f[n]);
    }
}