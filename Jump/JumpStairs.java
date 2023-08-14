package Jump;

import java.util.Scanner;

public class JumpStairs {

    public static void main(String[] args) {
         Scanner s=new Scanner(System.in);
         long n = s.nextLong();
        System.out.println(countDistinctWayToClimbStair(n));
    }

    public static int countDistinctWayToClimbStair(long nStairs) {
		
		long res = f(nStairs);
        return (int)res;
    }

    public static long f(long ind){
        long prev2 = 1;
        long prev = 1;
        for(long i = 2;i<=ind;i++){
            long curi = (prev2 + prev)%1000000007;
            prev2 = prev;
            prev = curi;
        }
        return prev;
	}
    
}
