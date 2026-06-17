package Morning_9Am_JavaFSD.loops.PractiseQuestion;

import java.util.Scanner;

public class Solutions1 {
    public static void main(String[] args){
        int input;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a input ");
        input=sc.nextInt();

        for(int i =1;i <=input;i++){
            System.out.println(" Current value "+i+" and its cube "+(i*i*i));
        }
    }
}
