#include<stdio.h>
int main(){
    int input;
    do{
        printf("Enter a input\n");
        scanf("%d",&input);

        if(input==0){
            break;
        }
    }while(1);

    return 0;
}