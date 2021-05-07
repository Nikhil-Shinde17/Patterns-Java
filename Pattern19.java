import java.util.*;

public class Pattern19
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        print(n);
    }
    public static void print(int n)
    {
        int row = 2*n - 1;
        int col = 2*n - 1;
        
        int countR = n;
        //first half
        for(int i=0;i<=row/2;i++)
        {
            int countC = countR+1;
            for(int j=0;j<col;j++)
            {
                if(i<=j && i+j <= 2*n - 2)
                {
                    System.out.print(countR+" ");
                }
                else if(i>j)
                {
                    System.out.print(n-j+" ");
                }
                else if(i+j > 2*n - 2){
                   System.out.print(countC+" ");
                   countC++;
                }
            }
            System.out.println("");
            countR--;
        }

        // second half
        countR=2;
        for(int i=row/2 + 1;i<row;i++)
        {
            int countC = n;
            int countCR = countR+1;
            for(int j=0;j<col;j++)
            {
                if(i+j >= 2*n -2 && i>=j)
                {
                   System.out.print(countR+" ");
                }
                else if(i+j < 2*n - 2)
                {
                  System.out.print(countC+" ");
                  countC--;
                }
                else if(i < j){
                    System.out.print(countCR+" ");
                    countCR++;
                }
            }
            countR++;
            System.out.println("");
        }
    }
}