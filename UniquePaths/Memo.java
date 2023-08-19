public class Memo{
  public static void main(String[] args){
    Scanner s=new Scanner(System.in);
    int m=s.nextInt();
    int n=s.nextInt();
    System.out.println(uniquePaths(m,n);
  }
  static int fn(int m,int n,int dp[][]){
    if(m==0&&n==0)return 1;
    if(m<0||n<0)return 0;
    if(dp[m][n]!=-1)return dp[m][n];
    int r=fn(m-1,n,dp);
    int l=fn(m,n-1,dp);
    return dp[m][n]=r+l;

}
    public int uniquePaths(int m, int n) {
        int dp[][]=new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                dp[i][j]=-1;
            }
        }
        return fn(m-1,n-1,dp);
    }
}
