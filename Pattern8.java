import java.util.*;

public class Pattern8
{
        public static void main(String[] args)
        {
            Scanner scn = new Scanner(System.in);

            int n = scn.nextInt();

            pattern(n);
            secondApproch(n);
        }

        public static void pattern(int n)
        {
            // by equation i+j ==  n-1

            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    if(i+j ==  n-1)
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
            
            int spc = n-1;
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
                spc--;
            }
        }
}