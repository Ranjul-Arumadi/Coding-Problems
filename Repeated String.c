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
