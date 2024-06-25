// https://codeforces.com/gym/302977/problem/B

import java.util.Scanner;

public class BrokenKeyboard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String s = sc.next();

        boolean typable[] = new boolean[26];

        for( int i = 0; i < k; i++){
            char c = sc.next().charAt(0);
            typable[c - 'a'] = true;
        }
        int a[] = new int[n];
        for( int i = 0; i < n; i++){
            if ( typable[s.charAt(i) - 'a']){
                a[i] = 1;
            }
            else{
                a[i] = 0;
            }
        }

        int m[] = new int[n+1];

        m[0] = 0;
        long ans = 0;
        for(int i = 0; i < n; i++){
            if(a[i] == 0){
                m[i + 1] = 0;
            }
            else{
                m[i + 1] = m[i] + 1;
            }
            ans += m[i + 1];
        }
       
        System.out.println(ans);
    }
}
