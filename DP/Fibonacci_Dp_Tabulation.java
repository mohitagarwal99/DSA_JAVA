import java.util.Scanner;

/**
 * Fibonacci_Dp_Tabulation
 */


public class Fibonacci_Dp_Tabulation {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();

        int f[] = new int[n+1];

        f[0] = 0;
        f[1] = 1;

        for (int i = 1; i < n-1; i++){
            f[i + 1] += f[i];
            f[i + 2] += f[i];
        }
        f[n] += f[n-1];
        System.out.println(f[n]);

    }
    
}