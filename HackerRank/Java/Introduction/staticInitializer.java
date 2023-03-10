/*
Link: https://www.hackerrank.com/challenges/java-static-initializer-block/problem?isFullScreen=true
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {


static Scanner s = new Scanner(System.in);

static int B = s.nextInt();
static int H = s.nextInt();
static boolean flag = true;

static{
    try{
        if(B<0 || H<0){
            flag = false;
            s.close();
            throw new Exception("Breadth and height must be positive");
            
        }
    }
    catch(Exception e){
        System.out.println(e);
    }

    s.close();
}



public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class

