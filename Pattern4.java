import java.util.*;
public class Pattern4{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

       // pattern and spaces 
    //    int pat = n;
    //    int spaces = 0;
    //     for(int i = 0; i < n; i++)
    //     {
    //         //print spaces
    //         for(int j = 0; j < spaces; j++)
    //         {
    //             System.out.print("\t");
    //         }
    //         // print stars
    //         for(int j = 0; j < pat; j++)
    //         {
    //             System.out.print("*\t");
    //         }

            
    //         System.out.println("");
    //         spaces++;
    //         pat--;
    //     }

        // by equation approach  i <=y

        for(int i = 0; i < n; i++)
        {
            for(int j=0; j < n; j++)
            {
                if(i <= j)
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