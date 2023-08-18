public class Training{
  public static void main(String[] args ){
    Scanner s=new Scanner(System.in);
    int [][]points=new int[n][3];
    int n=s.nextInt();
    for(int i=0;i<n;i++)
      {
        for(int j=0;j<3;j++)
          points[i][j]=s.nextInt();
      }
    System.out.println(ninjaTraining(n,points);
  }
   public static int ninjaTraining(int n, int points[][]) {
        int dp[][]=new int[n][4];
        dp[0][0]=Math.max(points[0][1],points[0][2]);
        dp[0][1]=Math.max(points[0][0],points[0][2]);
        dp[0][2]=Math.max(points[0][1],points[0][0]);
        dp[0][3]=Math.max(points[0][0],Math.max(points[0][2],points[0][1]));
//         int point=0;
        for(int i=1;i<n;i++)
        {for(int j=0;j<4;j++)
          { dp[i][j]=0;
            for(int k=0;k<3;k++)
            {
                if(k!=j)
                {
                  int  point=points[i][k]+dp[i-1][k];
                    dp[i][j]=Math.max(dp[i][j],point);
                }
            }
          }
        }
       return dp[n-1][3];
       
    }
}
