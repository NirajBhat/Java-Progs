package com.bridgelabz.programs;
import java.util.Scanner;
import com.bridgelabz.util.Utility;


class Coinflip
{
public void randFlip(int num){
		double head=0,tail=0,random;
		for(int i=1; i<=num; i++){
			random = Math.random(); //to get randome value between 0 to 1;
			if(random<0.5){
					tail++;	
			}
			else{
					head++;
			}
		}
		System.out.println("Percentage of heads ="+(head/num)*100+"%");
		System.out.println("Percentage of tails ="+(tail/num)*100+"%");
			
	}
public static void main (String[] args)
{
 System.out.println("Enter the Number");
 int num;
  Utility u = new Utility();
  num=u.inputInteger();
  Coinflip cf =new Coinflip();
  cf.randFlip(num);
  
}
}
