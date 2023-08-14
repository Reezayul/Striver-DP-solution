import java.util.Scanner;

public class Fiboonaci{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n = s.nextInt();
        int prev1=1;
        int prev2=1;
        for(int i=3;i<=n;i++)
        {
            int cur = prev1 + prev2;
            prev2 = prev1;
            prev1 = cur;
        }
        System.out.println(prev1);
    }
}