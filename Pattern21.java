import java.util.*;

public class Pattern21
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        print(n);
    }

    public static void print(int n)
    {
        // count spc and pattern
        int spc = 2*n - 3;
        int pat = 1;

        for(int i=0;i<n;i++)
        {
            // print left half
            int start = 1;
            for(int j=0;j<pat;j++)
            {
                System.out.print(start);
                start++;
            }

            // print spaces
            for(int j=0;j<spc;j++)
            {
                System.out.print(" ");
            }
            // print second half

             start = pat;
             start = i == n-1 ? pat -1 : pat;
             int k = start;
             for(int j=0;j<start;j++)
             {
                System.out.print(k);
                k--;
             }
             spc -= 2;
             pat++;
             System.out.println("");
        }
    }
}