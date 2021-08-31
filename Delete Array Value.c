/******************************************************************************

Q. Delete an element from array.

Search and shift values

1. Read the element to deleted
2. Loop through the array untill you find the elemet to be deleted
3. Store the location of the 'to be deleted' element
4. In a new loop move the elements one space behind [shifting]
5. While printing output loop till size-1 to remove the repeting element that will appear at the end of the array.


Output Screenshot: https://github.com/Ranjul-Arumadi/Coding-Problems/blob/main/Output%20Screenshots/DeleteArrayElement.jpg

*******************************************************************************/

// Delete element from an array

#include <stdio.h>
int main()
{
    int a[5]={1,2,3,4,5};
    int del=3; //element to be deleted
    for(int i=0;i<5;i++){
        if(a[i]==del){ //search for the element to be deleted
            int start=i; //location of the searched element
            for(int j=i+1;j<5;j++){
                a[start++]=a[j]; //move values one space ahead
            }
        }
    }
    printf("Output: ");
    for(int i=0;i<4;i++){ //print till given size - 1  
        printf("%d \t",a[i]);
    }

    return 0;
}
