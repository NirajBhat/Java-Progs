package com.bridgelabz.programs;

import java.util.Stack;
import com.bridgelabz.util.Utility;
 public class BalancedParentheses{
  @SuppressWarnings("unchecked")
   public static void main(String[] args){
        Utility sc = new Utility();
        String string = new String();
        System.out.println("Enter the Mathametical expressions.. to view ");
        string = sc.inputString();
       
        Stack stack = new Stack();  // creating stack object
        //push and pop while brackets occur
        for(int i=0;i<string.length();i++){
         if(string.charAt(i) == '{'){
             stack.push('{');
           }
          if(string.charAt(i) == '['){
              stack.push('[');
           }
        
          if(string.charAt(i) == '('){
              stack.push('(');
           }
           if(string.charAt(i) == ')'){
              stack.pop();
           }
            if(string.charAt(i) == ']'){
              stack.pop();
           }
            if(string.charAt(i) == '}'){
              stack.pop();
           }
         }
          // checking for result
         if(stack.empty())
          System.out.println("Balanced expression");
          
          else
          System.out.println("its not balanced...plz try again");
          }
         }         
