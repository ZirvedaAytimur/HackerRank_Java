import java.util.Scanner;

public class Solution {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        int q,a,b,n,answer;

        q=scanner.nextInt();

        for (int i=0;i<q;i++){
            a=scanner.nextInt();
            b=scanner.nextInt();
            n=scanner.nextInt();

            answer=a;

            for (int j=0;j<n;j++){
                answer+=Math.pow(2,j)*b;
                System.out.printf("%d ",answer);
            }
            System.out.printf("%n");
        }
    }
}
