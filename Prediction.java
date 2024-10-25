// Import scanner for a lotta input 
import java.util.Scanner;
// Create class 
public class Prediction{
    // Create main method 

    public static void main(String[] args){
        // Display Title 
        System.out.println("\n\n\t*** Help for Over thinkers ***\n");
        // tell them what it does 
        System.out.println("Here's a thing to help you choose your classes next semester. It runs your stuff through an algorithm to calculate what you should do");

        //Create another scanner for inputs
        System.out.println("What's the class you wanna do?");

        Scanner scannerObject = new Scanner(System.in);

        String userInput = "";

        userInput = scannerObject.nextline(); 

        System.out.println("From 1-10, how fun does it sound? 1=least, 10=most");

        int F = scannerObject.nextInt(); 

        System.out.println("How cool is the professor from 1-10?");

        int C = scannerObject.nextInt();

        System.out.println("Have you taken this class before? (1=yes, 2=No)");

        Int R = scannerObject.nextInt(); 

        System.out.println("Do I need this to graduate? (1=yes, 2=No)");

        int N = scannerObject.nextInt(); 

        System.out.println("How much (In percent) will you pass?");

        int H = scannerObject.nextInt();

        System.out.println("How many hours is it after you wake up?");

        Int P = scannerObject.nextInt();

        System.out.println("Are my smart friends taking this class? (1=yes, 2=No)");

        Int S = scannerObject.nextInt();



        float x= 0.07f;

        ((F + (C/N)) + H * (P /R *S)) * X = A  

        System.out.println("The Result is : %.2.f%n", A);

        if (A >= 1) {
            System.out.println("You should!")
        } else {
            System.out.println("You shouldn't")
        }

        scannerObject.close();

    }
}