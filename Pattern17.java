import java.util.*;

public class Pattern17
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        print(n);
    }
    public static void print(int n)
    {
        char c = (char)('A' + n - 1);
        for(int i=1;i<=n;i++)
        {
            char temp = c;
            for(int j=1;j<=i;j++)
            {
                System.out.print(temp);
                temp++;
            }
            System.out.println("");
             c--;
        }
    }
}