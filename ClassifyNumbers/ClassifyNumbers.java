package ClassifyNumbers;

/** ClassifyNumbers.Java
 *  @version V1.01
 *  @author Israel Uzcategui
 *  @since 2023-12-04
 */ 


// import utilities
import java.util.*;
import java.io.*;

// start ClassifyNumbers class
public class ClassifyNumbers {

// start scanner object
static Scanner console = new Scanner(System.in);
// start BufferedReader


    // start main method
    public static void main(String[] args) {

        // declaration phase

        String decision;

        // initialization phase
        int[] fixnums = {0, -2, -3, -5, 6, 7, 8, 0, 3, 0, -23, -8, 0, 2, 9, 0, 12, 67, 54 };
        int zerocount = 0;
        int evencount = 0;
        int oddcount = 0;
        int remainder = 0;
        int counter = 0;

        // Processing phase
        
        System.out.println();
        System.out.println(" This program reads a given set of integers and then prints the number of odd integers, the number of even integers, and the number of zeros. ");
        System.out.println();
        System.out.println(" This program can read 20 integers or any set of numbers ");


        boolean yn = true;
        {
        System.out.println();
        System.out.println(" Do you want it to read the preset 20 numbers? Y\\N");
        decision = console.nextLine();

        switch(decision)
        {
            case "y":
                yn = false;
                break;
            case "n":
                yn = true;
                break;

        }

        while(!yn) {

            for (counter = 0; counter < 19; counter++) {
                remainder = fixnums[counter] % 2;
                switch (remainder){
                    case 0:
                    evencount ++;
                        if (fixnums[counter] == 0){
                        
                    zerocount ++;
                    }
                    break;
               
                case 1: case -1:
                oddcount++;
                break;

                }


            }
            System.out.println();
            System.out.println(" The preset numbers are " + (Arrays.toString(fixnums)));
            System.out.println();
            System.out.println(" there are  "+ evencount + " evens including " + zerocount + " zeroes ");
            System.out.println();
            System.out.println(" and there are " + oddcount + " odds ");

            System.exit(0);


        } // end while yes statement



        } // end boolean

        { 
            System.out.println(" Do you want the numbers to be randomly generated? Y\\N ");
              
        }

        // output phase


        
    } // end main method










} // end ClassifyNumbers class