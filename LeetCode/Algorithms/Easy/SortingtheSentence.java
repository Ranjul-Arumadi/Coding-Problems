/*
  link: https://leetcode.com/problems/sorting-the-sentence/
  
  A sentence is a list of words that are separated by a single space with no leading or trailing spaces. Each word consists of lowercase and uppercase English letters.

  A sentence can be shuffled by appending the 1-indexed word position to each word then rearranging the words in the sentence.

  For example, the sentence "This is a sentence" can be shuffled as "sentence4 a3 is2 This1" or "is2 sentence4 This1 a3".
  Given a shuffled sentence s containing no more than 9 words, reconstruct and return the original sentence.



  Example 1:

  Input: s = "is2 sentence4 This1 a3"
  Output: "This is a sentence"
  Explanation: Sort the words in s to their original positions "This1 is2 a3 sentence4", then remove the numbers.
*/
class Solution {
    public String sortSentence(String s) {
        
	
		String a[] = s.split(" ");
        
        int l = a.length;
        String b[] = new String[l];
        
        String temp = "";
        char num = ' ';
        int val = 0;
        for(int i=0;i<l;i++){
            temp = a[i];
            num = temp.charAt(temp.length()-1);
			//System.out.println("num="+num);
            
			val = num - '0';
            //System.out.println(val+"    ");
            b[val-1] = temp;
        }
		
		String c[] = new String[l];
		String temp2="";
		for(int i=0;i<l;i++){
			temp = b[i];
			for(int j=0;j<temp.length()-1;j++){
				temp2+=temp.charAt(j);
			}
			c[i] = temp2;
			temp2="";
			
		}	
		String out = "";
		for(int i=0;i<l;i++){
			out+=c[i];
			
			if(i!=l-1){
				out+=" ";
			}
		}
		return out;
        
        
    }
}
