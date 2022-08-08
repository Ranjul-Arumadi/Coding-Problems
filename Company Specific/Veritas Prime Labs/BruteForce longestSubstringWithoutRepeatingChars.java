import java.util.*;
class longestSubstringWithoutRepeatingChars{
	static int checkDup(String x){
		char temp = ' ';
		char temp1 = ' ';
		int len = x.length();
		
		for(int i=0;i<len;i++){
			temp = x.charAt(i);
			for(int j=0;j<len;j++){
				if(j!=i){
					if(temp == (x.charAt(j))){
						return -1;
					}
				}
			}
		}
		
		return 0;
	}
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
		String s = "pwwkew";
		String temp = "";
		int l=0;
		int ans=0;
		int maxlen = Integer.MIN_VALUE;
		
		int size = s.length();
		
		for(int start=0;start<size;start++){
			for(int end=start;end<size;end++){
				for(int i=start;i<=end;i++){
					temp+=s.charAt(i);
				}
				ans = checkDup(temp);
				if(ans==0){
					l = temp.length();
					if(l>maxlen){
						maxlen = l;
					}
				}
				temp="";
			}
		}
		System.out.println("max len w/o repeating substring: "+maxlen);
    }
}
