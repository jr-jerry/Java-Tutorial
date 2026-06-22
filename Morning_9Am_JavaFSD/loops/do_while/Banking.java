import java.util.Scanner;

public class Banking {
    public static void main(String[] args) {
        int input;
        int balance=1000;
        Scanner sc=new Scanner(System.in);
        do{ 
            System.out.println("<-------------Banking Application------------> \n\n 1-Add Balance \n2-Deduct Balance \n3-Exit \n\n");
            System.out.println("Enter a choice \n");
            input=sc.nextInt();
            switch(input){
                case 1:
                    System.out.println("Enter amount to be added ");
                    balance+=sc.nextInt();
                    break;
                case 2:
                    System.out.println("Enter amount to be deducted ");
                    balance-=sc.nextInt();
                    break;
                case 3:
                    System.out.println("Balance : "+balance);
                    System.out.println("Program end ! ");
                    break;
                default:
                    System.out.println("Invalid input ");
                    break;                   

            }
            if(input==3)break;

        }while(true);
        sc.close();
    }
}
//Banking Application 
// 1 Add 
// 2 Remove 
// 3 Exit 