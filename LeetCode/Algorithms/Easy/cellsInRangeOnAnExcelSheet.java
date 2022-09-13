/*
  link: https://leetcode.com/problems/cells-in-a-range-on-an-excel-sheet/
  
  A cell (r, c) of an excel sheet is represented as a string "<col><row>" where:

	<col> denotes the column number c of the cell. It is represented by alphabetical letters.
	For example, the 1st column is denoted by 'A', the 2nd by 'B', the 3rd by 'C', and so on.
	<row> is the row number r of the cell. The rth row is represented by the integer r.
	You are given a string s in the format "<col1><row1>:<col2><row2>", where <col1> represents the column c1, <row1> represents the row r1, <col2> represents the column c2, and <row2> represents the row r2, such that r1 <= r2 and c1 <= c2.

	Return the list of cells (x, y) such that r1 <= x <= r2 and c1 <= y <= c2. The cells should be represented as strings in the format mentioned above and be sorted in non-decreasing order first by columns and then by rows.

	 

	Example 1:


	Input: s = "K1:L2"
	Output: ["K1","K2","L1","L2"]
	Explanation:
	The above diagram shows the cells which should be present in the list.
	The red arrows denote the order in which the cells should be presented.
*/
class Solution {
    public List<String> cellsInRange(String s) {
        int l = s.length();
        char a = ' ', b=' ';
        int st = 0, e=0;
        
        a = s.charAt(0);
        b = s.charAt(3);
        
        st = s.charAt(1) - '0';
        e = s.charAt(4) - '0';
        
        String temp="";
        List<String> ans = new ArrayList<String>();
        for(char i=a;i<=b;i++){
            for(int j=st;j<=e;j++){
                temp=temp+i+j;
                ans.add(temp);
				temp="";
            }
        }
		
		return ans;
    }
}
