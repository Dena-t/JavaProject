// hello Dena :)

package Project;
    
import java.util.Scanner;

public class MovieTicketSale {

    public static void main(String[] args) {

        String movieName;
        double adultTicketPrice;
        double childTicketPrice;
        int noOfAdultTicketSold;
        int noOfChildTicketSold;
        double percentDonated;
        double amountDonated;
        double grossAmount;
        double netSaleAmount;
        Scanner console;
        int numberOfTicketSold;


       console = new Scanner(System.in);

        System.out.println("Please enter the following needed info: ");
        System.out.print("Movie Name: ");
        movieName = console.nextLine();


        System.out.print("Adult Ticket Price: ");
        adultTicketPrice = console.nextDouble();

        System.out.print("Child Ticket Price: ");
        childTicketPrice = console.nextDouble();

        System.out.print("Number of Adult Ticket sold: ");
        noOfAdultTicketSold = console.nextInt();

        System.out.print("Number of child Ticket sold: ");
        noOfChildTicketSold = console.nextInt();

        System.out.print("Percentage of the gross amount to be donated to the charity: ");
        percentDonated = console.nextDouble();
        console.close();

        grossAmount = adultTicketPrice * noOfAdultTicketSold + childTicketPrice*noOfChildTicketSold;
        amountDonated = grossAmount * percentDonated / 100;
        netSaleAmount = grossAmount - amountDonated;
        numberOfTicketSold = noOfAdultTicketSold + noOfChildTicketSold;
        System.out.println("========================================");
        System.out.printf("%s %s %n%s %d %n%s $%.2f %n%s %.2f%% %n%s $%.2f %n%s %.2f %n" 
        ,"Movie Name:", movieName, "Number of Ticket Sold:",
        numberOfTicketSold,"Gross Amount :",grossAmount,
        "Percentage of the Gross Amount Donated:", percentDonated ,"Amount Donated:",amountDonated
        , "Net Sale:", netSaleAmount);
        System.out.println("========================================");


    }
}
