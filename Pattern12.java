import java.util.*;

public class Pattern12
{
      public static void main(String[] args)
      {
          Scanner scn = new Scanner(System.in);
          int n = scn.nextInt();

          firstApproach(n);
          secondApproach(n);
      }

      public static void firstApproach(int n)
      {
          // fibbonacci series 
          // the current number is sum of 2 previous consecutive number
          int a = 0;
          int b = 1;
          for(int i=0;i<n;i++)
          {
              for(int j=0;j<=i;j++)
              {
                   System.out.print(a+"\t");
                   int c = a +b;
                   a = b;
                   b = c;
              }
              System.out.println("");
          }
      }

      public static void secondApproach(int n)
      {
          //find the equation i <= j
            int a = 0;
            int b = 1;

          for(int i=0;i<n;i++)
          {
              for(int j=0;j<n;j++)
              {
                  if(j <= i)
                  {
                        System.out.print(a+"\t");
                        int c = a +b;
                        a = b;
                        b = c;
                  }
                  
              }
              System.out.println("");
              
          }
      }
}