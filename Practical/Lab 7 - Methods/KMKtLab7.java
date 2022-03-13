import java.util.Scanner;

class KMKtLab7{}

class Method_Sample{

    int addNumbers(int a, int b){ //Create a method

        int sum;

        sum = a + b;
        return sum; //return value back to main
    }

    public static void main(String[] args){

        Method_Sample obj = new Method_Sample();
        int num1 = 10, num2 = 15, result;        
        
        result = obj.addNumbers(num1, num2); //Use method created above, sum from above return to result

        System.out.println("Sum is: " + result);
    }
}

class Circle{

    double area(){

        double r = 5.5, ar;

        ar = 3.14 * r * r;
        return ar;
    }

    public static void main(String[] args){

        Circle c = new Circle();
        double area;
        
        area = c.area(); //variable area takes the value ar from area method
        System.out.println("Area of circle is: " + area);
    }
}

class TestMax{

    public static void main(String[] args){

        TestMax obj = new TestMax();
        int i = 8, j = 11, k;

        k = obj.max(i, j);
        System.out.println("The maximum between " + i + " and " + j + " is " + k);
    }

    int max(int num1, int num2){ //Method can be declare before or after the main

        int result;

        if(num1 > num2){
            result = num1;
        }
        else{
            result = num2;
        }

        return result;
    }
}

class JavaMethod3{

    void studentRank(int points){ //void returntype means can nonid return

        if(points >= 600){
            System.out.println("Rank: Top");
        }
        else if(points >= 300){
            System.out.println("Rank: Middle");
        }
        else{
            System.out.println("Rank: Bottom");
        }
    }

    public static void main(String[] args){

        JavaMethod3 obj = new JavaMethod3();
        obj.studentRank(550); //since display is included in method, nonid to return to main unless needed
    }
}

public class JavaMethod4{ //public class means the class can be accessed by programs from different folder

    void greet1(){
        
        System.out.println("Now ... I'm Enjoy ...");
        return; //wan put return oso can no oso can
    }

    void greet2(){

        System.out.println("to learn Java Programming");
    }

    public static void main(String[] args){

        JavaMethod4 obj = new JavaMethod4();
        obj.greet1();
        obj.greet2();
    }
}

class Test{ //class by default is private, only accessible by programs from same folder

    void areaCircle(){

        Scanner sc = new Scanner(System.in);
        float r, ar; //float is decimal but less range than double

        System.out.print("Enter the radius: ");
        r = sc.nextFloat(); //if use float, here oso nid use .nextFloat()

        ar = (r * r) * 22 / 7;
        
        System.out.println("Area of circle is " + ar + " sq units.");

        sc.close();
    }
}

class MethodDemo{

    public static void main(String[] args){

        Test obj = new Test(); //using method from different class, but under same folder
        obj.areaCircle();
    }
}