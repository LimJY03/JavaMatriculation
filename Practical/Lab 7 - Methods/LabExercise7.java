import java.util.Scanner;
import java.text.DecimalFormat;

class LabExercise7{}

class DistinctNumberChecker{

    boolean check2(double n1, double n2){

        boolean result = false;

        if(n1 == n2){
            result = true;
        }

        return result;
    }

    boolean check3(double n1, double n2, double n3){

        boolean result = false;

        if(n1 == n2 || n1 == n3 || n2 == n3){
            result = true;
        }

        return result;
    }
}

class S1Q1{

    double sum(double a, double b){
        double result;        
        result = a + b; //method is addition        
        return result;
    }

    public static void main(String[] args){

        //Local initialisations
        Scanner sc = new Scanner(System.in);
        S1Q1 obj1 = new S1Q1();
        double n1, n2, total;

        //Enter values into n1 and n2
        System.out.print("Enter two numbers: ");
        n1 = sc.nextDouble();
        n2 = sc.nextDouble();

        //Use self-defined sum method
        total = obj1.sum(n1, n2);

        //Output the result
        System.out.println("The sum of " + n1 + " and " + n2 + " is " + total);

        //Prevent resource leak for scanner
        sc.close();
    }
}

class S1Q2{

    double circumference(double s1, double s2){
        double result;
        result = 2 * s1 + 2 * s2;
        return result;
    }

    double area(double s1 , double s2){
        double result;
        result = s1 * s2;
        return result;
    }

    public static void main(String[] args){

        //Local initialisations
        Scanner sc = new Scanner(System.in);
        S1Q2 obj1 = new S1Q2();
        double side1, side2, perimeter, area;

        //Enter values into side1 and side2
        System.out.print("Enter the length of rectangle: ");
        side1 = sc.nextDouble();
        System.out.print("Enter the width of rectangle: ");
        side2 = sc.nextDouble();

        //Use self-defined methods
        perimeter = obj1.circumference(side1, side2);
        area = obj1.area(side1, side2);

        //Output the results
        System.out.println("The perimeter of the rectangle is " + perimeter);
        System.out.println("The area of the rectangle is " + area);

        //Prevent resource leak for scanner
        sc.close();
    }
}

class S1Q3{

    double maximum(double n1, double n2, double n3){

        double result;
        
        if(n1 > n2 && n1 > n3){
            result = n1;
        }
        else if(n2 > n1 && n2 > n3){
            result = n2;
        }
        else{
            result = n3;
        }

        return result;
    }

    double minimum(double n1, double n2, double n3){

        double result;
        
        if(n1 < n2 && n1 < n3){
            result = n1;
        }
        else if(n2 < n1 && n2 < n3){
            result = n2;
        }
        else{
            result = n3;
        }

        return result;
    }

    public static void main(String[] args){

        //Local initialisations
        Scanner sc = new Scanner(System.in);
        S1Q3 obj1 = new S1Q3();
        DistinctNumberChecker obj2 = new DistinctNumberChecker();
        double n1, n2, n3, max, min;

        //Enter values into n1, n2, n3
        System.out.print("Enter three numbers: ");
        n1 = sc.nextDouble();
        n2 = sc.nextDouble();
        n3 = sc.nextDouble();

        //Check if numbers are distinct to each other
        if(obj2.check3(n1, n2, n3) == false){

            //Use self-defined methods
            max = obj1.maximum(n1, n2, n3);
            min = obj1.minimum(n1, n2, n3);

            //Output the results
            System.out.println("The largest number entered is " + max);
            System.out.println("The smallest number entered is " + min);
        }
        else{
            System.out.println("Please enter 3 different numbers.");
        }
        
        //Prevent resource leak from scanner
        sc.close();
    }
}

class S1Q4{

    double circumference(double r){
        double result;
        result = 2.0 * 3.14159265 * r;
        return result;
    }

