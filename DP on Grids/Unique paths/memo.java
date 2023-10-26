import java.util.* ;
import java.io.*; 
public class Solution {
	public static int uniquePaths(int m, int n) {
		// Write your code here.
		int dp[][]=new int[m][n];
		for(int []num: dp)
		{
			Arrays.fill(num,-1);
		}
		int count=solve(dp,m-1,n-1);
		return count;
	}
	static int solve(int dp[][],int m,int n)
	{
		if(m==0&&n==0)
		return 1;
		if(m<0||n<0)
		return 0;
		if(dp[m][n]!=-1)return dp[m][n];
		int up=solve(dp, m-1, n);
		int right=solve(dp,m,n-1);
		dp[m][n]=up+right;
		return dp[m][n];
	}
}
