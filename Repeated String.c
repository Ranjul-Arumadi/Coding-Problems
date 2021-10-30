#include <stdio.h>
#include<string.h>
long repeatedString(char* s, long n) {
    int len = strlen(s);
    if(len==1){
        return n;
    }
    else{
        int times;
        times = n/len;
        int freq=0;
        for(int i=0;i<len;i++){
            if(s[i]=='a'){
                freq++;
            }
        } 
        //printf("\n freq = %d",freq);
        int remPos,extrafreq=0;
        remPos = n - (times*len);
        for(int i=0;i<remPos;i++){
            if(s[i]=='a'){
                extrafreq++;    
            }
            
        }
        //printf("\n extrafreq = %d",extrafreq);
        int total;
        //printf("\n totalfreq = %d",times*freq);
        total = extrafreq + (times*freq);
        return total;
    }
     
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
