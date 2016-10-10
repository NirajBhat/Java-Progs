package com.bridgelabz.programs;
import com.bridgelabz.util.Utility;

public class Triples{
	public static void main(String[] args){
		Utility u = new Utility();
		System.out.println("Please Enter the no. of Elements");
		int size = u.inputInteger();
		int count = 0;
		int array[] = new int[size];
		//taking array of numbers from user
		for(int i=0;i<size;i++){
			System.out.println("Please enter element at position "+(i+1));
			array[i] = u.inputInteger();
		}
		
		//to find triples
		for(int i=0;i<size-2;i++){  //taking size value as 3 = size-2=1 , condition satisfied enter to j with value 1
			for(int j=i+1;j<size-1;j++){  // now j=1 => j=3-1=2 , condition satisfied enter to k with value 2
				for(int k=j+1;k<size;k++){  
					if(array[i]+array[j]+array[k] == 0){
						System.out.println("Triples are :"+array[i]+" "+array[j]+" "+array[k]);
						count ++;
					}
				}
			}
		}
		if(count != 0)
			System.out.println("Total number of Tripels in given list is: "+count);
		else
			System.out.println("Triples are Not Present");

	}
}
