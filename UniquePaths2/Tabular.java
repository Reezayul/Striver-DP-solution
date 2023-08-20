public class Tabular{
  public static void main(String[] args)
  {
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int m=s.nextInt();
    for(int i=0;i<n;i++)
      {
        for(int j=0;j<m;j++)
          {
            obstacleGrid[i][j]=s.nextInt();
          }
      }
    System.out.println( uniquePathsWithObstacles( obstacleGrid) ;
  }
  public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;
        int prev[]=new int[n];
        for(int i=0;i<m;i++)
        { int temp[]=new int[n];
            for(int j=0;j<n;j++)
            {   int l=0;
                int r=0;
                if(obstacleGrid[i][j]==1)prev[j]=-1;
              else  if(i==0&&j==0)temp[j]=1;
             else{
                if(i>0) r=prev[j];
                  if(j>0) l=temp[j-1];
                temp[j]=r+l;
                }
            }
         prev=temp;
        }
        return prev[n-1];
    }
}
