#include <stdio.h>
#include<string.h>
long repeatedString(char* s, long n) {
    char a[100];
    int len = strlen(s);
    int i=0,pos=0;
  
    while(n!=pos){
        a[pos++] = s[i++];
        if(i==len){
            i=0;
        }
    }

    int count=0;
    for(int j=0;j<n;j++){
        if(a[j]=='a'){
            count++;
        }
    }
    printf("\ncount = %d",count);

}

int main()
{
    //Enter string and the number of times it should repeat
    repeatedString("abcac", 10);
    return 0;
}
/*--------------------------------------BETTER METHOD-----------------------------------------*/
#include <stdio.h>
#include<string.h>
int repeatedString(char* s, int n) {
    
    //calc. nnumber of times 'a' comes in original string
    int aFrequency,aFrequencyRemaining,aTotalFrequency;
    
    int stringLength = strlen(s);
    
    for(int i=0;i<stringLength;i++){
        if(s[i]=='a'){
            aFrequency++;
        }
    }

    //find how many times the original string will repeat
    int repeatFrequency = n/stringLength;
    if(aFrequency%2==0){
        return aFrequency*repeatFrequency;
    }
    else{
        //find where the string will end when incomplete
        int stringEndPosition = n - (repeatFrequency*stringLength);
        for(int i=0;i<stringEndPosition;i++){
        
            if(s[i]=='a'){
                aFrequencyRemaining++;
            }
        }
    }
    
    aTotalFrequency = (aFrequency*repeatFrequency) + aFrequencyRemaining;
    return aTotalFrequency;
}

int main()
{
    //Enter string and the number of times it should repeat
    int x = repeatedString("abcac", 10);
    printf("Ans = %d",x);
    return 0;
}
