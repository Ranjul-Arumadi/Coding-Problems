/*
	You have been given a list L of size N and integer K where this K represents the ideal score K considering all parameters. Each element in this list L Is said to have a special weight of each body builder. The score of a body builder based on all considerations L(i) is L(i)%K (special weight % ideal score). You now need to arrange this list in Non-Increasing order of the score of each body builder ,i.e the body builder with the highest score should appear first, then the body builder with the second highest score and so on. In case two elements have the same score, the one with the lower value should appear in the output first. Input Format: The first line consists of two space separated integers N and K. The next line consists of N space separated integers denoting the special weights of list L body builders. Output Format: Print N space separated Integers denoting the scores of the bodybuilders in the order in which they are required. 
	
	Constraints: 
	=t1<=1.0A5 l<=LM <=10^7 =K<=113^ 7 
	Sample Input: 
	5 87 128 66 345 999 200 
	Sample Output: 
	345 66 999 128 200 

*/

import java.util.*;
class bodyBuildingsandRanking{
    public static void main(String [] args){
        int n = 5;
		int k = 87;
		int a[] = {128, 66, 345, 999, 200};
		
		for(int i=0;i<n-1;i++){
			for(int j=0;j<n-i-1;j++){
				if(a[j]%k<a[j+1]%k){
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					
				}
				
			}
		}
		
		for(int x:a){
			System.out.print(x+" ");
		}
		
		
    }
}
