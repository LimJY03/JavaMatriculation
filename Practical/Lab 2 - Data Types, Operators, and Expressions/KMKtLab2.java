import java.util.Scanner;

class KMKtLab2{

    public static void main(String[] args){

        System.out.println("KMKtLab2 - Notes");
    }
}

class Variables{

    public static void main(String[] args){

        double num = -10.6; // the num var contains a decimal number

        System.out.println(5);
        System.out.println(num);
    }
}

class ConcatenatedStrings{

    public static void main(String[] args){

        int age = 19; // age var contains integer

        System.out.println("I am " + "awesome.");
        System.out.println("My age is " + age + ".");
    }
}

class VarValDisp{

    public static void main(String[] args){

        String name = "Shafizal";
        int age = 19;
        double weight = 60.5;
        boolean married = false;
        char gender = 'M'; // char uses ' ' instead of " "

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Weight: " + weight);
        System.out.println("Married? " + married);
        System.out.println("Gender: " + gender);
    }
}

class inputNumber{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        try{

            System.out.print("Enter an integer: ");
            int num = sc.nextInt();

            System.out.println("You entered " + num + ".");

        }finally{

            sc.close();
        }
    }
}

class AreaCalc{

    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        try{

            System.out.print("Enter the radius of circle: ");
            double r = sc.nextDouble();

            double A = r * r * 3.14;

            System.out.println("The area for the circle of radius " + r + " is " + A + ".");

        }finally{

            sc.close();
        }
    }
}

class UserInfo{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        try{

            System.out.print("Enter gender (M/F): ");
            char sex = sc.next().charAt(0);
            System.out.println("Your gender is " + sex + ".");
            
            System.out.print("Enter marrital status (true/false): ");
            boolean mar = sc.nextBoolean();
            System.out.println("Married? " + mar);
            
            System.out.print("Enter a text: ");
            String text = sc.next();
            System.out.println("Text entered is " + text + ".");

        }finally{

            sc.close();
        }
    }
}

class ArithmeticOperation{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        try{

            System.out.print("Enter the first number: ");
            int n1 = sc.nextInt();
            System.out.print("Enter the second number: ");
            int n2 = sc.nextInt();

            int sum = n1 + n2;
            int dif = n1 - n2;
            int mul = n1 * n2;
            int div = n1 / n2;
            int rmd = n1 % n2;

            System.out.println("\nSum = " + sum);
            System.out.println("Difference = " + dif);
            System.out.println("Product = " + mul);
            
            if(rmd == 0)
                System.out.println("Quotient = " + div);
            else
                System.out.println("Quotient = " + div + " R " + rmd);

        }finally{

            sc.close();
        }
    }
}

class RelationalTest{

    public static void main(String[] args){

        int a = 10;
        int b = 20;

        System.out.println("a == b = " + (a == b)); // == means var value same as value required
        System.out.println("a != b = " + (a != b)); // != means var value not same as value required
        System.out.println("a > b = " + (a > b)); 
        System.out.println("a < b = " + (a < b));
        System.out.println("a >= b = " + (a >= b));
        System.out.println("a <= b = " + (a <= b));
    }
}

class otherOperators{

    public static void main(String[] args){

        // && operator means AND
        System.out.println((5 > 3) && (8 > 5)); // true AND true -> true
        System.out.println((5 > 3) && (8 < 5)); // true AND false -> false

        // || operator means OR
        System.out.println((5 < 3) || (8 > 5)); // false OR true -> true
        // System.out.println((5 > 3) || (8 < 5)); // true OR false -> true
        System.out.println((5 < 3) || (8 < 5)); // false OR false -> false
    }
}