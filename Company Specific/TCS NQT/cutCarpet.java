/*
A carpet manufacturing industry has newly ventured into the carpet installation business. All the carpets 
manufactured are large squares in shape. To install, each carpet has to be cut into shapes of squares or 
rectangles. The number of slits to be made is given as N.
The task is to find the maximum number of equal squares or rectangles that can be achieved using N slits.
Note:
The square carpet can be cut only using horizontal or vertical slits.
Cuttings are done on a single carpet which should be rolled out completely i.e. no folding or stacking is 
allowed.
Squares or rectangles cut should be equal size. 
Example 1:
Input:
4 → Value of N(No. of cuts)
Output:
9 → maximum number of equal squares or rectangle
*/
import java.util.*;
class cutCarpet{
    public static void main(String [] args){
        int n=4;
		int x = n/2;
		System.out.println((x+1)*(n-x+1));
		
		
    }
}
