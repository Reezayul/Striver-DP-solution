Public class Memo{

  public static void main(String[] args)
  {
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int m=s.nextInt();
    int grid[][]=new int[n][m];
    for(int i=0;i<n;i++)
      {
        for(int j=0;j<m;j++)
          {
            grid[i][j]=s.nextInt();
          }
      }
    System.out.println(minPathSum(grid));
  }
  static int fn(int i,int j,int[][] a,int[][] dp){
    if(i==0&&j==0)return a[0][0];
    if(i<0||j<0)return (int)Math.pow(10,9);
    if(dp[i][j]!=-1)return dp[i][j];
    int u=a[i][j]+fn(i-1,j,a,dp);
    int l=a[i][j]+fn(i,j-1,a,dp);
    return dp[i][j]=Math.min(u,l);
}
    public int minPathSum(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int dp[][]=new int[n][m];
        for(int row[]: dp)
        {
            Arrays.fill(row,-1);
        }
        return fn(n-1,m-1,grid,dp);
    }
}
