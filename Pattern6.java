import java.util.*;

public class Pattern6
{
    public static void main(String[] args)
    {
         Scanner scn =  new Scanner(System.in);

         int n = scn.nextInt();
         // spaces and star count
         int spc = 1;
         int star = (n+1)/2;

         for(int i=0;i<n;i++)
         {
             // print star
             for(int j=0;j<star;j++)
             {
                 System.out.print("*\t");
             }

             // print spaces
             for(int j=0;j<spc;j++)
             {
                 System.out.print("\t");
             }

             // print star 
              for(int j=0;j<star;j++)
             {
                 System.out.print("*\t");
             }

             if(i <  n/2)
             {
                 spc += 2;
                 star--;
             }
             else
             {
                 spc -= 2;
                 star++;
             }
             System.out.println("");
         }
    }
}