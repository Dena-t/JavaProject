package Project;

import java.util.*;
public class ClassifyNumbers{
public static void main(String[] args) {
    int zeros;
    int evens;
    int odds;
    int number;
    int counter;
    int remainder;
    int i;
    Scanner console;
    

    zeros = 0;
    evens = 0;
    odds =0;
    number =0;
    counter =0;
    remainder =0;
    console = new Scanner(System.in);
 
 
   System.out.println("Please enter 20 integers , positive,negaruve or zeros"); 

   for(i=0;i<=19;i++){

/*Uncomment if you want to ask user to enter the count of numbers manually */
  // System.out.println("How many integers you want to enter?");
   // counter = console.nextInt();
    //for (i=1;i<=counter;i++){
        System.out.println("Enter number "+ i + "`s value");
        number = console.nextInt();
        remainder = number % 2 ;
 
    switch (remainder){
        case 0:
        System.out.println("number you entered is even");
        evens ++;
           if (number == 0){
             System.out.println("Number is 0");
             zeros++;
               } 
        break;
        case 1: case -1:
        System.out.println("number you entered is odd");
        odds ++;
        break;

        }
    console.close();
}

        System.out.printf("%s %d %s %d %s %n","there are",evens,"evens which also includes ",zeros,"zeros" );
         System.out.println();
         System.out.println("Total number of odds is "+ odds);
       
 
  
   }


}
//}





