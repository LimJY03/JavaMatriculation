import java.util.Scanner;

class KMKtLab3{

    public static void main(String[] args){

        System.out.println("Lab 3 - Sequence Control Structure");
    }
}

class CalculateCommision{

    public static void main(String[] args){

        double sales_amount = 1000, commisionPercentage = 15;
        double commision = (commisionPercentage / 100) * sales_amount;

        System.out.println("Commision ammount = " + commision);
    }
}

class CalculateCommision2{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter sales amount: ");
        double amount = sc.nextDouble(); 
        System.out.print("Enter commision percentage: ");
        double commisionPercentage = sc.nextDouble();
        double commision = (commisionPercentage / 100) * amount;

        System.out.println("Commision ammount = " + commision);

        sc.close();
    }
}

class VolumeOfSphere{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius of sphere: ");
        double r = sc.nextDouble();

        double volume = (4.0/3.0) * (22.0/7.0) * (r * r * r);
        
        System.out.println("Volume is: " + volume);

        sc.close();
    }
}

class AverageOfThreeNo{

    public static void main(String[] args){

        int a, b, c, avg, sum;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of a: ");
        a = sc.nextInt();
        System.out.print("Enter the value of b: ");
        b = sc.nextInt();
        System.out.print("Enter the value of c: ");
        c = sc.nextInt();

        sum = a + b + c;
        avg = sum / 3;

        System.out.print("The average of three no. is: " + avg);

        sc.close();
    }
}

class SwapWith{

    public static void main(String[] args){

        int x, y, t;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of X and Y: ");
        x = sc.nextInt();
        y = sc.nextInt();
        System.out.println("Before swapping numbers: " + x + " " + y);

        /* Swapping occurs here */
        t = x;
        x = y;
        y = t;

        System.out.println("After swapping numbers: " + x + " " + y);

        sc.close();
    }
}