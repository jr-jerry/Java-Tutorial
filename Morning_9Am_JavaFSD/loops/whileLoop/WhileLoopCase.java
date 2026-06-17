package Morning_9Am_JavaFSD.loops.whileLoop;
import java.util.Scanner;
public class WhileLoopCase {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        char input;
        int input2;
        while(true){
            System.out.println("Do you want to Enter a number : Y / N");
            input=s.nextLine().toUpperCase().charAt(0); 

            if(input=='N'){
                System.out.println("Program Succesfully End ! ");
                break;
            }

            System.out.println("Enter a number ");
            input2=s.nextInt();//122\n
            s.nextLine();
        }
        s.close();
        
    }
}

//Output
// 1-Do you want to Enter a number :Y / N 
// input-->Y 

// Enter a number :4 

// 1 Do you want to Enter a number : Y/N 
// N 

// Program End Succesfully! 