/* You've been hired to do some programming for Kok Lanas Bank . They want you to
 * create a program to calculate loan payments. The user will enter the <amount of money to
 * borrow from the bank>, <the annual interest rate percentage> (that will be compounded
 * yearly) and the <number of years for loan settlement>. 
 * The program will then display the <<monthly payment>> and the <<total amount of interest
 * should be paid>>.
 * Begin your code with your name, class, matric number, and problem description as a
 * comment.
 */

import java.util.Scanner;
import java.text.DecimalFormat;

class LimJunYi_F2T9{

    public static void main(String[] args){

        //PreDisplay Section - Local Initialisations
        Scanner jy = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,##0.00");
        double loan, interestPercentage, interestDecimal, paymentMonth, paymentTotal, interestYear, interestTotal;
        int years, monthTotal;

        //Display Section 1 - Header
        System.out.println("================= KOK LANAS BANK =================\n");
        System.out.println("  Welcome to Kok Lanas Bank e-Smart System");
        System.out.println("  Program developed by: [LIM JUN YI]");
        System.out.println("\n**************************************************\n");

        //Display Section 2 - Service
        System.out.println("  Service Type: [Loan Calculator]\n");
        System.out.print("  Enter the amount of loan (RM): ");
        loan = jy.nextDouble();
        System.out.print("  Enter the annual interest rate (%): ");
        interestPercentage = jy.nextDouble();
        System.out.print("  Enter the loan period (years): ");
        years = jy.nextInt();

        //Process Section - Calculation
        interestDecimal = interestPercentage / 100;         //convert percentage to decimal
        interestYear = loan * interestDecimal;              //calculate annual interest payment
        interestTotal = interestYear * years;               //total = interest rate in a year * total year
        paymentTotal = loan + interestTotal;                //total return back to bank = borrowed + total interest
        monthTotal = years * 12;                            //total months to return total payments
        paymentMonth = paymentTotal / monthTotal;           //payment per month = total payments / total month

        //Display Section 3 - Output
        System.out.println("\n::::::::::::::::::::::::::::::::::::::::::::::::::\n");            
        System.out.println("  [Payment for ONE Month]: RM " + df.format(paymentMonth));
        System.out.println("  [Total Interest to Pay]: RM " + df.format(interestTotal));

        //Display Section 4 - Footer
        System.out.println("\n**************************************************\n");
        System.out.println("  Thanks for using Kok Lanas Bank e-Smart System\n  Have a nice day!");
        System.out.println("\n================= KOK LANAS BANK =================\n");

        //PostDisplay Section - Close Scanner
        jy.close();
    }
}