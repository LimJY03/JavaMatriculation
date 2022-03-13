import java.text.DecimalFormat;
import java.util.Scanner;

class LabExercise5{}

class S1Qa{

    public static void main(String[] args){

        int i = 1;

        do{
            System.out.println(i);
            i++;
        }    
        while(i <= 100);
    }
}

class S1Qb{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int i = 0;
        double n, sum = 0, avg;

        do{
            System.out.print("Enter a number: ");
            n = sc.nextDouble();
            sum = sum + n;
            i++;
        }
        while(i < 10);

        avg = sum / 10;

        System.out.println("The total is " + sum + " and the average is " + avg);
        sc.close();
    }
}

class S1Qc{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int i = 1;
        double min, input;

        System.out.print("Enter a number: ");
        min = sc.nextDouble();
        
        do{
            System.out.print("Enter another number: ");
            input = sc.nextDouble();
            
            if(input < min){
                min = input;
            }

            i++;
        }
        while(i < 10);

        System.out.println("The minimum number is " + min);
        sc.close();
    }
}

class S1Qd{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int i = 0;
        double n, sum = 0;

        do{
            System.out.print("Enter a number: ");
            n = sc.nextDouble();
            
            if(n % 2 != 0){
                sum = sum + n;
            }

            i++;
        }
        while(i < 15);

        System.out.println("The sum of odd numbers is " + sum);
        sc.close();
    }
}

class S1Qe{

    public static void main(String[] args){

        DecimalFormat df = new DecimalFormat("#.00");
        int r = 10;
        double area;

        do{
            area = 3.14 * r * r;
            System.out.println("The area of a circle with radius of " + r + "-cm is: " + df.format(area) + "cm^2");
            r++;
        }
        while(r <= 20);
    }
}

class S1Qf{

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

class S2Q1{

    public static void main(String[] args){

        for(int i = 1; i < 30; i = i + 2){
            System.out.print(i + " ");
        }
    }
}

class S2Q2{

    public static void main(String[] args){

        int sum = 0;
        
        for(int i = 1; i <= 10; i++){
            sum = i;
        }

        System.out.println("sum = " + sum);
    }
}

class S2Q3{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int i, input, product;

        try{

            System.out.print("Enter a positive integer: ");
            input = sc.nextInt();
            
            for(i = 1; i <= 12; i++){
                product = input * i;
                System.out.println(input + " * " + i + " = " + product);
            }
        }
        finally{
            
            sc.close();
        }
    }
}

class S2Q4{

    public static void main(String[] args){

        for(int i = 100; i <= 200; i++){
            System.out.print(i + ", ");

            if((i + 1) % 10 == 0){
                System.out.print("\n");
            }
        }
    }   
}

class S2Q5{

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

class S3Q1{

    public static void main(String[] args){

        int i = 2, sum = 0;
        System.out.print(1);

        do{
            sum = sum + i;
            System.out.print(" + " + i);
            i++;
        }
        while(sum <= 100);

        System.out.print(" = " + sum);
    }
}

class S3Q2{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int i = 0, j = 1, sum = 0, input; //j starts frm 2nd number in array, index = 1
        int[] numEntered = new int[9999]; //create array of LARGE size to store numbers entered for future display

        do{
            System.out.print("Enter an integer, or 0 to stop: ");
            input = sc.nextInt();
            numEntered[i] = input; //insert input into array for future display
            sum = sum + input; //calculate sum
            i++;
        }
        while(input != 0);

        System.out.print("The numbers entered were: " + numEntered[0]); //print num1

        do{
            System.out.print(", " + numEntered[j]); //print num2, num3, num4, num5, ...
            j++;
        }
        while (j <= (i - 1)); //counter ends with i - 1, as i increased by 1 aftr 0 is entered.
        
        System.out.println("\nThe sum of all numbers entered is: " + sum + ".\nGoodbye!");
        
        sc.close();
    }
}

class S3Q3{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        double input, sum = 0;

        do{
            System.out.print("Enter a number: ");
            input = sc.nextDouble();
            sum = sum + input;
        }
        while(input >= 0);

        System.out.println("The sum until negative value is entered is: " + sum);
        
        sc.close();
    }
}

class S3Q4{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        double input, sum = 0;
        int i = 1;

        do{
            System.out.print("Enter a number: ");
            input = sc.nextDouble();
            
            if(input >= 0){
                sum = sum + input;
            }
            else{
                System.out.println("The sum before negative value is entered is: " + sum); //only display this if neg number is entered b4 i = 20
            }
            
            i++;
        }
        while(input >= 0 && i <= 20);

        if(i == 20){
            System.out.println("The sum for 20 numbers entered is: " + sum); //only display this if 20 positive numbers are entered
        }
        
        sc.close();
    }
}

class S3Q5{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int code;

        do{
            System.out.print("Enter the code: ");
            code = sc.nextInt();

            if(code != 877){
                System.out.println("Incorrect pin number, please try again.");
            }
            else{
                System.out.println("Correct pin number, congratulations!");
            }
        }
        while(code != 877);
    }
}