package Project;

import java.util.*;
public class ClassifyNumbers{
public static void main(String[] args) {
    int zeros;
    int evens;
    int odds;
    int remainder;
    int counter;
    int size;
    Scanner console;
    
    size = 0;
    zeros = 0;
    evens = 0;
    odds =0;
    counter =0;
    remainder =0;
    console = new Scanner(System.in);

    System.out.println(" How many integers you want to analyze?");
    size = console.nextInt(); 

   int[] arr = new int[size];
   System.out.println(" Please enter "+ size+" integers , positive, negative or zeros:");

   for(counter=0;counter<size; counter++){
    arr[counter] = console.nextInt();
    remainder = arr[counter] % 2 ;
     switch (remainder){
        case 0:
       // System.out.print(" Number you entered is even");
        evens ++;
           if (arr[counter] == 0){
            // System.out.println(" and it is 0");
             zeros++;
               } 
        break;
        case 1: case -1:
       // System.out.println();
       // System.out.println(" Number you entered is odd");
        odds ++;
        break;

        }

   }


    

         System.out.println();
         System.out.printf("%s %d %s %d %s %n","There are : ",evens," evens which also includes: ",zeros," zero(s)" );
         System.out.println();
         System.out.println("Total number of odds is: "+ odds);
       
 
  
   }


}





