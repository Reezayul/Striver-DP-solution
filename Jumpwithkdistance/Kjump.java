package Jumpwithkdistance;
import java.util.Arrays;
import java.util.Scanner;

public class Kjump{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k = s.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i] = s.nextInt();
        }
        System.out.println(minimizeCost(n, k, a));

    }

    public static int minimizeCost(int n, int k, int[] a) {
        // Write your code here.
        int dp[] = new int[n];
        Arrays.fill(dp, -1);
        return fun(n - 1, k, a, dp);
    }

    static int fun(int i,int k,int []a,int []dp)
    {
        if(i==0)return 0;
        if(dp[i]!=-1)return dp[i];
        int min=Integer.MAX_VALUE;
        for(int j=1;j<=k;j++)
        {
            if((i-j)>=0)
            {
                int o=fun(i-j, k, a, dp)+Math.abs(a[i-j]-a[i]);
                min=Math.min(min,o);
            }
            else
            {break;}
        }
        dp[i]=min;
        return dp[i];
    }
}