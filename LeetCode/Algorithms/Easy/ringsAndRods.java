/*
	link: https://leetcode.com/problems/rings-and-rods/
	
	There are n rings and each ring is either red, green, or blue. The rings are distributed across ten rods labeled from 0 to 9.

	You are given a string rings of length 2n that describes the n rings that are placed onto the rods. Every two characters in rings forms a color-position pair that is used to describe each ring where:

	The first character of the ith pair denotes the ith ring's color ('R', 'G', 'B').
	The second character of the ith pair denotes the rod that the ith ring is placed on ('0' to '9').
	For example, "R3G2B1" describes n == 3 rings: a red ring placed onto the rod labeled 3, a green ring placed onto the rod labeled 2, and a blue ring placed onto the rod labeled 1.

	Return the number of rods that have all three colors of rings on them.

	 

	Example 1:


	Input: rings = "B0B6G0R6R0R6G9"
	Output: 1
	Explanation: 
	- The rod labeled 0 holds 3 rings with all colors: red, green, and blue.
	- The rod labeled 6 holds 3 rings, but it only has red and blue.
	- The rod labeled 9 holds only a green ring.
	Thus, the number of rods with all three colors is 1.
*/

import java.util.*;
class ringsAndRods{
    public static void main(String [] args){
        String rings = "B1G5G3B9B7B9G5G5B4R4";
		
		int l = rings.length();
        int red[] = new int[10];
        int green[] = new int[10];
        int blue[] = new int[10];
        int num=0;
		char temp = ' ';
        for(int i=0;i<l;i=i+2){
            if(rings.charAt(i)=='R'){
                temp = rings.charAt(i+1);
				num =  temp - '0';
                red[num]+=1;
            }
            else if(rings.charAt(i)=='G'){
                temp = rings.charAt(i+1);
				num =  temp - '0';
                green[num]+=1;   
            }
            else{
                temp = rings.charAt(i+1);
				num =  temp - '0';
                blue[num]+=1;
            }
        }
        int ans=0;
        for(int i=0;i<10;i++){
            if(red[i]>=1 && green[i]>=1 && blue[i]>=1){
                ans++;
            }
        }
        
       System.out.println(ans);
		
	}
}
