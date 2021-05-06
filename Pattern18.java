import java.util.*;

public class Pattern18
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        print(n);
    }

    public static void print(int n)
    {
        // count spaces and pattern
        int spc = n-1;
        int  pat = 1;
        for(int i=0;i<n;i++)
        {
           // print spaces
           for(int j=0;j<spc;j++)
           {
               System.out.print(" ");
           }
           
           // print pattern
            int temp = i+1;
           for(int j=0;j<pat;j++)
           {
              System.out.print(temp);
              if( j < pat/2)
              {
                  temp++;
              }
              else
              {
                  temp--;
              }
           }
           spc--;
           pat += 2;
           System.out.println("");
        }
    }
}