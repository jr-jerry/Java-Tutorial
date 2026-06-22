#include<stdio.h>
int main(){
    int input;
    printf("Enter a number \n");
    scanf("%d",&input);
    int i=1;
    do{
        printf("%d",i);
        i++;
    }while(i<=input);

    return 0;
}

// input ->n 

 