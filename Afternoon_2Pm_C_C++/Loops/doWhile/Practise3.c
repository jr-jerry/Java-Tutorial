#include<stdio.h>
int main(){
    int balance=0;
    int amount;
    do{
        printf("Enter amount to add \n");
        scanf("%d",&amount);

        if(amount==0){
            break;
        }

        balance+=amount;
        printf("Balance: %d\n\n",balance);

    }while(1);

    printf("Total Balance: %d",balance);

    return 0;
}

//Add balance: 200
// total Balance:200 
// Add balance : 300
// total Balance:500
//Add balance:400
// total Balance:900
//Add balance:0 
// total balance:900 
// Program end !!!! 
