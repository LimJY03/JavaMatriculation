/* 
 * construct a java program to display the total water bill charges of the month
 * depending upon the number of units consumed by the customer as per the following
 * 
 * criteria:
 * # for the first 100 units, 0.5 per unit
 * # for next 150 units, 10 per unit
 * # more than 250 units, 20 per unit
 * 
 * also add meter charges of 15 per month to calculate the total water bill
 */

 import java.util.Scanner;
 import java.text.DecimalFormat;

 class Exercise5Conditional{

    public static void main(String[] args){

        // Local initialisations
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#0.00");
        double unitCount = 0.0, totalRaw = 0.0, totalWithMeter = 0.0;

        // Get user input for unitCount
        System.out.print("Total unit consumed: ");
        unitCount = sc.nextDouble();

        // Calculate the water bill
        totalRaw = 
            unitCount > 250 ? ((100 * 0.5) + (150 * 10.0) + ((unitCount - 250) * 20)) : 
            unitCount > 100 ? ((100 * 0.5) + ((unitCount - 100) * 10.0)) : 
                              (unitCount * 0.5);

        totalWithMeter = totalRaw + 15;

        // Display total water bill charge
        System.out.println("The total water bill charge: RM " + df.format(totalWithMeter));

        // Prevent resource leak from scanner
        sc.close();
    }
 }