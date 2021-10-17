/*
LCM 

The LCM of two integers n1 and n2 is the smallest positive integer that is perfectly divisible by both n1 and n2 (without a remainder).

LCM = (value1 * value2) / GCD (value1, value2)

GCD: https://github.com/Ranjul-Arumadi/Coding-Problems/blob/main/GCD%20or%20HCF.c
*/


//1. using formula LCM = (val1 * val2) / GCD(val1,val2)
#include <stdio.h>
int main()
{
    int a,b,gcd=0;
    printf("\nEnter two numbers: ");
    scanf("%d %d",&a,&b);
    
    int x=a,y=b;
    
    while(a!=b){
        
        if(a>b){
            a-=b;
        }
        
        else{
            b-=a;
        }
    }

    printf("\nLCM of is :%d ",(x*y/a)); //a stores the value of the gcd
    return 0;
}
