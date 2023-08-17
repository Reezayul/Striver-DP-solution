import java.util.ArrayList;
import java.util.Scanner;

public class Memo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int valueInHouse[] = new int[n];
        for(int i=0;i<n;i++)
        {
            valueInHouse[i] = s.nextInt();
        }
        System.out.println(houseRobber(valueInHouse));
    }
    public static long houseRobber(int[] valueInHouse) {
		// Write your code here.
		if(valueInHouse.length == 1) return valueInHouse[0];
		ArrayList<Integer> a1=new ArrayList<>(),a2=new ArrayList<>();
		int n=valueInHouse.length;
		for(int i=0;i<n;i++)
		{
			if(i!=0)a1.add(valueInHouse[i]);
			if(i!=(n-1))a2.add(valueInHouse[i]);
		}		
		return Math.max(maximumNonAdjacentSum(a1),maximumNonAdjacentSum(a2));
	}	
	public static int maximumNonAdjacentSum(ArrayList<Integer> a) {

		int n=a.size();
		int prev1=a.get(0);
		int prev2=0;
		for(int i=1;i<n;i++)
		{
			int l=a.get(i);
			if(i>1)
			{ 
				l=prev2+a.get(i);
			}
			
			int k=prev1;
			prev2=prev1;
			prev1=Math.max(l, k);
		}
		return prev1;
	}
}
