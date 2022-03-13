import java.util.Scanner;

import javax.swing.plaf.synth.SynthScrollBarUI;

class KMKtLab5{}

class WhileLoopDemo{

    public static void main(String[] args){
        
        int i = 1; //initialization expression

        while(i < 6){ //test expression
            System.out.println("Hello World");
            i = i + 1; //update expression
        }
    }
}

class WhileLoopDemo2{

    public static void main(String[] args){

        int x = 1, sum = 0;

        while(x <= 10){
            sum = sum + x; //sum up x
            x = x + 1; //increment for value of x for next iteration
        }

        System.out.println("Summation: " + sum);
    }
}

class WhileLoopDemo3{

    public static void main(String[] args){

        int n = 10;

        while(n > 0){
            n = n - 1;
            System.out.print(n + " ");
        }
    }
}

class WhileLoopDemo4{

    public static void main(String[] args){

        int i = 0, n = 0, sum = 0;
        double avg;

        Scanner sc = new Scanner(System.in);

        while(i < 5){
            System.out.print("Enter a number: ");
            n = sc.nextInt();
            sum = sum + n;
            i = i + 1;
        }
        
        avg = sum / 5;
        
        System.out.println("The sum of 5 number is: " + sum);
        System.out.println("The average is: " + avg);
        
        sc.close();
    }
}

class ForDemo1{

    public static void main(String[] args){

        for(int x = 1; x <= 5; x = x + 1 ){ //for loop begins when x = 1, and runs until x <= 5
            System.out.println("Hello Java!");
        }
    }
}

class ForDemo2{

    public static void main(String[] args){

        for(int i = 2; i < 11; i = i + 2){
            System.out.print(i + " ");
        }
    }
}

class ForDemo3{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int i, n = 0;
        double avg, sum = 0;

        try{

            for(i = 0; i < 5; i++){
                System.out.print("Enter a number: ");
                n = sc.nextInt();
                sum = sum + n;
            }
            
            avg = sum / 5;

            System.out.println("The sum of 5 number is: " + sum);
            System.out.println("The average is: " + avg);
        
        }finally{

            sc.close();
        }
    }
}

class SentinelValueDemo{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in); //Creating object of Scanner class to take keyboard input
        int number, sum = 0;

        System.out.println("Enter any number, or 0 to stop.");
        number = sc.nextInt();

        while(number != 0){ //zero(0) is the sentinel value
            sum = sum + number;
            System.out.println("Enter another number, or 0 to stop.");
            number = sc.nextInt();
        }
        
        System.out.println("The sum of numbers = " + sum);

        sc.close();
    }
}

class SentinelValueDemo2{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        final int SENTINEL = 999; //var SENTINEL will not be able to overrided, it has became a constant variable
        double temp, sum = 0, avg;
        int count = 0;

        System.out.print("Enter a temperature (" + SENTINEL + " to stop): ");
        temp = sc.nextDouble();

        while(temp != SENTINEL){
            sum = sum + temp;
            count = count + 1;
            System.out.print("Enter a temperature (" + SENTINEL + " to stop): ");
            temp = sc.nextDouble();
        }

        if(count != 0){
            avg = sum / count;
            System.out.printf("\nThe average temperature is: %6.2f", avg); //% and f for formatting, 6 means at least 6 digits or sub with space, .2 means 2 dp only
            System.out.println();
        }
        else{
            System.out.println("ERROR! NO input, NO output!!!");
        }

        sc.close();
    }
}