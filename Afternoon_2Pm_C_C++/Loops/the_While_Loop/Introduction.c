#include<stdio.h>
int main(){
    int input;
    printf("Enter a last digit till you want number ");
    scanf("%d",&input);

    int i=2;
    while(i<=input){
        printf("%d ",i);
        i=i+2;
    }
   
    return 0;
} 

 