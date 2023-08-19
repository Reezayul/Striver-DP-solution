public class Tabular{
  public static void main(String[] args)
  {
    Scanner s=new Scanner(System.in);
    int m=s.nextInt();
    int n=s.nextInt();
    System.out.println(uniquePaths(m,n));
  }
    public int uniquePaths(int m, int n) {
        int dp[][]=new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {   int l=0;
                int r=0;
                if(i==0&&j==0)dp[i][j]=1;
             else{
                if(i>0) r=dp[i-1][j];
                  if(j>0) l=dp[i][j-1];
                dp[i][j]=r+l;
                }
            }
        }
        return dp[m-1][n-1];
    }
}
