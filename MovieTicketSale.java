package Project_3_MovieTicketSaleDonation;

import java.util.Scanner;


public class MovieTicketSale {

    public static void main(String[] args) {

        

        double adultTicketPrice = 0;
        double childTicketPrice = 0;
        double grossAmount = 0;
        double amountDonated = 0;
        double percentageDonation = 0;
        double netSaleAmount;

        int noAdultTicketSold = 0;
        int noChildTicketSold = 0;

        String  Moviename;

       
        Scanner console = new Scanner(System.in);
       

        grossAmount = 0 ;

        System.out.print(" Enter the movie name :" );
        Moviename = console.nextLine();

        System.out.print("Enter the price of the adult ticket :");
        adultTicketPrice = console.nextDouble();

        System.out.print("Enter the price of the child ticket : ");
        childTicketPrice = console.nextDouble();

        System.out.print("Enter the number of the adult ticket sold : ");
        noAdultTicketSold = console.nextInt();

        System.out.print("Enter the number of the child ticket sold :");
        noChildTicketSold = console.nextInt();

        System.out.print("Enter the percentage of the donation : ");
        percentageDonation = console.nextDouble();

        grossAmount = adultTicketPrice*noAdultTicketSold + childTicketPrice*noChildTicketSold ;

        amountDonated = grossAmount * percentageDonation ;

        netSaleAmount = grossAmount - amountDonated ;

        System.out.printf("The gross amount sold is : $%.2f %n", grossAmount);
        System.out.printf("The amount donated is : $% .2f %n", amountDonated);
        System.out.printf("The netSaleAmount is : %.2f ", netSaleAmount);


        console.close();
        
    }
    
    
}
