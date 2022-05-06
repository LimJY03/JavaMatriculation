import java.util.Scanner;

class PSPM2021{}

class Q3c{

    public static void main(String[] args){

        System.out.println(true || false && 7 < 8 || !(4 == 5));
        System.out.println((6 % 4) % 5);
    }
}

class Q3f{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int num = 0, sum = 0;

        num = input.nextInt();
        sum = num;

        while(num != -1){
        
            num = input.nextInt();
            sum += num; // sum = sum + num
        }

        System.out.print(" Sum = " + sum);

        input.close();
    }
}

class Q3h{

    public static void main(String[] args){

        double A = 0;

        for(int x = 3; x < 8; x = x + 1){
        
            if(x < 4)
                A = (x * x) - 1;
            else if(x < 6)
                A = 5 + x;
            else
                A = 20 - (x * x);
            
            System.out.println("x = " + x + ", A(" + x + ") = " + A);
        }
    }
}

class Q4{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int cases[] = new int[14], caseMax = 0;
        String zoneClass[] = new String[14];

        for(int i = 0; i < cases.length; i++){

            System.out.print("Enter the number of cases for state #" + (i + 1) + ": ");
            cases[i] = sc.nextInt();

            if(cases[i] > caseMax){
                caseMax = cases[i];
            }

            if(cases[i] > 40){
                zoneClass[i] = "Red";
            }
            else if(cases[i] > 0){
                zoneClass[i] = "Yellow";
            }
            else if(cases[i] == 0){
                zoneClass[i] = "Green";
            }
        }

        System.out.println("The highest number of cases among the 14 states is " + caseMax + " cases.");

        for(int j = 0; j < cases.length; j++){

            System.out.println("State #" + (j + 1) + " is " + zoneClass[j] + " Zone.");
        }

        sc.close();
    }
}