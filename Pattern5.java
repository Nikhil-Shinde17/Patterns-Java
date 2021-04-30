import java.util.*;
public class Pattern5{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        //spaces and pattern
        int spaces = n/2;
        int pat = 1;

        for(int i=0;i<n;i++)
        {
            //spaces
            for(int j=0;j<spaces;j++)
            {
                System.out.print("\t");
            }

            // stars
            for(int j=0;j<pat;j++){
                System.out.print("*\t");
            }

            if(i<n/2)
            {
                spaces--;
                pat += 2;
            }
            else
            {
                spaces++;
                pat -= 2;
            }
            System.out.println("");
        }
    }
}