/*
  given 7 segement display: https://en.wikipedia.org/wiki/Seven-segment_display

  I/p: String of numbers
  length of string
  
  Find: Minimum number of toggles needed to light up the numebers one by one.
  
  
  Approach:
  
  Store it as 2d array.
  7 bits represent the 7 o/p lights/segments.
  They are in clockwise order.
  
  
  Store the bit value of initial numbers light up sequence in the temp array. Count if i/p =1
  
  Now for the remaining inputs check if new segemnts and old segements match or no
  
  If match , ie 1,1 0,0 etc ignore
  else
  
  update temp array with the new value and count
  
  
  
  Print final count value;
*/

import java.util.*;

class segment{
	public static void main(String args[]){
		String input = "1390";
		int l=4;
		
		int a[][] = {
			{1,1,1,1,1,1,0},
			{0,1,1,0,0,0,0},
			{1,1,0,1,1,0,1},
			{1,1,1,1,0,0,1},
			{0,1,1,0,0,1,1},
			{1,0,1,1,0,1,1},
			{0,0,1,1,1,1,1},
			{1,1,1,0,0,0,0},
			{1,1,1,1,1,1,1},
			{1,1,1,0,0,1,1}
		};
		
		int temp[] = new int[7];
		
		int first = input.charAt(0) - '0';
		
		int count=0;
		//store first arr to temp arr
		for(int i=0;i<a[first].length;i++){
			if(a[first][i]==1){
				count++;
			}
			temp[i] = a[first][i];
		}
		
		int digit=0;

		for(int i=1;i<l;i++){
			digit = input.charAt(i) - '0';
			for(int j=0;j<7;j++){
				if(a[digit][j]!=temp[j]){
					temp[j] = a[digit][j];
					count++;
				}
			}
		}

		
		System.out.println("Count: "+ count);
		
		
	}
}
