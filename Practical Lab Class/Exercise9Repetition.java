/* Create a Java program to display multiplication table using repetition e.g :
 * CONTOH OUTPUT….
 * Anda mahu sifir berapa?: 7
 * Berikut adalah sifir ->; 7
 * 7x1=7
 * 7x2=14
 * 7x3=21
 * 7x4=28
 * 7x5=35
 * 7x6=42
 * 7x7=49
 * 7x8=56
 * 7x9=63
 * 7x10=70
 * 7x11=77
 * 7x12=84
 */
import java.util.Scanner;

class Exercise9Repetition{

    public static void main(String[] args){

        // Local initialisations
        Scanner sc = new Scanner(System.in);
        int num = 0;

        // Get user input
        System.out.print("Enter the number to display its multiplication table: ");
        num = sc.nextInt();

        // Loop and display multiplication table
        System.out.println("Below is the multiplication table for " + num + ":");
        
        for(int i = 0; i < 12; i++)
            System.out.println(num + " x " + (i + 1) +  " = " + (num * (i + 1)));
        
        // Prevent resource leak for scanner
        sc.close();
    }
}