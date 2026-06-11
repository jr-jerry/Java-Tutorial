import java.util.Scanner;

public class Practise2 {
    public static void main(String[] args) {
        int monthNumber;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Month as number [1,,,12]");
        monthNumber=sc.nextInt();

        // check=v1>v2 -->True ,, False 

        switch(monthNumber){
            case 1:
                System.out.println("31 Days ");
                break;
            case 2:
                System.out.println("28 days");
                break;
            case 3:
                System.out.println("31 Days");
                break;
            case 4:
                System.out.println("30 days ");
                break;
            case 5:
                System.out.println("31 Days ");
                break;
            case 6:
                System.out.println("30 Days");
                break;
            case 7:
                System.out.println("31 Days");
                break;
            case 8:
                System.out.println("31 Days");
                break;
            case 9:
                System.out.println("30 Days");
                break;
            case 10:
                System.out.println("31 Days");
                break;
            case 11:
                System.out.println("30 Days ");
                break;
            case 12:
                System.out.println("31 Days");
                break;
            default:
                System.out.println("Invalid month ");
                break;

        }
        sc.close();
    }    
}
// Print 31 for case 1, 3, 5, 7, 8, 10, 12.
// Print 30 for case 4, 6, 9, 11.
