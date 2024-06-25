import java.util.*;
import java.lang.*;

class AggressiveCow
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-- != 0){
			int n = sc.nextInt();
			int c = sc.nextInt();
			int arr[] = new int[n];
			int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
			for(int i = 0; i < n; i++){
				arr[i] = sc.nextInt();
				max = Math.max(max, arr[i]);
                min = Math.min(min, arr[i]);
			}
            Arrays.sort(arr);
			System.out.println(aggrCows(arr, n,c));
		}
		
	}
    public static int aggrCows(int [] arr, int n, int c){
        
        int low = 1;
        int high=arr[n-1] - arr[0];
        while(low <= high){

            int mid = (high + low) / 2;
            // System.out.println("mid " + mid);
            if(check(mid, arr, n) >= c){
                low = mid+1;
            }
            else{
                high = mid - 1;
            }

        }
        return high;

    }

    public static int check(int mid, int[] arr, int n){
        int count = 1, prev = arr[0];
        for(int i = 1; i < n; i++){
            if((arr[i] - prev >= mid)){
                // System.out.println("count: " + count + " diff:  " + (arr[i] - prev));
                count++;
                
                prev = arr[i];
            }
        }
        // System.out.println(count);
        return count;
    }
}