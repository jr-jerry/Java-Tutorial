#include<stdio.h>
int main(){
    int input;
    if(input<5){
        printf("Input is less than 5");
    }else if(input <10){
        printf("INput is less than 10 ");
    }else if(input<15){
        printf("Input is less than 15");
    }else if(input<20){
        printf("INput is less than 20");
    }else{
        printf("Input is greater than 20 ");
    }

    printf("Program end ");
    return 0;
}