import java.util.*;
class hashAndStar{
    public static void main(String [] args){
        String s = "###***#";
		
		int len = s.length();
		
		int st=0, h=0;
		for(int i=0;i<len;i++){
			if(s.charAt(i)=='#'){
				h++;
			}
			else if(s.charAt(i)=='*'){
				st++;
			}
		}
		
		if(st==h){
			System.out.println("0");
		}
		
		else{
			System.out.println("-1");
		}
    }
}
