/* 
 * A school has following rules for grading system:
 * Below 25 - F
 * 25 to 45 - E
 * 45 to 50 - D
 * 50 to 60 - C
 * 60 to 80 - B
 * Above 80 - A
 * Ask user to enter marks and print the corresponding grade.
 */
import java.util.Scanner;

class Exercise8Conditional{

    public static void main(String[] args){

        // Local initialisations
        Scanner sc = new Scanner(System.in);
        double marks = 0.0;

        // Get user input
        System.out.print("Enter your marks (in %): ");
        marks = sc.nextDouble();

        // Determine and display grade
        char grade = marks > 80 ? 'A' :
                     marks > 60 ? 'B' :
                     marks > 50 ? 'C' :
                     marks > 45 ? 'D' :
                     marks > 25 ? 'E' : 'F';

        System.out.println("Your grade is " + grade + ".");

        // Prevent resource lost for scanner
        sc.close();
    }
}