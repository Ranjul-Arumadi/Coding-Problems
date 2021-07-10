/*
Q: Reverse string using stack

Notes:
------

Push character by character into the stack
Popping them will return the string in reverse order
This way the string can be reversed

*/

/*-------------------------Solution in C-------------------------*/
#include<string.h>
#include<stdio.h>
int top=-1;
int main(){
	int size,stringLength;
	char temp;
	char input[20];
	printf("Enter string: ");
	scanf("%s", input);
	stringLength = strlen(input);
	char stack[stringLength];
	
	for(int i=0;i<stringLength;i++){
		
		if(top == stringLength-1){
			printf("Stack overflow!");
		}
		else{
			printf("Pushing %c to stack index %d\n",input[i],i);
			stack[++top] = input[i];
		}
	}
	printf("Popping elements to reverse the string\n Output: ");
	for(int i=0;i<stringLength;i++){
		if(top==-1){
			printf("Stack is empty");
		}
		else{
			temp = stack[top--];
			input[i] = temp;
		}
	}
	printf("%s",input);
	return 0;
}
