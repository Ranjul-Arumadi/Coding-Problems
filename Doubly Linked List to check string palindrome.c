/*
Q: Use Doubly Linked List to check whether the input string is a  palindrome or not.
Notes:
------
Storing one letter per node
Iterate over the nodes while checking if the nodes at end positions are same

Output screenshot: https://github.com/Ranjul-Arumadi/Coding-Problems/blob/main/Output%20Screenshots/Reverse%20string%20using%20stack.jpg
*/

/*-------------------------Solution in C-------------------------*/
#include<string.h>
#include<stdlib.h>
#include<stdio.h>
struct node{
	char letter;
	struct node *next;
	struct node *prev;
}*head,*newhead,*temp,*newtemp,*new;
int main(){
	int i,length,flag=1;
	char input[20];
	printf("\nEnter String: ");
	scanf("%s",input);
	length = strlen(input);
	for(i=0;i<length;i++){ 	//storing one letter per node
	
		new = (struct node *)malloc(sizeof(struct node));
		new->letter = input[i]; 
		new->next = NULL;
		new->prev = NULL;
		
		if(head==NULL){
			head = new;
			temp = new;
		}
		else{
			new->prev = temp;
			temp->next = new;
			temp = new;
			temp->next = NULL;
		}
	}
	
	/*
	//printing
	newhead = head;
	while(newhead!=NULL){
		printf("%c",newhead->letter);
		newhead = newhead->next;
	}*/
	
	newhead = head;
	newtemp = temp;
	for(i=0;i<length;i++){	//iterating over the nodes checking if the nodes at end positions are same
		if(newhead->letter!=newtemp->letter){
			flag=0;
			break;
		}
		else{
			flag=1;
		}
		newhead = newhead->next;	
		newtemp = newtemp->prev;
	}
	if(flag==0){
		printf("Not palindrome");
	}
	else{
		printf("Palindrome");
	}
	return 0;
}
