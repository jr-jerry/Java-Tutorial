package Morning_9Am_JavaFSD.loops;
import java.util.Scanner;
public class SumUptoN {
    public static void main(String[] args) {
        int input;
        System.out.println("enter Any Number ");
        Scanner sc=new Scanner(System.in);

        input=sc.nextInt();
         
        int sum=0;
        for(int c=1;c<=input;c++){
             sum=sum+c;
        }

        System.out.println(sum);
        sc.close();
    }
}
