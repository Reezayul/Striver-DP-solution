import java.util.*;

public class Solution {
    static int mod=1000000007;
    static int mazeObstacles(int n, int m, ArrayList<ArrayList<Integer>> mat) {
        // Write your code here.
        int dp[][]=new int[m][n];
		for(int []num: dp)
		{
			Arrays.fill(num,-1);
		}
		int count=solve(dp,m-1,n-1,mat);
		return count%mod;
    }
    static int solve(int dp[][],int m,int n,ArrayList<ArrayList<Integer>> mat)
    {
        if(m==0&&n==0)
		return 1;
		if(m<0||n<0||mat.get(n).get(m)==-1)
		return 0;
		if(dp[m][n]!=-1)return dp[m][n]%mod;
		int up=solve(dp, m-1, n,mat)%mod;
		int right=solve(dp,m,n-1,mat)%mod;
		dp[m][n]=(up+right)%mod;
		return dp[m][n];
    }

}
