import java.util.*;

public class Pattern15
{
        public static void main(String[] args)
        {
            Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();

            print(n);
        }

        public static void print(int n)
        {
            // count spaces and number
            int spc = 2*n - 2;
            for(int i=0;i<n;i++)
            {
                //print pattern
                for(int j=0;j<=i;j++)
                {
                    System.out.print(j+1);
                }

                // print spaces
                for(int j=0;j<spc;j++)
                {
                    System.out.print(" ");
                }
                
                // print number

                for(int j=i;j>=0;j--)
                {
                    System.out.print(j+1);
                }
                System.out.println("");
                spc -= 2;
            }
        }
}