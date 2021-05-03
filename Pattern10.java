import java.util.*;
public class Pattern10
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        firstApproach(n);
        secondApproach(n);
    }
    public static void firstApproach(int n)
    {
        // count spaces and star
        int leftSpc = n/2;
        int midSpc = -1; 

        for(int i=0;i<n;i++)
        {
            // print spaces
            for(int j=0;j<leftSpc;j++)
            {
                System.out.print("\t");
            }

            // print star
            System.out.print("*\t");

            // print middle spaces
            for(int j=0;j<midSpc;j++)
            {
                System.out.print("\t");
            }

            // print star
            if(i!=0 && i!=n-1)
            {
                System.out.print("*\t");
            }

            if(i<n/2)
            {
                leftSpc--;
                midSpc += 2;
            }
            else
            {
                leftSpc++;
                midSpc -= 2;
            }
            System.out.println("");
        }
    }

    public static void secondApproach(int n)
    {
        // by line equation method
        for(int x=1;x<=n;x++)
        {
            for(int y=1;y<=n;y++)
            {
                if(x+y == (n+3)/2)
                {
                    System.out.print("*\t");
                }
                else if(x+y == (3*n + 1)/2)
                {
                    System.out.print("*\t");
                }
                else if(y-x == (n-1)/2)
                {
                    System.out.print("*\t");
                }
                else if(x-y == (n-1)/2)
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