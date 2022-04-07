/*
 * Write a program to check whether a triangle is valid or not, when the three angles of the triangle are entered by the user. 
 * A triangle is valid if the sum of all the three angles is equal to 180 degrees.
 */
import java.util.Scanner;

 class Exercise6Conditional{

    public static void main(String[] args){

        // Local initialisations
        Scanner sc = new Scanner(System.in);
        double angleTotal = 0.0;

        // Get user input for 3 angles
        for(int i = 0; i < 3; i++){
            System.out.print("Enter angle #" + (i + 1) + " (in degree): ");
            angleTotal += sc.nextDouble();
        }

        // Determine if the triangle is valid
        String condition = angleTotal == 180.0 ? "valid" : "invalid";

        // Display the result to user
        System.out.println("The triangle is " + condition + ".");

        // Prevent resource leak from scanner
        sc.close();
    }
 }