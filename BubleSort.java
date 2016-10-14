package com.bridgelabz.programs;
import java.util.*;
  public class BubleSort{
   public static void main(String[] args){
     int n,c,d,swap;
     System.out.println("Enter the integer");
     Scanner s = new Scanner(System.in);
     n = s.nextInt();
     int array[] = new int[n]; // creating an array & assign the value
     
     System.out.println("Enter the "+ n +" integer ");
     for(c=0;c<n;c++)
     array[c] = s.nextInt();   // store in the array
      
     for(c=0;c<(n-1);c++){
     for(d=0;d<n-c-1;d++){
     if (array[d]>array[d+1])   // using for descending order 
     {
        swap = array[d];
        array[d]=array[d+1];
        array[d+1]=swap;
      }
     }   
    }
        
        System.out.println("The sorted array/number is:");
        for(c=0;c<n;c++);
        System.out.println(array[n]);
     }
}
