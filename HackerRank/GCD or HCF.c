/******************************************************************************
GCD or HCF of two numbers.

The HCF or GCD of two integers is the largest integer that can exactly divide 
both numbers (without a remainder).
*******************************************************************************/

// 1. Simple method using for loop [BRUTE FORCE mwthod]

#include <stdio.h>
int main()
{
    int a,b,gcd=0;
    printf("\nEnter two numbers: ");
    scanf("%d %d",&a,&b);
    
    //note to start loop from 1 else the answer will be wrong
    for(int i=1;i<=a && i<=b;i++){
        if(a%i==0 && b%i==0){ //cheking if i value can divide both a and b without leaving any remainders
            gcd=i;
        }
    }

    printf("\nGCD of %d and %d is :%d ",a,b,gcd);
    return 0;
}

//2. Better method using while and if

#include <stdio.h>
int main()
{
    int a,b,gcd=0;
    printf("\nEnter two numbers: ");
    scanf("%d %d",&a,&b);
    
    while(a!=b){
        
        if(a>b){
            a-=b;
        }
        
        else{
            b-=a;
        }
    }

    printf("\nGCD of is :%d ",a);
    return 0;
}
