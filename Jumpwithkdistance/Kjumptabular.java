package Jumpwithkdistance;

import java.util.Scanner;

public class Kjumptabular {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k = s.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        System.out.println(minimizeCost(n, k, a));

    }
    public static int minimizeCost(int n, int k, int []a){
        // Write your code here.
        int dp[]=new int[n];
        dp[0]=0;
        for(int i=1;i<n;i++)
        {
            int min=Integer.MAX_VALUE;
            for(int j=1;j<=k;j++)
            {
                if((i-j)>=0)
                {
                    int o=dp[i-j]+Math.abs(a[i-j]-a[i]);
                    min=Math.min(min,o);
               }
                else
                {break;}
           }
           dp[i]=min;
        }
        return dp[n-1];
    }
    
}