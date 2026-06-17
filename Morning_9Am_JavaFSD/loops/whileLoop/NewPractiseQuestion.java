package Morning_9Am_JavaFSD.loops.whileLoop;

import java.util.Scanner;

public class NewPractiseQuestion {
    public static void main(String[] args) {
        int choice;
        int balance=1000;
        int amount=0;
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("1--Add Money\n2--Deduct Money\n3--Show Money\n4--Exit\n");
            choice=sc.nextInt();


            switch(choice){
                case 1:
                    //Add money case 
                    System.out.println("Enter amount to add");
                     amount=sc.nextInt();
                    balance=balance+amount;
                    break;
                case 2:
                    //deduct money case 
                    System.out.println("enter amount to be deduct ");
                     amount=sc.nextInt();
                    balance-=amount;
                    break;
                case 3:
                    System.out.println("Your balance is "+balance);
                    break;
                case 4:
                    System.out.println("Program exit succesfully! ");
                    break;
                default:
                    System.out.println("Invalid input please try again");
                    break;
            }
            
            if(choice==4){
                break;
            }
        }
        
    }
}
// // Bank Management System
// 1--Add Money 
// 2--Deduct Money
// 3--Show Money
// 4--Exit

// 1--Enter amount to add 
// 200 

// balance:+200 ,1200

// 1--Add Money 
// 2--Deduct Money
// 3--Show Money
// 4--Exit

// 2-Deduct Money 

// Enter amount to deduct 
// 500 
// 1200-500
// Balance:700 

// --Add Money 
// 2--Deduct Money
// 3--Show Money
// 4--Exit
