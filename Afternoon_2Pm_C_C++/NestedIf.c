#include<stdio.h>
#include<stdbool.h>
int main(){
    int age;//[any age ]
    int marks;//[any integer ]
    char gender;// either 'F' or 'M'

    if(age>18){
        //age jada hai !
        if(marks>550){
            //jb age bhi jada hai and marks bhi jada hai!
            if(gender=='M'){
                //jb age bhi jada hai and marks bhi jada hai and Gender male hai !
                printf("eligible for senior male officer ! ");
            }else{
                //jb age bhi jada hai and marks bhi jada hai and Gender female hai! 
                printf("Eligible for senior female officer ! ");
            }
        }else{
            //jb age jada hai but marks km hai! 
            if(gender=='M'){
                //jb age bhi jada hai and marks km hai and Gender male hai !
            }else{
                //jb age bhi jada hai and marks bhi km hai and Gender female hai! 
            }
        }
    }else{
        //age km hai ! 
    }
    return 0;
}