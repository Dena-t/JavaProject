package Project;

import java.lang.*;
import java.util.*;
public class ClassifyNumbers{
public static void main(String[] args) {
    int zeros;
    int evens;
    int odds;
    int number;
    int counter;
    int reminder;
    Scanner console;
    

    zeros = 0;
    evens = 0;
    odds =0;
    number =0;
    counter =0;
    reminder =0;
    console = new Scanner(System.in);

    
    
     System.out.println("Please enter a number:");
     number = console.nextInt();
     reminder = number % 2 ;
    switch (reminder){
        case 0:
        System.out.println("number is even");
        evens ++;
        break;
        case 1:
        System.out.println("number is odd");
        odds ++;
        break;

        case -1:
        System.out.println("number is odd and negative");
        odds ++;
        break;
        }
         
  

}
}





