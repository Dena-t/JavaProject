
import java.util.Scanner;

//use for loop and switch to find the odd number and even number, then count them and print out
public class NumberCount {

    public static void main(String[] args) {

        int TotalNo;
        int inputNo;
        int OddNumber;
        int EvenNumber;

        Scanner data;

        data=new Scanner(System.in);

        
        EvenNumber=0;
        OddNumber=0;

        
        for(TotalNo=1; TotalNo<=20; TotalNo++){
        //input 20 times of numbers, each number could be different    
         //ask user to entre number
        System.out.println("Please entre your number");
        inputNo=data.nextInt();
       
            
        //use switch to declair the input number is odd or even    
            switch (inputNo%2) {
                case 0://if input number could divide by 2 and get 0 at the end, we could say this number is even
                    EvenNumber++;//total even number +1
                    System.out.println("This number is even number");
                    break;
                case 1://if input number could not divide by 2 and get 0 at the end, we could say this number is odd
                    OddNumber++;//total odd number +1
                    System.out.println("This number is odd number");
                    break;
                case -1://same as case 2, but with the negitive sign
                    OddNumber++;//total odd number +1
                    System.out.println("This number is odd number");
                    break;

                default :
                    System.out.println("The input is void, please entre other number");
                    TotalNo++;
                    break;
            }

        }data.close();
        //result print out
        System.out.println("The total odd number is " +OddNumber);
        System.out.println("The total even number is "+EvenNumber);
        
        
        
        
    }
    
}