import java.text.DecimalFormat;
import java.util.Scanner;

class LabExercise3{}

class Question1{

    public static void main(String[] args){

        System.out.println("Hello Matriculation");
    }
}

class Question2{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00"); // format the price into 2 decimal places
        double price, discount, afterDiscount;

        System.out.print("Enter the price: ");
        price = sc.nextDouble();
        System.out.print("Enter the discount rate (in %): ");
        discount = sc.nextDouble();

        afterDiscount = price * (1.0 - (discount / 100.0));

        System.out.println("The price after discount is RM" + df.format(afterDiscount));

        sc.close();
    }
}

class Question3{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        double height, width, length, volume;

        System.out.print("Enter the height of the box: ");
        height = sc.nextDouble();
        System.out.print("Enter the width of the box: ");
        width = sc.nextDouble();
        System.out.print("Enter the length of the box: ");
        length = sc.nextDouble();

        volume = height * width * length;

        System.out.println("The volume of the box is " + volume);
        
        sc.close();
    }
}

class Question4{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");
        double num, priceUmbrella;

        System.out.print("Enter the number of umbrella to be bought: ");
        num = sc.nextDouble();

        priceUmbrella = num * 3;

        System.out.println("The total price of the umbrellas bought is RM" + df.format(priceUmbrella));

        sc.close();
    }
}

class Question5{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");
        double rate, rateRaw, term, loanAmount, payment;

        System.out.print("Enter the annual interest rate (in %): ");
        rateRaw = sc.nextDouble();
        System.out.print("Enter the term of the loan (in years): ");
        term = sc.nextDouble();
        System.out.print("Enter the amount borrowed: ");
        loanAmount = sc.nextDouble();

        rate = rateRaw / 100.0;
        payment = ((rate * (1 + rate) * term) / ((1 + rate) * term - 1)) * loanAmount;

        System.out.println("The total payment will be RM" + df.format(payment));

        sc.close();
    }
}

class Question6{

/* Pseudocode */
/*

Start
    Read radius
    area = 3.1416 * radius * radius
    Print radius
Stop

*/
}