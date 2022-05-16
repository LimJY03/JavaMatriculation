import java.util.Scanner;

class PrePSPM2122_KMK{}

class Q4{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        double markHighest = 0.0, markAverage = 0.0, markSum = 0.0;
        String nameHighest = "";

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        double[] mark = new double[n];
        String[] name = new String[n];

        for(int i = 0; i < n; i++){

            System.out.print("Enter student name: ");
            name[i] = sc.next();
            System.out.print("Enter mark for " + name[i] + ": ");
            mark[i] = sc.nextDouble();

            if(mark[i] > markHighest){

                markHighest = mark[i];
                nameHighest = name[i];
            }

            markSum += mark[i];
        }

        markAverage = markSum / n;

        System.out.println(nameHighest + " has the highest mark of " + markHighest + ".");
        System.out.println("The average marks is " + markAverage);

        sc.close();
    }
}