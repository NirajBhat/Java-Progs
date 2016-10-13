package com.bridgelabz.programs;
import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;
import com.bridgelabz.util.Utility;
 public class Palindrome{
      @SuppressWarnings("unchecked")
    public static void main(String[] args){
      Utility u = new Utility();
      Queue list = new LinkedList(); // First in first out or FIFO
      Stack stack = new Stack();     // Last in first out or LIFO
      System.out.println("Enter the String to check..."); // Details to check palindrome of given string
      String string;
      string = u.inputString();
      int size = string.length(); // Length of the given string is stored in size
      
       // adding or pushing the elements to stack and queue
       for(int i=0;i<size;i++){
       stack.push(string.charAt(i));
       list.add(string.charAt(i));
       }
       // checking for palindrome
       if(stack.pop().equals(list.remove()))
         System.out.println("its a palindrome.");
       else
         System.out.println("its not the palindrome");
       }
     }
       
      
