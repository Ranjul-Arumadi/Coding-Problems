/*
	Problem Statement: 
	Wedding Bingo game is a famous game. In this game, the guests will be given cards with random numbers and the couple will randomly select 2 numbers (m & n) where m represents the number of consecutive guests to come onto stage with the sum on their cards equal to n. 
	Input Format: The first line contains an integer g denoting the number of guests The second line contains g space-separated integers describing the respective values of so,si...so.i (the numbers written on each consecutive cards of guests) 
	The third line contains two space-separated Integers describing the respective values of n (sum of their cards) and m (consecutive number of guests). 
	Constraints: 
	lc= 9 <=100 1<= s; <= 10 1<= n <= 30 1 <a m <=12 
	Output Fomat: Print an integer denoting the total different group of guests that will come on to the stage. 
	Sample Input: 4 3 6 2 7  9 2 
	sample o/p: 2

*/

import java.util.*;
class weddingBingoGame{
    public static void main(String [] args){
        int g = 4;
		int a[] = {3,6,2,7};
		int n = 9; //sum of cards
		int m = 2; //consecutive num of guests
		
		int c=0;
		
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a.length;j++){
				if(i!=j){
					if(a[i]+a[j]==n){
						c++;
					}
				}
				
			}
		}
		c = c/2;
		if(c>m){
			System.out.println(m);
		}
		else{
			System.out.println(c);
		}
		
		
    }
}
