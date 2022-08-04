/*
Problem Statement
-----------------

Chain Marketing Organization has has a scheme for income generation, through which its members generate income for themselves. The scheme is such that suppose A joins the scheme and makes R and V to join this scheme  then A is Parent Member of R and V who are child Members. When any member joins the scheme then the parent gets total commission of 10% from each of its child members.
Child members receive commission of 5% respectively. If a Parent member does not have any member joined under him, then he gets commission of 5%.
Take name of the members joining the scheme as input.
Display how many members joined the scheme including parent member.Calculate the Total commission gained by each members in the scheme. The fixed amount for joining the scheme is Rs.5000 on which commission will be generated
SchemeAmount = 5000

Example 1: When there are more than one child members 
Input : (Do not give input prompts.Accept values as follows. )
Amit                     //Enter parent Member as this
Y                           //Enter Y if  Parent member has child members otherwise enter N
Rajesh,Virat        //Enter names of child members of Amit in comma separated
Output:(Final Output must be in format given below.)
TOTAL MEMBERS:3
COMISSION DETAILS
Amit: 1000 INR
Rajesh :250 INR
Virat: 250 INR

Example 2: When there is only one child member in the hierarchy
Input :
Amit
Y
Rajesh
Output:
Total Members: 2 
Comission Details
Amit: 500 INR
Rajesh: 250 INR
*/
import java.util.*;
class chainmarketing{
	public static void main(String[] args){
		int SchemeAmount = 5000;
		
		double pcommision = SchemeAmount*(0.05);
		double kidcommision = SchemeAmount*(0.05);
		
		Scanner sc = new Scanner(System.in);
		String parent = sc.next();
		
		int size = 0;
		char YorN = sc.next().charAt(0);
		String kidsarr[] = {};
		
		if(YorN=='Y'){
			String kids = sc.next();
			kidsarr = kids.split(",");
			size = kidsarr.length;
			
			pcommision = SchemeAmount*size*(0.1);
		}
		
		System.out.println("TOTAL MEMBERS:"+ (size+1));
		System.out.println("COMISSION DETAILS");
		System.out.println(parent+": "+ (int)pcommision + " INR");
		for(int i=0;i<size;i++){
			System.out.println(kidsarr[i]+": "+ (int)kidcommision + " INR");
		}
		
	}
}