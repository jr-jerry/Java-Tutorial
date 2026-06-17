package Morning_9Am_JavaFSD.loops;
import java.util.Scanner;
public class Introduction {
    public static void main(String[] args) {
        //Input--> ?
        Scanner sc=new Scanner(System.in);
        System.out.println("enter input! ");
        int input1=sc.nextInt();

        for(int c=1;c<=5;c++){
            System.out.println(input1+c); //5+1 -->5+2,-->5+3,-->5+4,-->5+5;  
        }


    }
}
