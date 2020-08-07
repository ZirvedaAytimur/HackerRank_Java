import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            int x=sc.nextInt();
            String xFormat=String.format("%03d",x);
            System.out.printf("%s%"+(15-s1.length())+"s%s%n",s1," ",xFormat);
        }
        System.out.println("================================");

    }
}



