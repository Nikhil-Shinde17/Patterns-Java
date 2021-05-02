import java.util.*;
public class Pattern5{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        // // spaces and pattern
        // int spaces = n/2;
        // int pat = 1;

        // for(int i=0;i<n;i++)
        // {
        //     //spaces
        //     for(int j=0;j<spaces;j++)
        //     {
        //         System.out.print("\t");
        //     }

        //     // stars
        //     for(int j=0;j<pat;j++){
        //         System.out.print("*\t");
        //     }

        //     if(i<n/2)
        //     {
        //         spaces--;
        //         pat += 2;
        //     }
        //     else
        //     {
        //         spaces++;
        //         pat -= 2;
        //     }
        //     System.out.println("");
        // }
        equationApproach(n);
    }
    public static void equationApproach(int n)
    {
          for(int i=1;i<=n;i++)
          {
              for(int j=1;j<=n;j++)
              {
                  if(i+j < (n+3)/2 || j-i > (n-1)/2 || i+j  > (3*n+1)/2 || i-j  > (n-1)/2)
                  {
                        System.out.print("\t");
                  }
                  else{
                      System.out.print("*\t");
                  }
              }
              System.out.println("");
          }
    }
}