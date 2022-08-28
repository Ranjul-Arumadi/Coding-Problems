/*
Q: Display sub-array with largest sum
Notes:
------

Number of sub-arrays possible for array with n elements is : (n*(n+1))/2
The innermost nested loop can calculate the sum from indices set by the the 2 outer loops.

Sub-arrays example:

array - [1,2,3]
sub-arrays - [1], [2], [3], [1,2], [2,3], [1,2,3] 

Output screenshot: https://github.com/Ranjul-Arumadi/Coding-Problems/blob/main/Output%20Screenshots/Sub-array%20with%20largest%20sum.jpg
*/

/*-------------------------Solution in C-------------------------*/
#include<stdio.h>
int main(){
	int size,i,j,k,subarraySize,globalMax,localMax,sum,start,end;
	printf("Enter array size: ");
	scanf("%d", &size);
	int arr[size];
	subarraySize = (size*(size+1))/2;
	printf("Enter array values: ");
	for(i=0;i<size;i++){
		scanf("%d", &arr[i]);
	}
	printf("Inserted array will have %d sub-arrays.\n", subarraySize);
	//finding sub-array with largest sum
	globalMax = arr[0];
	for(i=0;i<size;i++){
		for(j=i;j<size;j++){
			for(k=i;k<=j;k++){
				localMax+=arr[k];
			}
			if(localMax>globalMax){
				globalMax = localMax;
			}
			localMax=0;
		}
	}
	printf("Largest sub-array sum is: %d\n", globalMax);
	//displaying the sub-array
	for(i=0;i<size;i++){
		for(j=i;j<size;j++){
			for(k=i;k<=j;k++){
				localMax+=arr[k];
			}
			if(localMax==globalMax){
				start=i;
				end=j;
				printf("Largest sub-array is: ");
				printf("[");
				for(int x=i;x<=j;x++){
					printf("%d",arr[x]);
					if(x!=j){						//used for only styling the output
					printf(",");
					}
				}
				printf("]");
				break;
			}
			localMax=0;
		}
	}
	return 0;
}
