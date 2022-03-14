import java.util.Scanner;
import java.util.ArrayList;
import java.text.DecimalFormat;

class CodePlayground{}

class VariableTypeTest{

    public static void main(String[] args){

        int intVar = 1;                 //integer
        double doubleVar = 1.0;         //double or decimal
        boolean booleanVar = true;      //logic
        char charVar = 'A';             //character
        String stringVar = "String";    //string
        
        System.out.println(intVar + " " + doubleVar + " " + booleanVar + " " + charVar + " " + stringVar);
    }
}

class NegativeNumberTest{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int eggCount, dozenCount = 0, excessCount = 0;
        boolean breakOperation = false;

        do{
            System.out.print("Enter number of eggs: ");
            eggCount = sc.nextInt();

            if(eggCount > 0){
                excessCount = eggCount % 12;
                dozenCount = (eggCount - excessCount) / 12;

                System.out.println("You have " + dozenCount + " dozen(s) and " + excessCount + " egg(s).");
            }
            else{
                breakOperation = true;
            }
        }
        while(breakOperation == false);

        sc.close();
    }
}

class DecimalFormatUsage{

    public static void main(String[] args){

        DecimalFormat df = new DecimalFormat("#0.00");
        Scanner sc = new Scanner(System.in);
        int n;
        double price, priceLowest = 99999, priceHighest = 0;

        System.out.print("Enter the number of items: ");
        n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            System.out.print("Enter the price of item " + i + ": ");
            price = sc.nextDouble();

            if(price > priceHighest){
                priceHighest = price;
            }
            else if(price < priceLowest){
                priceLowest = price;
            }
        }

        System.out.println("The highest price is RM" + df.format(priceHighest));
        System.out.println("The lowest price is RM" + df.format(priceLowest));

        sc.close();
    }
}

class ArrayListUsage{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>(); //ArrayList is used for dynamic array sizes as we have sentinel repetition.
        int j, k, sum = 0, input;        

        try{

            //input
            do{
                System.out.print("Enter an integer, or 0 to stop: ");
                input = sc.nextInt();
                list.add(input);
            }while(input != 0);

            //Get and output numbers inputted
            System.out.print("The numbers entered were: " );

            for(j = 0; j < (list.size()-1); j++){
                System.out.print(list.get(j) + ", ");
            }

            System.out.println(list.get(j)); //this is to prevent ", " behind last number

            //get sum
            for(k = 0; k < list.size(); k++){
                sum = sum + list.get(k);
            }

            System.out.print("The sum of all numbers entered is: " + sum);
        }
        finally{

            sc.close();
        }
    }
}

class NextLineBugFix{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String name, oldestName = "";
        int age, oldestAge = 0, i = 0;

        do{
            System.out.print("Enter the name of a person: ");
            
            sc.nextLine(); /*clear buffer, that's because the sc.nextInt method does not read the newline 
            character in your input created by hitting "Enter," and so the call to sc.nextLine returns 
            after reading that newline.*/

            name = sc.nextLine();

            System.out.print("Enter the age of the person: ");
            age = sc.nextInt();

            if(age > oldestAge){
                oldestAge = age;
                oldestName = name;
            }

            i++;
        }
        while(i < 10);

        System.out.println("The oldest people is " + oldestName + ", with the age of " + oldestAge);

        sc.close();
    }
}

class StringCompare{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String condition;
        
        //To compare String, use .equals()
        do{
            System.out.print("Type yes to continue: ");
            condition = sc.next();
        }
        while(condition.equalsIgnoreCase("yes"));        
        
        sc.close();
    }
}

class RarelyUsedEscapeSequences{

    public static void main(String[] args){

        System.out.println("\t<-- A tab is used.");             //"\t" creates a tab
        System.out.println("A backspace is used here --> \bp"); //"\b" removes the thing after it
        System.out.println("\n^ A new line is created. ^");     //"\n" creates a new line
        System.out.println("Hallo World where \"Hello\" replaced the initial \"Hallo\" \rHello"); //"\r" replaces the string from the start of the line
        System.out.println("\f\f\f\f\f\f\f\f\f\f");             //"\f" is kinda useless now, prints a weird symbol
    }
}

class NewtonRaphsonMethod{

    double sqrt(double x){

        double result, xInitial = 1, xFinal = 0;

        while(xInitial != xFinal){

            xFinal = xInitial - ((xInitial * xInitial - x) / (2.0 * xInitial));

            if(xFinal == xInitial){
                break;
            }

            xInitial = xFinal;
            xFinal = 0;
        }

        result = xFinal;

        return result;
    }

    double cbrt(double x){

        double result, xInitial = 1, xFinal = 0;

        while(xInitial != xFinal){

            xFinal = xInitial - ((xInitial * xInitial * xInitial - x) / (3.0 * (xInitial * xInitial)));

            if(xFinal == xInitial){
                break;
            }

            xInitial = xFinal;
            xFinal = 0;
        }

        result = xFinal;

        return result;
    }
    
    public static void main(String[] args){

        NewtonRaphsonMethod obj1 = new NewtonRaphsonMethod();
        Scanner sc = new Scanner(System.in);
        double x;

        System.out.print("Enter a number to find its square root and cube root: ");
        x = sc.nextDouble();

        System.out.println(obj1.sqrt(x));
        System.out.println(obj1.cbrt(x));

        sc.close();
    }
}