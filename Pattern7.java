import java.util.*;

public class Pattern7
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);

        int  n =scn.nextInt();

       // firstApproach(n);
        secondApproach(n);
    }
    public static void firstApproach(int n)
    {
        // by equation i == j
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i == j)
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
    public static void secondApproach(int n)
    {
        // by count of spaces and star

        int spc =0;
        int star = 1;

        for(int i=0;i<n;i++)
        {
            // print spaces
            for(int j=0;j<spc;j++)
            {
                System.out.print("\t");
            }

            // print star
            System.out.println("*\t");
            spc++;
        }
    }
}