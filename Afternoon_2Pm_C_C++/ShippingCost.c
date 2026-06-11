#include<stdio.h>
int main(){
    int weight;
    char destination;//['I','L']
    int shippingCost=0;
    
    printf("Enter destination either I / L \n");
    scanf("%c",&destination);

    printf("Enter weight of you Parcel \n");
    scanf("%d",&weight);


    if(weight>5){
        if(destination=='I' || destination=='i'){
            printf("Shipping cost will be 10 Dollar per Kg");
            shippingCost=weight*10;
        }else{
            printf("Shipping cost will be 5 Dollar per kg ");
            shippingCost=weight*5;
        }
    }else{
        if(destination=='I' || destination=='i'){
            printf("Shipping cost will be 5 Dollar per Kg");
            shippingCost=weight*5;
        }else{
            printf("Shipping cost will be free ");
        }
    } 
    printf("\nYour shipping cost is %d",shippingCost );
    return 0;
}