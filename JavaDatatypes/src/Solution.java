import java.util.*;
import java.io.*;



class Solution{
    public static void main(String []argh)
    {



        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {

            try
            {
                long n=sc.nextLong();
                System.out.println(n+" can be fitted in:");
                if (n >= -128 && n <= 127)
                    System.out.printf("* byte%n* short%n* int%n* long%n");
                else if (n >= -32768 && n <= 32767)
                    System.out.printf("* short%n* int%n* long%n");
                else if (n >= -(Math.pow(2, 31)) && n <= Math.pow(2, 31) - 1)
                    System.out.printf("* int%n* long%n");
                else if (n >= -(Math.pow(2, 63)) && n <= Math.pow(2, 63) - 1)
                    System.out.printf("* long%n");
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }
}
