/*
Q: Fizz Buzz
   
   short program that prints each number from 1 to 100 on a new line. 

   > For each multiple of 3, print "Fizz" instead of the number. 

   > For each multiple of 5, print "Buzz" instead of the number. 

   > For numbers which are multiples of both 3 and 5, print "FizzBuzz" instead of the number.
   
   example output: 
   
   1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, 
   Fizz Buzz, 16,....etc

Notes:
------

Simple login using if and else if, the only catch is that you will get error if you implement as per the order of the statement. The logic
has to be implemented from the bottom most statement as it involves two conditions. 

Output screenshot: https://github.com/Ranjul-Arumadi/Coding-Problems/blob/main/Output%20Screenshots/Fizz%20Buzz.jpg
*/

/*-------------------------Solution in C++-------------------------*/
#include <iostream>
using namespace std;
int main()
{
    for(int i=1;i<=100;i++){
        if((i%3 == 0) && (i%5==0))
            cout<<"FizzBuzz\n";
        else if(i%3 == 0)
            cout<<"Fizz\n";
        else if(i%5 == 0)
            cout<<"Buzz\n";
        else
            cout<<i<<"\n";
     }
    return 0;
}
