import java.util.*;

public class Pattern13
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        firstApproach(n);
    }
    public static void firstApproach(int n)
    {
        // Brute force method O(n^3)
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                int n1 = factorial(i);
                int r = factorial(j);
                int c = factorial(i-j);

                int f = n1/(c*r);
                System.out.print(f+"\t");
            }
            System.out.println("");
        }
    }

    public static int factorial(int n)
    {
        if(n==0)
        {
            return 1;
        }
        int count = 1;
        for(int i=1;i<=n;i++)
        {
            count *= i;
        }
        return count;
    }
}