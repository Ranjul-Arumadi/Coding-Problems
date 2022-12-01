import java.util.*;
import java.lang.*;

public class binaryToDecimal {
    public static void main(String args[]){
        String input = "1011";
        int l = input.length();

        double decimal=0;
        int digit =0;
        int p=0;
        for(int i=input.length()-1;i>=0;i--){
            digit = input.charAt(i) - '0';
            decimal=decimal+ (digit*Math.pow(2,p++));
        }
        

        //odd - -1 even - /2
        int d = (int)decimal;
        int c=0;
        while(d>0){
            if(d%2!=0){
                d-=1;
            }
            else{
                d/=2;
            }
            c++;
        }
        System.out.println(c);
    }

}
