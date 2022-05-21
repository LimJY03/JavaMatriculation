import java.util.Scanner;
import java.util.ArrayList;
import java.text.DecimalFormat;
import java.lang.Math;

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

class MethodReturnObjects{

    public static void main(String[] args){

        MethodReturnObjects program = new MethodReturnObjects();
        double temperatureCelcius[] = {50, 30, 20, 40, 10};
        int stationID[] = {1, 2, 3, 4, 5}, dupes[] = new int[5];
        String stationName[] = {"a a", "b b", "c c", "d d", "e e"};
        Object maximumTemperatureDataset[] = program.getMaximumTemperature(stationID, stationName, temperatureCelcius);

        int stationIDMax = (int)maximumTemperatureDataset[0];
        String stationNameMax = maximumTemperatureDataset[1].toString();
        double temperatureMax = (double)maximumTemperatureDataset[2];
        dupes = (int[])maximumTemperatureDataset[3];

        System.out.println("Station ID: " + stationIDMax);
        System.out.println("Station Name: " + stationNameMax);
        System.out.println("Station Temperature: " + temperatureMax);
        System.out.println("Dupes: " + dupes[0]);
        System.out.println("Dupes: " + dupes[1]);
        System.out.println("Dupes: " + dupes[2]);
        System.out.println("Dupes: " + dupes[3]);
        System.out.println("Dupes: " + dupes[4]);
    }

    Object[] getMaximumTemperature(int stationID[], String stationName[], double temperatureCelcius[]){

        Object maximumTemperatureDataset[] = new Object[4];
        int maximumDuplicate[] = {5, 2, 3, 4, 10};
        double temperatureMax = 0.0;

        for(int i = 0; i < temperatureCelcius.length; i++){

            if(temperatureCelcius[i] > temperatureMax){
                maximumTemperatureDataset[0] = stationID[i];
                maximumTemperatureDataset[1] = stationName[i];
                maximumTemperatureDataset[2] = temperatureCelcius[i];
                temperatureMax = temperatureCelcius[i];
            }
        }

        maximumTemperatureDataset[3] = maximumDuplicate;
        return maximumTemperatureDataset;
    }
}

class StaticVariable{

    int a = 10;
    static int b = 11;

    public static void main(String[] args){
        
        StaticVariable program = new StaticVariable();

        program.displayNonStatic();
        displayStatic();
    }
    
    // Non-static method can use static and non-static global variables
    void displayNonStatic(){

        System.out.println("a: " + a); 
        System.out.println("b: " + b);
    }

    // Static method can only use static globa; variables
    static void displayStatic(){

        System.out.println("Variable a cannot be fetched."); // Cannot make a static reference to the non-static field
        System.out.println("b: " + b);     
    }
}

class TabTest{

    public static void main(String[] args){

        System.out.println("1\tNext Word Starts Here");
        System.out.println("10\tNext Word Starts Here");
        System.out.println(" 10\tNext Word Starts Here");

        // "\t" works like a normal tab, it is not 4 whitespaces.
    }
}

class DataTypeTest{

    public static void main(String[] args){

        int d;

        d = Math.pow(2, 4); // Math.pow returns double, and Error occurs here.
    }
}

class DisplayNumbersEndWith4{

    public static void main(String[] args){

        for(int i = 0; i <= 1000; i++){            

            if(Math.pow(2, i) % 10 == 4.0){
                System.out.println(i + ": " + Math.pow(2, i));
            }
        }
    }
}

class DisplayLastDigit{

    public static void main(String[] args){

        int n = 2022;
        System.out.println((int)(Math.pow(2, n) % 10));
    }
}