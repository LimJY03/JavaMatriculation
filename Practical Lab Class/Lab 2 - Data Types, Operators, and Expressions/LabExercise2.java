import java.util.Scanner;

class LabExercise2{

    public static void main(String[] args){

        System.out.println("KMKt Lab Exercises 2.1");
    }
}

class q1{

    public static void main(String[] args){

        String name = "Salsabila";
        String degree = "Multimedia";
        int cNeeded = 120;
        int cTaken = 45;

        System.out.println("Enter student name: " + name);
        System.out.println("Enter the degree name: " + degree);
        System.out.println("Enter the number of credits required for the degree: " + cNeeded);
        System.out.println("Enter the number of credits taken so far: " + cTaken);

        double cLeft = cNeeded - cTaken;

        System.out.println("\nThe student's name is " + name);
        System.out.println("The degree name is " + degree);
        System.out.println("There are " + cLeft + " credits left until graduation");
    }
}

class q2{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        try{

            System.out.print("Please enter your name: ");
            String name = sc.next();

            System.out.println("Hello " + name + ", welcome to SC025!!!");
            System.out.print(name + ", how old are you? ");
            int age = sc.nextInt();
            System.out.print(age);

        }finally{

            sc.close();
        }
    }
}

class part2_q1{

    public static void main(String[] args){

        double result = 25 + 15 * 3 - (10.0 / (2.0 * 6.0)) + ((9 % 6)/3) + 1; // values in the fraction that will have decimal nid to be double

        System.out.println(result);
    }
}

class part2_q2{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        try{

            System.out.print("Enter the celcius value: ");
            double cel = sc.nextDouble();

            double frh = (9.0 / 5.0) * cel + 32;
            System.out.println(cel + " Celcius -> " + frh + " Fahrenheit.");

        }finally{

            sc.close();
        }
    }
}

class part2_q3{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        try{

            System.out.print("Enter the number in feet: ");
            double ft = sc.nextDouble();

            double m = ft * 0.305;
            System.out.println(ft + " feet is " + m + " meters.");

        }finally{

            sc.close();
        }
    }
}

class part2_q4{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        try{

            System.out.print("Enter three numbers separated by space: ");
            double n1 = sc.nextDouble();
            double n2 = sc.nextDouble();
            double n3 = sc.nextDouble();

            double avg = (n1 + n2 + n3) / 3;
            System.out.println("The average of the three numbers is " + avg);

        }finally{

            sc.close();
        }
    }
}

class part2_q5a{

    public static void main(String[] args){

        int var1 = 5;
        int var2 = 6;
        System.out.print(var1 > var2); 
        
        // output: false
    }
}

class part2_q5b{

    public static void main(String[] args){

        boolean a = true;
        boolean b = !true;
        boolean c = a | b; // true
        boolean d = a & b; // false
        boolean e = d ? b : c; // if d is true, then b, else c -> since d is false, so e = c
        System.out.println(d + " " + e);

        // output: false true
    }
}

class part2q5c{

    public static void main(String[] args){

        int x,y = 1; // x and y are integers, and y = 1

        x = 10;

        if(x != 10 && x / 0 == 0) // true AND false (x/0 = undefined) -> false
            System.out.println(y); // skip
        else 
            System.out.println(++y); // ++y means value in y increase by 1 (1 + 1 = 2)

        // output: 2
    }
}