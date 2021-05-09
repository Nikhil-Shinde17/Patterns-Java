import java.util.*;

public class Pattern23
{
    public static void main(String[]  agrs)
    {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        print(n);
    }
    public static void print(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==0 || i== n-1)
                {
                    System.out.print("*\t");
                }
                else if(i < n/2 && i == j || i+j == n-1)
                {
                    System.out.print("*\t");
                }
                else if(i > n/2 && i >= j && i+j >= n-1)
                {
                     System.out.print("*\t");
                }
                else
                {
                     System.out.print("\t");
                }
            }
            System.out.println("");
        }
    }
}