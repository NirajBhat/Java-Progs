import java.util.*;


class InsertionSort{

public static void main(String args[]){

Scanner sc = new Scanner(System.in);
System.out.println("Please enter the total number of strings to be entered");
   int size=sc.nextInt();
String str[]= new String[size];

for(int i=0;i<size;i++){
System.out.println("please enter"+(i+1)+"string");
  str[i]=sc.next();
}

for(int i=1;i<size;i++){
for(int j=i;j>0;j--){
if(str[j-1].compareTo(str[j])>0){
String temp=str[j];
str[j]=str[j-1];
str[j-1]=temp;
  }
}
}

  System.out.println("sorted string are:");
System.out.println(Arrays.toString(str));

}
}
