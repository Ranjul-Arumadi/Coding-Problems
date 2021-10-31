/*
Problem: 
There is a new mobile game that starts with consecutively numbered clouds. Some of the clouds are thunderheads and others are cumulus. 
The player can jump on any cumulus cloud having a number that is equal to the number of the current cloud plus 1 or 2. 
The player must avoid the thunderheads.

Determine the minimum number of jumps it will take to jump from the starting postion to the last cloud. 

It is always possible to win the game.

For each game, you will get an array of clouds numbered  if they are safe or  if they must be avoided.
*/

#include <stdio.h>
int jumpingOnClouds(int c_count, int* c) {
    int jumps=0,i=0;
    while(c_count>1){
        if(c[i+1]==1){
            jumps++;
            c_count=c_count-2;
            i=i+2;
        }
        else if(c[i+1]!=1 && c[i+2]!=1){
            jumps++;
            c_count=c_count-2;
            i=i+2;
        }
        else{
            jumps++;
            c_count--;
            i=i+1;
        }
        
    }
    return jumps;
}
int main()
{
    int x;
    int arr[] = {0,0,1,0,0,1,0};
    x = jumpingOnClouds(7, arr);
    printf("%d",x);
    return 0;
}
