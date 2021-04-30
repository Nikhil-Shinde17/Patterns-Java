import java.util.*;
public class Pattern3{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        // spaces and patterns 
        // int spaces = n-1;
        // int pat = 1;

        // for(int i=0;i<n;i++){
            
        //     //print spaces and patterns
        //     for(int j=0;j<spaces;j++)
        //     {
        //         System.out.print("\t");
        //     }

        //     //print stars
        //     for(int j=0;j<pat;j++)
        //     {
        //         System.out.print("*\t");
        //     }
        //     spaces--;
        //     pat++;
        //     System.out.println("");
        // }

        // line  x+y = constant  and(k = constant) k = n-1

         for(int i=0; i< n; i++)
         {
             for(int j=0;j<n;j++)
             {
                if((i+j)>=n-1)
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