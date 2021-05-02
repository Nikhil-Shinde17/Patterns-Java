import java.util.*;

public class Pattern9
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        
        int n = scn.nextInt();
        
        // firstApproach(n);
        secondApproch(n);
    }

    public static void firstApproach(int n)
    {
        //by equation method
        // i==j && i+j == n+1

         for(int i=1;i<=n;i++)
         {
             for(int j=1;j<=n;j++)
             {
                 if(i == j ||  i+j == n+1)
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

    public static void secondApproch(int n)
    {
        // count spaces and star
        int leftSpc = 0;
        int midSpc = n-2;
        int leftStar = 1;
        int rightStar = 1;
        for(int i=0;i<n;i++)
        {
            //print left spaces
            for(int j=0;j<leftSpc;j++)
            {
                System.out.print("\t");
            }

            // print star 
            for(int j=0;j<leftStar;j++)
            {
                 System.out.print("*\t");
            }

            // print middle space

            for(int j=0;j<midSpc;j++)
            {
                 System.out.print("\t");
            }

            for(int j=0;j<rightStar;j++)
            {
                 System.out.print("*\t");
            }
         
            if(i < n/2)
            {
                midSpc -= 2;
                leftSpc++;
                if(i == n/2 -1)
                {
                    rightStar =0;
                }
            }
            else{
                midSpc += 2;
                leftSpc--;
                rightStar = 1;
            }
         System.out.println("");
        
        }
    }
}