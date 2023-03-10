/*
Link: https://www.hackerrank.com/challenges/java-stdin-stdout/problem?isFullScreen=true
*/

/*
Issue with nextLine() after nextInt():

after the nextInt(), the cursor will stay after the number and wont read the string value.

Solve by putting a dummy nextLine() after the nextInt() before doing the actual nextLine().


*/

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // <<dummy nextLine()>>
        int i = scan.nextInt(); scan.nextLine();

        // <<dummy nextLine()>>
        Double d = scan.nextDouble(); scan.nextLine();
        
        String s = scan.nextLine();
        
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
