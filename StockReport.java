package com.bridgelabz.programs;
import java.util.Scanner;

public class StockReport{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		Stockinput si = new Stockinput();
		int stockNumber;
		System.out.println("Please Enter No. of Stocks: ");
		stockNumber = in.nextInt();
		 
		si.entry(stockNumber);
		si.calculate();
		si.totalval();
	}
}
