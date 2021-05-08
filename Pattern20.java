import java.util.*;

public class Pattern20
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        print(n);
    }
    public static void print(int n)
    {
        // count spaces and pat
        int spc = n/2;
        int pat = 1;
        int k = 1;
        for(int i=0;i<n;i++)
        {
            //print spaces
            for(int j=0;j<spc;j++)
            {
                System.out.print("\t");
            }

            //print pattern
            int start = k;
            for(int j=0;j<pat;j++)
            {
                System.out.print(start+"\t");
                if(j<pat/2)
                {
                    start++;
                }
                else
                {
                    start--;
                }
            }

            if(i < n/2)
            {
                pat += 2;
                spc--;
                k++;
            }
            else{
                pat -= 2;
                spc++;
                k--;
            }
            System.out.println("");
        }
    }
}