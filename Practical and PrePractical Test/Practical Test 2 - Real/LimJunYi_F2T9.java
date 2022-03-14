/* 
 * Problem Description :
 * As a new programmer, you are assigned to create a java program to prepare a fee receipt for
 * Math Tuition Online. This program will allow customers to read student name, student id,
 * monthly fee and package number before generating receipts for students. All students will be
 * given a discount based on the monthly fee as below and must pay RM10 for the learning
 * module.
 * 
 * The program should display the title for the receipt MATH ONLINE TUITION and detailed
 * output for student name, student id, monthly fee, discount and total fee for a student. All
 * students
 * Begins your code with name, class, matric number, and problem description as a comment. Use 2
 * decimal point formats in the output.
 * 
 * NAME: LIM JUN YI
 * CLASS: F2T9
 * MATRIC NUMBER: MS2124135403
 */

import java.util.Scanner;
import java.text.DecimalFormat;

class LimJunYi_F2T9{

    public static void main(String[] args){

        //Local Initialisaitons
        Scanner jy = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#0.00");
        String name = "", monthlyFeeFormatted = "", discountPaymentFormatted = "", paymentTotalFormatted = "";
        int id = 0, packageNumber = 0, discountPercentage = 0;
        double monthlyFee = 0.0, discountDecimal = 0.0, discountPayment = 0.0, paymentTotal = 0.0, paymentAfterDiscount = 0.0;
        boolean systemBreak = false;

        do{
            //Print Header
            System.out.println("\n|||||||||||||||||||Math Online Tuition||||||||||||||||\n");
            
            //Get User Input Part 1.0
            System.out.print("[Enter the student's name] | ");
            name = jy.nextLine();
            System.out.print("[Enter the student's ID]   | ");
            id = jy.nextInt();
            System.out.print("[Enter the monthly fee]    | RM ");
            monthlyFee = jy.nextDouble();
                        
            //Monthly Fee Validity checker
            if(monthlyFee <= 0){
                System.out.println("\nPlease Enter A Valid Monthly Fee\n");
                systemBreak = true;
            }

            //Proceed to Next Input if Monthly Fee is Valid
            if(systemBreak == false){

                //Get User Input Part 2.0
                System.out.print("[Enter the package number] | ");
                packageNumber = jy.nextInt();

                //Pacakage Number Check
                if(packageNumber >= 1 && packageNumber <= 10){
                    discountPercentage = 5;
                }
                else if(packageNumber >= 11 && packageNumber <= 20){
                    discountPercentage = 0;
                }
                else if(packageNumber >= 21 && packageNumber <= 30){
                    discountPercentage = 3;
                }
                else{
                    System.out.println("\nInvalid Package Number\n");
                    systemBreak = true;
                }
            }            

            //After User Input Pass All Validity Checker
            if(systemBreak == false){

                //Proceed to Calculations if Package Number is Valid
                discountDecimal = discountPercentage / 100.0;
                discountPayment = monthlyFee * discountDecimal;
                paymentAfterDiscount = monthlyFee - discountPayment;
                paymentTotal = paymentAfterDiscount + 10.0;

                //Proceed to Conversion of Data into Display Format
                monthlyFeeFormatted = df.format(monthlyFee);
                discountPaymentFormatted = df.format(discountPayment);
                paymentTotalFormatted = df.format(paymentTotal);

                //Print Dividor
                System.out.println("\n||||||||||||||||||||||Fee Receipt|||||||||||||||||||||\n");

                //Proceed to Display
                System.out.println("[Student ID]            | " + id);
                System.out.println("[Student Name]          | " + name);
                System.out.println("[Monthly Fee]           | RM " + monthlyFeeFormatted);
                System.out.println("[Discount Given]        | RM " + discountPaymentFormatted);
                System.out.println("[Total Fees To Pay]     | RM " + paymentTotalFormatted);

                //Print Footer
                System.out.println("\n||||||||||||||||||||||||||||||||||||||||||||||||||||||\n");
                System.out.println("[Received From]         | " + name);

                break;
            }

        
            if(systemBreak == true){
                System.out.println("\n\n\n\n\n");
                
                jy.nextLine(); /*clear buffer, that's because the sc.nextInt method does not read the newline 
                character in your input created by hitting "Enter," and so the call to sc.nextLine returns 
                after reading that newline.*/
            }

        }while(systemBreak == true);

        //Close scanner to prevent resource leak
        jy.close();
    }
}