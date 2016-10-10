

import java.util.*;
import java.util.Scanner;



public class Array2D{
	public static void main(String[] args){
		int row,column,choice;
		
		Scanner u = new Scanner(System.in);

		System.out.println("Please choose which type of array you want to create :");
		System.out.println(" 1.Integer \n 2.Double \n 3.Boolean");
		choice = u.nextInt();
		//Using switch case for perticular choice
		switch(choice){
			case 1:{
				System.out.println("Please Enter no. of Rows :");
					row = u.nextInt();
				System.out.println("Please Enter no. Columns :");
					column = u.nextInt();
					Integer array[][] = new Integer[row][column];

					//taking array input from user
					for(int i=0;i<row;i++){
						for(int j=0;j<column;j++){
						System.out.print("Please enter Element at position ("+i+","+j+"): ");
						array[i][j] = u.nextInt();
					}
				}
		
				//Array Printing function from Utility class
				System.out.println("Array is");
				System.out.println(array);
				break;
			}

			case 2:{
				System.out.println("Please Enter no. of Rows :");
					row = u.nextInt();
				System.out.println("Please Enter no. Columns :");
					column = u.nextInt();
					Double array[][] = new Double[row][column];

					//taking array input from user
					for(int i=0;i<row;i++){
						for(int j=0;j<column;j++){
						System.out.print("Please enter Element at position ("+i+","+j+"): ");
						array[i][j] = u.nextDouble();
					}
				}
		
				///Array Printing function from Utility class
				System.out.println("Array is");
			System.out.println(array);
				break;
			}

			case 3:{
				System.out.println("Please Enter no. of Rows :");
					row = u.nextInt();
				System.out.println("Please Enter no. Columns :");
					column = u.nextInt();
					Boolean array[][] = new Boolean[row][column];

					//taking array input from user
					for(int i=0;i<row;i++){
						for(int j=0;j<column;j++){
						System.out.print("Please enter Element at position ("+i+","+j+"): ");
						array[i][j] = u.nextBoolean();
					}
				}
		
				//Array Printing function from Utility class
				System.out.println("Array is");
				System.out.println(array);
				break;
			}
	
		}


	}	
}
