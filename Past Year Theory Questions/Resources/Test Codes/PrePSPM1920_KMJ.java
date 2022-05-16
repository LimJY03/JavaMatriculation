import java.util.Scanner;
import java.lang.Math;

class PrePSPM1920_KMJ{}

class Q8a{

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){

        double allArea[] = new double[10];

        for(int i = 0; i < allArea.length; i++){

            System.out.print("Enter your choice, 1 or not 1: ");

            if(sc.nextInt() == 1){allArea[i] = areaRectangle();}
            else{allArea[i] = areaCircle();}

            System.out.println(allArea[i]);
        }

        sc.close();
    }

    static double areaRectangle(){

        System.out.print("Enter length and width separated by white spaces: ");
        return sc.nextDouble() * sc.nextDouble();
    }

    static double areaCircle(){

        final double PI = 3.142;

        System.out.print("Enter radius of circle: ");
        return PI * Math.pow(sc.nextDouble(), 2);
    }
}

class Q8b{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int boyCount = 0, girlCount = 0;
        double bmi = 0.0, bmiMax = 0.0;
        char gender = 'A';

        for(int i = 0; i < 5; i++){

            System.out.print("Enter gender (B/G): ");
            gender = sc.next().charAt(0);
            System.out.print("Enter BMI: ");
            bmi = sc.nextDouble();

            if(gender == 'B' || gender == 'b'){boyCount++;}
            else if(gender == 'G' || gender == 'g'){girlCount++;}

            if(bmi > bmiMax){bmiMax = bmi;}
        }
        
        System.out.println("Number of boys: " + boyCount);
        System.out.println("Number of girls: " + girlCount);
        System.out.println("Maximum BMI is: " + bmiMax);

        sc.close();
    }
}