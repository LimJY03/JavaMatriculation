import java.util.Scanner;
import java.text.DecimalFormat;

class LabExercise4{}

class Section1Question1{

    public static void main(String[] args){

        int x = 1;

        if(x > 0){
            System.out.println("The number is positive.");
        }
    }
}

class Section1Question2{

    public static void main(String[] args){

        int score = 90;

        if(score >= 90){
            System.out.println("Grade value = A");
        }
    }
}

class Section1Question3{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        double r, area;

        System.out.print("Enter the radius: ");
        r = sc.nextDouble();

        if(r >= 0){
            area = (22.0/7.0) * r * r;
            System.out.println("The area of circle is: " + area);
        }

        sc.close();
    }
}

class Section1Question4{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,###.00");
        double price, afterDiscount;

        System.out.print("Enter the cost of purchased quantity (in RM): ");
        price = sc.nextDouble();

        if(price > 1000){
            afterDiscount = price * (1 - 0.1);
            System.out.println("The price after discount is RM" + df.format(afterDiscount));
        }

        sc.close();
    }
}

class Section1Question5{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        double weight, height, BMI;

        System.out.print("Enter your weight (kg) and height (m): ");
        weight = sc.nextDouble();
        height = sc.nextDouble();

        if((weight >= 0) && (height >= 0)){
            BMI = weight / (height * height);
            System.out.println("Your BMI is " + BMI);
        }

        sc.close();
    }
}

class Section2Question1{

    public static void main(String[] args){

        int num = 1;

        if(num >= 0){
            System.out.println("Number is positive.");
        }
        else if(num < 0){
            System.out.println("Number is negative.");
        }
    }
}

class Section2Question2{

    public static void main(String[] args){

        DecimalFormat df = new DecimalFormat("#,###.00");
        int speed = 120, fine;

        if(speed >= 110){
            fine = 300;
        }
        else{
            fine = 0;
        }

        System.out.println("Fine = RM" + df.format(fine));
    }
}

class Section2Question3{

    public static void main(String[] args){

        DecimalFormat df = new DecimalFormat("#.00");
        int age = 19, price;

        if(age < 55){
            price = 20;
        }
        else{
            price = 10;
        }

        System.out.println("The ticket price is RM" + df.format(price));
    }
}

class Section2Question4{

    public static void main(String[] args){

        DecimalFormat df = new DecimalFormat("#,###.00");
        double hours = 49, pay;

        if(hours > 40){
            pay = 40 * 9 + (hours - 40) * 13.5;
        }
        else{
            pay = hours * 9;
        }

        System.out.print("The employee's pay is RM" + df.format(pay));
    }
}

class Section2Question5{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        double a, b, c, sum;

        System.out.print("Enter the 3 angles of a triangle: ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        sum = a + b + c;

        if(a >= 0 && b >= 0 && c>= 0 && sum == 180){
            System.out.println("The triangle is valid.");
        }
        else{
            System.out.println("The triangle is invalid.");
        }

        sc.close();
    }
}

class Section3Question1{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int a, b, c;

        System.out.print("Enter three different integers: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if(a > b && a > c){
            System.out.println("The biggest number is " + a);
        }
        else if(b > a && b > c){
            System.out.println("The biggest number is " + b);
        }
        else{
            System.out.println("The biggest number is " + c);
        }

        sc.close();
    }
}

class Section3Question2{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        double number;

        System.out.print("Enter a number: ");
        number = sc.nextDouble();

        if(number > 0){
            System.out.println("The number is positive.");
        }
        else if(number < 0){
            System.out.println("The number is negative.");
        }
        else{
            System.out.println("The number is zero.");
        }

        sc.close();
    }
}

class Section3Question3{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int a, b, c;

        System.out.print("Enter three ages: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if(a > b && a > c && a >= 0 && b >= 0 && c >= 0){
            System.out.println("The first person is the oldest.");
        }
        else if(b > a && b > c && a >= 0 && b >= 0 && c >= 0){
            System.out.println("The second person is the oldest.");
        }
        else if(c > a && c > b && a >= 0 && b >= 0 && c >= 0){
            System.out.println("The third person is the oldest.");
        }
        else if(a == b && a > c && a >= 0 && b >= 0 && c >= 0){
            System.out.println("The first and second person are the oldest.");
        }
        else if(a == c && a > b && a >= 0 && b >= 0 && c >= 0){
            System.out.println("The first and third person are the oldest.");
        }
        else if(b == c && b > a && a >= 0 && b >= 0 && c >= 0){
            System.out.println("The second and third person are the oldest.");
        }
        else if(a >= 0 && b >= 0 && c >= 0){
            System.out.println("Their age are the same.");
        }
        else{ //a andor b andor c is negative value
            System.out.println("Age cannot be negative.");
        }
        
        sc.close();
    }
}

class Section3Question4{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int number;
        String colour;

        System.out.print("Enter an integer: ");
        number = sc.nextInt();

        if(number >= 5 && number < 15){
            colour = "GREEN";
        }
        else if(number >= 15 && number < 25 ){
            colour = "BLUE";
        }
        else if(number >= 25 && number < 35){
            colour = "ORANGE";
        }
        else{
            colour = "ALL COLOURS ARE BEAUTIFUL";
        }

        System.out.println(colour);

        sc.close();
    }
}

class Section3Question5{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        double temperature;
        String situation;

        System.out.print("Enter the temperature in centigrade: ");
        temperature = sc.nextDouble();

        if(temperature < 0){
            situation = "Freezing weather";
        }
        else if(temperature >= 0 && temperature <= 20){
            situation = "Cold weather";
        }
        else if(temperature > 20 && temperature <= 35){
            situation = "Normal in temp";
        }
        else{
            situation = "Its Hot";
        }

        System.out.println(situation);

        sc.close();
    }
}

class Section3Question6{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");
        double unit, billraw = 0, billfinal;

        System.out.print("Enter number of units consumed: ");
        unit = sc.nextDouble();

        if(unit > 250){
            billraw = (100.0 * 0.5) + (150.0 * 10.0) + ((unit - 250.0) * 20.0);
        }
        else if(unit > 100 && unit <= 250){
            billraw = (100.0 * 0.5) + ((unit - 100.0) * 10.0);
        }
        else if(unit >= 0 && unit <= 100){
            billraw = unit * 0.5;
        }

        billfinal = billraw + 15; //billraw was null, assign billraw = 0 at top initialization.
        
        System.out.println("The total water bill charge of the month is RM" + df.format(billfinal));

        sc.close();
    }
}