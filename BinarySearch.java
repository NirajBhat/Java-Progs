package com.bridgelabz.programs;
import java.util.Scanner;
import java.util.*;

public class BinarySearch{
	public static void main(String[] args){
		int size,start,end,mid,count = 0; 
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter Strings");
		String names = sc.next();
		//spliting the string using comma and stored into array 
		//Syntax : string.split(String regex) where regex is the delimiting regular expression.
		String str1[] = names.split(",");
		size = str1.length;
		String str2;
		System.out.println("Please Enter the string to be find :");
		str2 = sc.next();
                //Sorting the string
		for(int i=1;i<size;i++){
			for(int j=i;j>0;j--){
				if(str1[j-1].compareTo(str1[j])>0){
					String temp = str1[j];
					str1[j] = str1[j-1];
					str1[j-1] = temp;
				}
			}
}
                 System.out.println("The Sorted String is : ");
                System.out.println((Arrays.toString(str1)));	

		
		start = 0;
		end  = size-1;

		while(start <= end){
			mid = (start+end)/2;
			if (str2.compareTo(str1[mid])==0){
				System.out.println("\nSearch found at position :"+mid);
				count++;
				break;
			}
			if(str2.compareTo(str1[mid])<0)
				end = mid-1;
			else
				start = mid+1;		
		}
		if(count == 0)
			System.out.println("\nSearch not found");		
		
	}
}
