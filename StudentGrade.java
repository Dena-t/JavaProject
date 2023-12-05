package Project_2_StudentGrade;
import java.util.Scanner;
import java.io.*;


public class StudentGrade {

    public static void main(String[] args)throws FileNotFoundException{

        // declare the variables

        String firstName;
        String lastName;
        Double testScore1;
        Double testScore2;
        Double testScore3;
        Double testScore4;
        Double testScore5;  
        double aveTestScore;
        double total;

        Scanner inFile;
        PrintWriter outFile;

        inFile = new Scanner(new FileReader("E:\\John abbott college\\Homework\\JA4_Team_Project_Data_Fall_2023\\Project_2_StudentGrade\\test.txt"));

        outFile = new PrintWriter("E:\\John abbott college\\Homework\\JA4_Team_Project_Data_Fall_2023\\Project_2_StudentGrade\\testavg.txt");


        firstName = inFile.next();
        lastName = inFile.next();

        testScore1 = inFile.nextDouble();
        testScore2 = inFile.nextDouble();
        testScore3 = inFile.nextDouble();
        testScore4 = inFile.nextDouble();
        testScore5 = inFile.nextDouble(); 

        total = (testScore1+ testScore2 + testScore3 + testScore4+ testScore5);

        outFile.printf("FirstName: %s%n", firstName);
        outFile.printf("LastName: %s%n" , lastName);
        outFile.printf("Test Score: %.2f %.2f %.2f %.2f %.2f %n" , testScore1,  testScore2, testScore3,  testScore4,  testScore5);
        outFile.printf("Average Test Score: %.2f " , aveTestScore = total / 5);


        inFile.close();
        outFile.close();

    }

    
}
