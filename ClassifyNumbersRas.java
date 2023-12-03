/**  ClassifyNumbers.java

@author Israel Uzcategui


*/


// import tools
import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;

public class ClassifyNumbersRas { // start ClassifyNumbers class

   

    public static void main(String[] args) throws IOException{ // start main method

    int zeros = 0;
    int evens = 0;
    int odds = 0;
    int number = 0;
    int counter = 0;
    int remainder = 0;

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
        // array
        int num[] = new int[20];

        System.out.println("Enter the integer values separated with spaces ");

            // split the values
        String[] val = br.readLine().split(" ");

        // parse the values
        for (int i = 0; i < val.length; i++) {
            num[i] = Integer.parseInt(val[i]);

         }

         for (int i = 0; i < val.length; i++) {
            remainder = i % 2;
            switch (remainder){
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







    } //end main method






    
} // end ClassifyNumbers class
