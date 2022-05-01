import java.util.Scanner;

class PSPM1617{}

class Q5a{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n, factorial = 1;

        System.out.print("Enter an integer: ");
        n = sc.nextInt();

        for(int i = n; i > 0; i--){
            factorial *= i;
        }

        System.out.println("The factorial of " + n + " is " + factorial + ".");

        sc.close();
    }
}

class Q5b{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int num = 0;
        boolean div3 = false, div5 = false;

        System.out.print("Enter a number: ");
        num = sc.nextInt();

        div3 = (num % 3) == 0 ? true : false;
        div5 = (num % 5) == 0 ? true : false;

        if(div3 && div5){
            System.out.println(num + " is divisible by both numbers 3 and 5.");
        }
        else if(div3){
            System.out.println(num + " is divisible by 3 only.");
        }
        else if(div5){
            System.out.println(num + " is divisible by 5 only.");
        }
        else{
            System.out.println(num + " is NOT divisible by 3 or 5.");
        }

        sc.close();
    }
}