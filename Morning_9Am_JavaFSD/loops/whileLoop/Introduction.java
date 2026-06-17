package Morning_9Am_JavaFSD.loops.whileLoop;

import java.util.Scanner;

public class Introduction {
    public static void main(String[] args){
      int input;
      System.out.println("Enter a input ");
      Scanner sc=new Scanner(System.in);

      input=sc.nextInt();
      int i=10;
      while(i>=1){
        System.out.println(i*input);
        i--;
      }
      
      sc.close();
    }
}
