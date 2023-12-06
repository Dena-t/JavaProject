package finalProgram1;

/** ClassifyNumbers.Java
 *  @version V4.01
 *  @author Dena Torabi, Israel Uzcategui 
 *  @since 2023-12-04
 */ 
// import utilities
import java.util.*;

// start ClassifyNumbers class
public class ClassifyNumbersv4{

// start scanner object
static Scanner console = new Scanner(System.in);
// start BufferedReade

    // start main method
    public static void main(String[] args) {

        // declaration phase

        Character decision;
        Character continueAns;

        // initialization phase
        int[] fixnums = {0, -2, -3, -5, 6, 7, 8, 0, 3, 0, -23, -8, 0, 2, 9, 0, 12, 67, 54 };
         do{ 
        int zerocount = 0;
        int evencount = 0;
        int oddcount = 0;
        int remainder = 0;
        int counter = 0;

        // Processing phase
      
        System.out.println();
        System.out.println(" This program can read a given set of integers and then prints the number of odd integers, the number of even integers, and the number of zeros. ");
        System.out.println();
        System.out.println(" Do you want it to read the preset 20 numbers? Y\\N");
        decision =  console.next().charAt(0);


        if (decision =='y' || decision =='Y'){
                System.out.println(" The preset numbers are " + (Arrays.toString(fixnums)));
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

    } else {


            System.out.println(" How many integers you want to analyze?");
            
            int size = console.nextInt(); 
            int[] arr = new int[size];

              System.out.println(" Please enter "+ size+" integers , positive, negative or zeros:");

                 for(counter=0;counter<size; counter++){
                     arr[counter] = console.nextInt();
                     remainder = arr[counter] % 2 ;
                         switch (remainder){
                               case 0:
                                evencount ++;
                                if (arr[counter] == 0){
                                    zerocount++;
                                     } 
                                        break;

                                case 1: case -1:
                                oddcount ++;
                                        break;
                                     }

        }

   }
  
            System.out.println();
            System.out.println();
            System.out.println(" there are  "+ evencount + " evens including " + zerocount + " zeroes ");
            System.out.println();
            System.out.println(" and there are " + oddcount + " odds ");
            System.out.println("do you want to continue y/n?");  
            continueAns = console.next().charAt(0);
            
        

    }while (continueAns == 'y' || continueAns == 'Y'); // do while /

} // end ClassifyNumbers class
}
