import java.util.Scanner;
import java.text.DecimalFormat;

class KMKtLab4{}

class IfStatementExample{

    public static void main(String[] args){
        
        int num = 70;
        if(num < 100){
            /* This println statement will only execute,
             * if the above condition is true
             */
            System.out.println("number is less than 100");
        }
    }
}

class IfStatementExample2{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int voter_age;

        System.out.print("Enter the age: "); //Taking input from the console
        voter_age = sc.nextInt();

        if(voter_age >= 18){ //Conditional check for age criteria
            System.out.println("Voter is eligible to vote");
        }

        sc.close();
    }
}

class IfElseExample1{

    public static void main(String[] args){

        int num = 120;

        if(num < 50){
            System.out.println("num is less than 50");
        }
        else{
            System.out.println("num is greater than or equal to 50");
        }
    }
}

class IfElseExample2{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int voterAge;

        System.out.print("Enter the age: ");
        voterAge = sc.nextInt();

        if(voterAge >= 18){
            System.out.println("Voter is eligible to vote");
        }
        else{
            System.out.println("Voter is not eligible to vote");
        }

        sc.close();
    }
}

class JavaExample45{

    public static void main(String[] args){

        int number = 0;

        if(number > 0){
            System.out.println("The number is positive.");
        }
        else if(number < 0){
            System.out.println("The number is negative.");
        }
        else{
            System.out.println("The number is 0.");
        }
    }
}

class JavaExample46{

    public static void main(String[] args){

        int num1 = 10, num2 = 20, num3 = 7;

        if(num1 >= num2 && num1 >= num3){
            System.out.println(num1 + " is the largest number.");
        }
        else if(num2 >= num1 && num2 >= num3){
            System.out.println(num2 + " is the largest number.");
        }
        else{
            System.out.println(num3 + " is the largest number.");
        }
    }
}

class JavaExample47{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int Zaleha, Saliha, Neeloma;

        System.out.print("Enter the ages of Zaleha, Saliha, and Neeloma: "); //Taking input from the console
        Zaleha = sc.nextInt();
        Saliha = sc.nextInt();
        Neeloma = sc.nextInt();

        if((Zaleha > Saliha) && (Zaleha > Neeloma)){
            System.out.println("Zaleha is the oldest.");
        }
        else if((Saliha > Zaleha) && (Saliha > Neeloma)){
            System.out.println("Saliha is the oldest.");
        }
        else{
            System.out.println("They are of same age.");
        }

        sc.close();
    }
}

class roomCharge{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,###.00");
        int charge = 0, noOfDays;
        String room;

        System.out.print("Enter number of night: ");
        noOfDays = sc.nextInt();
        System.out.print("Enter room type: ");
        room = sc.next();

        if(room.equalsIgnoreCase("Single")){ //.equals is equivalent to ==, used to compare if strings are the same, .equalsIgnoreCase is used to compare if strings are the same wifout lookin at caps
            charge = noOfDays * 180;
        }
        else if(room.equalsIgnoreCase("Deluxe")){
            charge = noOfDays * 250;
        }
        else if(room.equalsIgnoreCase("Family")){
            charge = noOfDays * 350;
        }

        System.out.println("The total charge is RM" + df.format(charge));

        sc.close();
    }
}