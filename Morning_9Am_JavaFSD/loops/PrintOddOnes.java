package Morning_9Am_JavaFSD.loops;

import java.util.Scanner;

public class PrintOddOnes {
    public static void main(String[] args) {
        
        int input;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter input! ");
        input=sc.nextInt();

        for(int c=1;c<=input;c++){
            if(c%2!=0){
                System.out.println(c);
            }
        }
    }
}
