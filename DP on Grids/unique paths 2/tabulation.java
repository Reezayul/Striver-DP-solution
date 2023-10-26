import java.util.*;

public class Solution {
    static int mod=1000000007;
    static int mazeObstacles(int n, int m, ArrayList<ArrayList<Integer>> mat) {
        // Write your code here.
        int dp[][]=new int[n][m];
		for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                // Base conditions
                
                if (i == 0 && j == 0) {
                    dp[i][j] = 1; // There's one valid path to the start cell.
                    continue;
                }

                int up = 0;
                int left = 0;

                // Check if moving up is possible
				if(mat.get(i).get(j)!=-1)
               { 
				   if (i > 0)
                    up = dp[i - 1][j]%mod;
                
                // Check if moving left is possible
                if (j > 0)
                    left = dp[i][j - 1]%mod;

                // Calculate the number of paths by adding paths from above and from the left
                }
				dp[i][j] = (up%mod + left%mod)%mod;
            }
        }
		return dp[n-1][m-1]%mod;
    }

}
