/* 
 * Create a program to accept user input of 12 months salary amounts for the year. It then
 * print out all 12 salary each months. Then it will computes the total salary and the average
 * salary and lastly it can reports the particular salary which has been search by user using
 * spesific keyword.
 * 
 * Important : Please use array only in order to solve this question OR you can also use
 * methods with array.
 */
import java.util.Scanner;
import java.text.DecimalFormat;

class Exercise3Array{

    public static void main(String[] args){

        //Local declarations and initialisations
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#0.00");
        double salaryInput = 0, salary[] = new double[12], salaryTotal = 0, salaryAverage = 0, salarySearch = 0;
        final String monthNameFull[] = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        final String monthNameShort[] = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        String salaryTotalFormatted = "", salaryAverageFormatted = "", searchInput = "", monthSearch = "", salarySearchFormatted = "";

        //Get user input & perform calculations
        for(int i = 0; i < salary.length; i++){
            
            //Input Block
            System.out.print("Enter the salary for " + monthNameFull[i] + ": RM ");
            salaryInput = sc.nextDouble();
            salary[i] = salaryInput;

            //Calculations Block            
            salaryTotal = salaryTotal + salaryInput;

            //Reset Block
            salaryInput = 0;
        }

        //Calculations for average salary
        salaryAverage = salaryTotal / 12;

        //Format and display total salary and average salary
        salaryTotalFormatted = df.format(salaryTotal);
        System.out.println("\nThe total salary of the year is RM " + salaryTotalFormatted);
        salaryAverageFormatted = df.format(salaryAverage);
        System.out.println("The average salary per month is RM " + salaryAverageFormatted);

        //Get user input to be searched
        System.out.print("\nEnter the month to search the salary: ");
        searchInput = sc.next();

        //Search for the value
        for(int j = 0; j < salary.length + 1; j++){

            if(j == salary.length){
                System.out.println("The keyword entered is not invalid");
                break;
            }
            else if(searchInput.equalsIgnoreCase(monthNameFull[j]) || searchInput.equalsIgnoreCase(monthNameShort[j])){
                    salarySearch = salary[j];
                    monthSearch = monthNameFull[j];

                    //Display the salary for searched month
                    salarySearchFormatted = df.format(salarySearch);
                    System.out.println("The salary for " + monthSearch + " is RM " + salarySearchFormatted);

                    break;
            }   
        }

        //Prevent resource leak from scanner
        sc.close();
    }
}