    double area(double r){
        double result;
        result = 3.14159265 * r * r;
        return result;
    }

    public static void main(String[] args){

        //Local initialisations
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#0.00");
        S1Q4 obj1 = new S1Q4();
        double r, circumference, area, costCircumference, costArea, costCircumferenceTotal, costAreaTotal;

        //Enter values
        System.out.print("Enter the cost for 1 unit of fencing: RM");
        costCircumference = sc.nextDouble();
        System.out.print("Enter the cost for 1 unit of cover: RM");
        costArea = sc.nextDouble();
        System.out.print("Enter the radius of swimming pool: ");
        r = sc.nextDouble();

        //Use self-defined methods
        circumference = obj1.circumference(r);
        area = obj1.area(r);

        //Calculate costs
        costCircumferenceTotal = circumference * costCircumference;
        costAreaTotal = area * costArea;

        //Output the results
        System.out.println("The cost for fencing is RM" + df.format(costCircumferenceTotal));
        System.out.println("The cost for cover is RM" + df.format(costAreaTotal));

        //Prevent resource leak from scanner
        sc.close();
    }
}

class S1Q5{

    void sum(int n1, int n2){
        int sum;
        sum = n1 + n2;
        System.out.println("The sum is " + sum);
    }

    void product(int n1, int n2){
        int product;
        product = n1 * n2;
        System.out.println("The product is " + product);
    }

    public static void main(String[] args){

        //Local initialisations
        Scanner sc = new Scanner(System.in);
        S1Q5 obj1 = new S1Q5();
        int n1, n2;

        //Enter values into n1 and n2
        System.out.print("Enter two integers: ");
        n1 = sc.nextInt();
        n2 = sc.nextInt();

        //Use self-defined methods and output
        obj1.sum(n1, n2);
        obj1.product(n1, n2);

        //Prevent resource leak from scanner
        sc.close();
    }
}

class S1Q6{

    double salesTotal(double salesCount){
        double result;
        result = salesCount * 4.25;
        return result;
    }

    public static void main(String[] args){

        //Local initialisations
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#0.00");
        S1Q6 obj1 = new S1Q6();
        double salesCount, salesTotal;

        //Enter values into salesCount
        System.out.print("Enter the number of sales: ");
        salesCount = sc.nextDouble();

        //Use self-defined method
        salesTotal = obj1.salesTotal(salesCount);

        //Output the result
        System.out.println("The sales of the month is RM" + df.format(salesTotal));
        
        //Prevent resource leak from scanner;
        sc.close();
    }
}

class S2Q1{

    void voteCheck(int age){

        if(age >= 18){
            System.out.println("Eliglible to vote");
        }
        else{
            System.out.println("NOT eligible to vote");
        }
    }

    public static void main(String[] args){

        //Local initialisations
        Scanner sc = new Scanner(System.in);
        S2Q1 obj1 = new S2Q1();
        int age;

        //Enter age
        System.out.print("Enter your age: ");
        age = sc.nextInt();

        //Use self-defined method and output
        obj1.voteCheck(age);

        //Prevent resource leak from scanner
        sc.close();
    }
}

class S2Q2{

    boolean isNotDivisible(int p, int q){
        
        boolean result;

        if(p % q == 0){
            result = true;
        }
        else{
            result = false;
        }

        return result;
    }

    public static void main(String[] args){

        //Local initialisations
        Scanner sc = new Scanner(System.in);
        S2Q2 obj1 = new S2Q2();
        int p, q;
        boolean isNotDivisible;

        //Enter values into p and q
        System.out.print("Enter two integers: ");
        p = sc.nextInt();
        q = sc.nextInt();

        //Use self-defined method
        isNotDivisible = obj1.isNotDivisible(p, q);

        //Output the result
        System.out.println("The statement \"" + p + " is divisible by " + q + "\" is " + isNotDivisible);

        //Prevent resource leak from scanner
        sc.close();
    }
}