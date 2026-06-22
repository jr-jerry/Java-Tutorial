#include<stdio.h>
int main(){
    int balance=0;
    int input;
    int amount;
    do{
        printf("Banking Applicaiton \n\n");
        printf("1-Add Balance \n\n");
        printf("2-Deduct Balance\n\n");
        printf("3-Show balance \n\n");
        printf("4-Exit program\n\n");

        scanf("%d",&input);

        if(input==4){
            break;
        }
        switch(input){
            case 1:
             printf("Enter amount to be added \n\n");
             scanf("%d",&amount);
             balance=balance+amount;
            break;
            case 2:
            printf("Enter amount to be deducted \n\n");
             scanf("%d",&amount);
             balance=balance-amount;
             break;
            case 3:
          
             printf("Your balance is %d\n\n",balance);
             break;
            default:
             printf("Invalid input \n\n");
             break;
        }
    }while(1);

    printf("Program Exit !!!");
    return 0;
}