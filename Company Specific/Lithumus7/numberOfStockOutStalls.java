/*
	Inputs:
	line 1 : number of stalls
	line 2 : number of visitors
	line 3 : space seperated stalls size
	line 4 : number of visitors * space separated 3 integer values[stall start index, end index, number of quantity]

	Output:
	Print stall numbers whose stock is over
*/

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
class Solution 
{
	public static void main(String args[] )
	{
		Scanner s = new Scanner(System.in);
		int N = s.nextInt(); //num of stalls
		int K = s.nextInt(); //num of visitors

		int stalls[] = new int[N];
		for(int i=0;i<N;i++){
			stalls[i] = s.nextInt();
		}

		int det[] = new int[3*K];
		for(int i=0;i<(3*K);i++){
			det[i] = s.nextInt();
		}

		int start = 0;
		int end = 0;
		int quant = 0;

		for(int i=0;i<(3*K);i=i+3){
			start = det[i]-1;  //zero based indexing
			end = det[i+1]-1;
			quant = det[i+2];
			for(int j=start;j<=end;j++){
				stalls[j] = stalls[j]-quant;
			}
		}
		int c=0;
		for(int i=0;i<N;i++){
			if(stalls[i]<=0){
				c++;
			}
		}

		int ans[] = new int[c];
		int pos=0;
		for(int i=0;i<N;i++){
			if(stalls[i]<=0){
				ans[pos++] = i+1; 
				System.out.print(i+1+" ");
			}
		}

		
		
	}
}
