/*
An element is called a peak element if its value is not smaller than the value of its adjacent elements(if they exists).

This means that for any element A we consider with index = x then value at index-1 and value at index+1 should not be greater than the elment A. 

Simple approaches:
Simple sorting gives us the answer at the end indexes.

O(log n) approach:
This makes use of bainry search algo.


*/
// 1 2 |3| 4 5
int peakElement(int arr[], int n)
{
   // Your code here
   int start = 0, end = n-1;
   int mid = (start+end)/2;
  
   while(start<=end){
       mid = (start+end)/2;
       
        // 1 2 |1| 4 5
        // then mid value wont be ans, so start from mid+1
        if(arr[mid] < arr[mid+1]) {
            start = mid+1;
        }
     
        // 1 4|1| 4 5
        // then mid value wont be ans, so start from mid-1
        else if(arr[mid] < arr[mid-1]){
             end = mid-1;  
        } 
        else{
            return mid;
        }
   }
  // final return value
   return mid;
}

