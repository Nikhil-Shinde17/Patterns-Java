import java.util.*;

public class Pattern11
{
    public static void  main(String[] args)
    {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        firstApproach(n);
        secondApproach(n);
    }

    public static void firstApproach(int n)
    {
            // count number and spaces

            int count = 1;
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<=i;j++)
                {
                       System.out.print(count+"\t");
                       count++;
                }
                System.out.println("");
            }
    }
    public  static void secondApproach(int n)
    {
        int count = 1;
        // by eqaution i<=j

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i >= j)
                {
                    System.out.print( count+"\t");
                    count++;
                }
                else{
                    System.out.print("\t");
                }
                
            }
            System.out.println("");
        }
    }
}