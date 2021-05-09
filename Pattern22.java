import java.util.*;

public class Pattern22
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        printArrow1(n);
        printArrow2(n);
    }

    public static void printArrow1(int n)
    {
        // count spaces and pattern
        int spc = n/2;
        int pat = 1;

        for(int i=0;i<n;i++)
        {
            //print spaces
            int spaces = n/2 == i ? 0 : spc;
            for(int j=0;j<spaces;j++)
            {
                System.out.print("\t");
            }

            // print pattern
            int patt = n/2 == i ? n : pat;
            for(int j=0;j<patt;j++)
            {
                System.out.print("*\t");
            }


            if(i < n/2)
            {
                pat += 1;
            }
            else
            {
                pat -= 1;
            }
            System.out.println("");
        }
    }
    
    public static void printArrow2(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(i == (n+1)/2)
                {
                    System.out.print("*\t");
                }
                else if(j >= (n+1)/2 && j -i <= (n-1)/2 && i < (n+1)/2)
                {
                    System.out.print("*\t");
                }
                else if( j >= (n+1)/2 && i + j <= (3*n+1)/2 && i > (n+1)/2)
                {
                     System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }
            }
            System.out.println("");
        }
    }
}