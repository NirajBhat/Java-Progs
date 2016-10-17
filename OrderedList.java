package com.bridgelabz.programs;
import com.bridgelabz.util.Utility;
import com.bridgelabz.programs.NodeFunction;
import java.io.File;

public class OrderedList{
	public static void main(String[] args){
		Utility u = new Utility();
		NodeFunction node = new NodeFunction();
		File file = new File("Order.txt"); // which reads the given file
		String string= u.readFile(file); //reading file method of Utility class is called.
		System.out.println("Contents of file are: "+string);
		string = string.trim();
		String strArray[] = string.split(" ");
		
		for(int i=0;i<strArray.length;i++){// compare to the array length
			node.addNode(Integer.parseInt(strArray[i]));
		}
		
		System.out.print("List Elements are: ");
		node.showList();// to display the list of elements

		System.out.print("\nPlease Enter the element you want to Search: ");
		int value = u.inputInteger();
		node.search(value);
	}
}

