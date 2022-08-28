// { Driver Code Starts
// Initial Template for C

#include <stdio.h>

struct pair {
    long long int min;
    long long int max;
};

struct pair getMinMax(long long int arr[], long long int n) ;

int main() {
    long long int t, n, a[100002], i;
    struct pair minmax;

    scanf("%lld", &t);
    while (t--) {
        scanf("%lld", &n);

        for (i = 0; i < n; i++) scanf("%lld", &a[i]);
        minmax = getMinMax(a, n);
        printf("%lld %lld\n", minmax.min, minmax.max);
    }
    return 0;
}// } Driver Code Ends


// User function Template for C

struct pair getMinMax(long long int arr[], long long int n) {
    
    long long int min = arr[0];
    long long int max = arr[0];
    struct pair p;
    for(int i=1;i<n;i++){
        if(arr[i]>max){
            max = arr[i];
        }
        
        if(arr[i]<min){
            min = arr[i];
        }
    }
  // simply iterate throught the array, compare and update variable. O(n) complexity.
    p.min = min;
    p.max = max;
    
    return p;
    
}
