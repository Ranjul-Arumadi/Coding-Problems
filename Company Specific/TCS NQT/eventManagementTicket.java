/*
An event management company has come up with a unique idea of printing their event tickets. Based 
on the ticket number combination (str1), the visitor is directed towards a particular class of audience. The 
task is to create a program/application to fetch the ticket number based on the following conditions:

Any occurrences of digits EF, 56 and G, & should be deleted
The characters EF should be in the same format.
Example 1:
Input:
4523EF58G -> Value of STR1
Output:
452358 -> After removal of characters
‘EF’ and ‘G’
*/
import java.util.*;
class eventManagementTicket{
    public static void main(String [] args){
        String s =  "E12F35G58"; //"4523EF58G"; //E12F35G58
		int l = s.length();
		String ans = "";
		
		for(int i=0;i<l;i++){
			if(s.charAt(i)=='E' && s.charAt(i+1)=='F' || s.charAt(i)=='5' && s.charAt(i+1)=='6'){
				i++;
				i++;
			}
			if(s.charAt(i)=='G' || s.charAt(i)=='&'){
				continue;
			}
			ans+=s.charAt(i);
		}
		System.out.println(ans);
    }
}
