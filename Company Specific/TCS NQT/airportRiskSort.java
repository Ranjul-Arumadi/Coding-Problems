import java.util.*;
class airportRiskSort{
    public static void main(String [] args){
        int a[] = {1,0,2,0,1,0,2};
		
		int l = a.length;
		int t=0;
		for(int i=0;i<l;i++){
			for(int j=0;j<l-i-1;j++){
				if(a[j]>a[j+1]){
						t = a[j];
						a[j] = a[j+1];
						a[j+1] = t;
				}
			}
		}
		
		for(int i=0;i<l;i++){
			System.out.print(a[i]+" ");
		}
    }
}
