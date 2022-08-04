/*
Prime Numbers with a Twist
Ques. Write a code to check whether no is prime or not. Condition use function check() to find whether entered no is positive or negative ,if negative then enter the no, And if yes pas no as a parameter to prime() and check whether no is prime or not?

Whether the number is positive or not, if it is negative then print the message “please enter the positive number”
It is positive then call the function prime and check whether the take positive number is prime or not. 
*/
import java.util.*;
class primeTwisted{
	
	public static void check(int num){
		if(num<0){
			System.out.println("please enter the positive number");
		}
		else{
			prime(num);
		}
	}
	public static void prime(int num){
		int flag=1;
		for(int i=2;i<num/2;i++){
			if(num%i==0){
				flag=0;
				break;
			}
		}
		if(flag==1){
			System.out.println("Entered number is not a prime number");
		}
		else{
			System.out.println("Entered number is a prime number");
		}
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		check(num);
	}
}