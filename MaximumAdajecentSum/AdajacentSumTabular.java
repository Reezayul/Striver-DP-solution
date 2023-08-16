package MaximumAdajecentSum;

import java.util.ArrayList;
import java.util.Scanner;

public class AdajacentSumTabular {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        ArrayList<Integer> a = new ArrayList<>(n);
        for (int i = 0; i < n; i++)
            a.add(s.nextInt());
        System.out.println(maximumNonAdjacentSum(a));
    }
    public static int maximumNonAdjacentSum(ArrayList<Integer> a) {
		// Write your code here.
		int n=a.size();
		int prev1=a.get(0);
		int prev2=0;
		for(int i=1;i<n;i++)
		{
			int l=Integer.MIN_VALUE;
			if(i>1)
			{ 
				l=prev2+a.get(i);
			}
			else {
				l=a.get(i);
			}
			int k=prev1;
			prev2=prev1;
			prev1=Math.max(l, k);
		}
		return prev1;
	}
    
}
