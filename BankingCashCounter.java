package com.bridgelabz.programs;
import java.util.*;
import java.util.Scanner;
import com.bridgelabz.programs.BankingOperation;

public class BankingCashCounter{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		BankingOperation bo = new BankingOperation();//object created of previous code as BankingOpreation
		int choice;
		boolean check = true;
        //while condition for user to input values
		while(check){
			System.out.println("\nPlease choose your option:\n1.Deposit\n2.Withdraw\n3.Balance Info\n4.Exit");
			choice = s.nextInt();
            //switch statement used to provide user the options to select
			switch(choice){
				case 1:{
					bo.deposit(choice);
					break;
				}
				case 2:{
					bo.withdraw(choice);
					break;
				}
				case 3:{
					bo.getBalance();
					break;
				}
				case 4:{
					System.out.println("Exit");
					check = false;
					break;
				}
				default:{
					System.out.println("Entered Wrong Choice");
						break;
				}
			}//end of switch
		}//end of while
		
		System.out.println("\nTotal number of Deposits and Withdraws: "+bo.operations());
	}
}

