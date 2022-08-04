/*
Selection of MPCS exams include a fitness test which is conducted on ground. 
There will be a batch of 3 trainees, appearing for running test in track for 3 rounds. 
You need to record their oxygen level after every round. After trainee are finished with all rounds,
 calculate for each trainee his average oxygen level over the 3 rounds and select one with highest 
 oxygen level as the most fit trainee. If more than one trainee attains the same highest average level, 
 they all need to be selected.

Display the most fit trainee (or trainees) and the highest average oxygen level.

Note:

The oxygen value entered should not be accepted if it is not in the range between 1 and 100.
If the calculated maximum average oxygen value of trainees is below 70 then declare the trainees 
as unfit with meaningful message as “All trainees are unfit.
Average Oxygen Values should be rounded.
Example 1:
INPUT VALUES
95
92
95
92
90
92
90
92
90

OUTPUT VALUES
Trainee Number : 1
Trainee Number : 3

Note:
Input should be 9 integer values representing oxygen levels entered in order as

Round 1

Oxygen value of trainee 1
Oxygen value of trainee 2
Oxygen value of trainee 3
Round 2

Oxygen value of trainee 1
Oxygen value of trainee 2
Oxygen value of trainee 3
Round 3

Oxygen value of trainee 1
Oxygen value of trainee 2
Oxygen value of trainee 3
Output must be in given format as in above example. For any wrong input final output should display 
“INVALID INPUT”
*/
import java.util.*;
class MPCSexam{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int size = 9;
		int arr[] = new int[size];
		
		for(int i=0;i<size;i++){
			arr[i] = sc.nextInt();
		}
		
		int t1 =0, t2 =0, t3 =0;
		
		for(int i=0;i<size;i=i+3){
			t1+=arr[i];
		}
		for(int i=1;i<size;i=i+3){
			t2+=arr[i];
		}
		for(int i=2;i<size;i=i+3){
			t3+=arr[i];
		}
		
		float t1avg =0, t2avg =0, t3avg =0;
		
		t1avg = Math.round(t1/3);
		t2avg = Math.round(t2/3);
		t3avg = Math.round(t3/3);
		
		float high[] = {t1avg, t2avg, t3avg};
		
		Arrays.sort(high);
		
		for(float x: high){
			System.out.println(x);
		}
		/*float max =0;
		if(t1avg>t2avg && t1avg>t3avg){
			max = t1avg;
		}
		else if(t2avg>t1avg && t2avg>t3avg){
			max = t2avg;
		}
		else if(t3avg>t2avg && t3avg>t1avg){
			max = t3avg;
		}
		*/
	}
}