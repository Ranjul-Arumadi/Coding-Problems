/*
Link: https://www.hackerrank.com/challenges/java-end-of-file/problem?isFullScreen=true
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner s = new Scanner(System.in);
        List<String> l = new ArrayList<>();
        while(s.hasNext()){
            l.add(s.nextLine());
        }
        
        int i=1;
        for(String x:l){
            System.out.println(i+" "+x);
            i++;
        }
    }
}

OR 


BETTER-METHOD

    int number = 0;
    while (sc.hasNext()){
        String file = sc.nextLine();
        number ++;
        System.out.println(number + " " + file); 
    }
