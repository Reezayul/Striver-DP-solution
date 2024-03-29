import java.util.* ;
import java.io.*; 
public class Solution {
	public static int uniquePaths(int m, int n) {
		int dp[][]=new int[m][n];
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==0&&j==0)
				{
					dp[0][0]=1;
					continue;
				}
				int up=0;
				int right=0;
				if(i>0)
				 up=dp[i-1][j];
				if(j>0)
				 right=dp[i][j-1];
				dp[i][j]=up+right;
			}
		}
		return dp[m-1][n-1];
	}
}
