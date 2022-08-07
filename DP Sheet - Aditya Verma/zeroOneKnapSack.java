import java.util.*;
class zeroOneKnapSack{
	
	static int knapsack(int weight[], int value[],int capacity,int size){
		int n = size;
		//BASE
		if(size==0 || capacity==0){
			return 0;
		}
		else if(weight[n-1]>capacity){
			return knapsack(weight, value, capacity, n-1);
		}
		else if(weight[n-1]<=capacity){
			return Math.max(knapsack(weight, value, capacity, n-1), (value[n-1]+ knapsack(weight, value, capacity - weight[n-1], n-1)));
		}
		return 0;
	}
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
		
		int value[] = {60,100,120};
		int weight[] = {10,20,30};
		
		int capacity = 50;
		
		int size = weight.length;
		
		int maxProfit = knapsack(weight, value, capacity, size);
		System.out.println("Max prfit: "+maxProfit);
    }
}
