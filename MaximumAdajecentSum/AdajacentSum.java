package MaximumAdajecentSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class AdajacentSum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        ArrayList<Integer> a = new ArrayList<>(n);
        for (int i = 0; i < n; i++)
            a.add(s.nextInt());
        System.out.println(maximumNonAdjacentSum(a));
    }
    
    public static int maximumNonAdjacentSum(ArrayList<Integer> a) {
        // Write your code here.
        int n = a.size();
        int dp[] = new int[n];
        Arrays.fill(dp, -1);
        return fun(n - 1, dp, a);
    }
    static int fun(int i,int[] dp,ArrayList<Integer> a)
	{
		if(i<0)return 0;
		if(i==0)return a.get(i);
		if(dp[i]!=-1)return dp[i];
		int l=a.get(i)+fun(i-2,dp,a);
		int k=fun(i-1,dp,a);
		dp[i]=Math.max(l, k);
		return dp[i];
	}
}