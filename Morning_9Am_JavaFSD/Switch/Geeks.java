import java.util.Scanner;

public class Geeks
{
    public static void main(String[] args) {
        
        int weekDay;//[0,1,2,3,4,5,6,unknowValue]
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Weekday as Number 0,1,2,3,4,5,6");
        weekDay=sc.nextInt();
        
        switch(weekDay){
            case 0:
                System.out.println("Monday");
                break;
            case 1:
                System.out.println("Tuesday");
                break;
            case 2:
                System.out.println("Wednesday ");
                break;
            case 3:
                System.out.println("Thursday");
                break;
            case 4:
                System.out.println("Friday");
                break;
            case 5:
                System.out.println("Saturday");
                break;
            case 6:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Unknow Input Entered ! ");
        }
    }
}