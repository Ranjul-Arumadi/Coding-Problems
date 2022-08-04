/*
Problem Statement
A doctor has a clinic where he serves his patients. The doctor’s consultation fees are different for different groups of patients depending on their age. If the patient’s age is below 17, fees is 200 INR. If the patient’s age is between 17 and 40, fees is 400 INR. If patient’s age is above 40, fees is 300 INR. Write a code to calculate earnings in a day for which one array/List of values representing age of patients visited on that day is passed as input.
Note:

Age should not be zero or less than zero or above 120
Doctor consults a maximum of 20 patients a day
Enter age value (press Enter without a value to stop):
Example 1:
Input
20
30
40
50
2
3
14
Output
Total Income 2000 INR
Note: Input and Output Format should be same as given in the above example.
For any wrong input display INVALID INPUT
Output Format
Total Income 2100 INR
*/
import java.util.*;
class doctorClinic{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		//int ages[] = new int[20];
		
		String val = " ";
		int index = 0;
		boolean truth = true;
		int temp = 0, income = 0;
		while(true){
			val = sc.nextLine();
			if(val.equalsIgnoreCase("")){
				break;
			}
			temp = Integer.parseInt(val); 
			if(temp<=0 || temp>120){
				System.out.println("INVALID INPUT");
				return;
			}
			if(temp<17){
				income+=200;
			}
			else if(temp>=17 && temp<=40){
				income+=400;
			}
			else if(temp>40){
				income+=300;
			}
			//ages[index++] = temp;
			
		}
		

			System.out.println("Total Income "+income);

		
		
	}
}