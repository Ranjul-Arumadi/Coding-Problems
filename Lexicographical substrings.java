/*
Q: Ouput the lexicographically highest and lowest substring of an input string with substring size given

Notes:
------

Steps:

1. Read string and substring size
2. Calculate the length of the input string
3. Determine number of possible substrings as 'string length-substring size-1'
4. Create an array of this size(step 4)
5. Iterate throught the string and store the substrings to array in step 4
6. Sort the array
7. Value at index 0 gives lexicographically lowest substring and value at index length-1(step 2) gives lexicographically highest substring


Output screenshot: https://github.com/Ranjul-Arumadi/Coding-Problems/blob/main/Output%20Screenshots/Lexicographical%20substrings.jpg
*/

/*-------------------------Solution in Java-------------------------*/
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    String a;
    int b;
    System.out.println("Enter String: ");
    a = s.next(); //read string
    System.out.println("Enter sub-string length: ");
    b = s.nextInt(); //read integer (substring size)
    
    int len = a.length()-b+1;  //calculate number of substrings possible 
    String[] A =new String[len];  //create string array
    
    String temp;
    for(int i=0;i<len;i++){
        A[i] = a.substring(i,i+b);  //save substrings to string array
    }
    
    Arrays.sort(A); //sort the array
    System.out.println("lexicographically lowest substring: ");
    System.out.println(A[0]); //outputs lexicographically lowest substring
    System.out.println("lexicographically highest substring: ");
    System.out.println(A[len-1]); //outputs lexicographically highest substring
   
    
    }
        
}
