import java.util.*;

public class Pattern16
{
    public  static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        print(n);
    }

    public static void print(int n)
    {
        int mid = n/2;
        mid = n%2!=0 ? mid+1 : mid;
        int i =0 ;
        int start = 1;
        while(i < mid)
        {
           for(int j=0;j<n;j++)
           {
               System.out.print(start+"\t");
               start++;
           }
           System.out.println();
           i++;
           start += n;
        }
        if(n%2==0)
        {
            start -= n;
        }
        else
        {
            start -= 3*n;
        }
          
        //   System.out.println(start);
        while(i<n)
        {
           int k = start;
           for(int j=0;j<n;j++)
           {
               System.out.print(k+"\t");
               k++;
           }
           start -= 2*n;
           i++;
           System.out.println("");
        }
    }
}