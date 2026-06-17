#include<stdio.h>
int main(){
    //input-->5 
    int input;
    printf("ENter a number \n");
    scanf("%d",&input);

    for(int i=input ;i<=input*10;i=i+input){
        printf("%d\n",i);
    }
    //table print of that number 5 
    return 0;
}