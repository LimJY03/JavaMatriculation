import java.util.Scanner;

class PrePSPM2122_KMPk{}

class Q4{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Q4 array = new Q4();
        int n = 0;
        double resultHighest = 0.0;

        System.out.print("Enter number of students: ");
        n = sc.nextInt();

        double[] mark = new double[n];

        for(int i = 0; i < n; i++){

            System.out.print("Enter mark for student #" + (i + 1) + ": ");
            mark[i] = sc.nextDouble();
        }

        resultHighest = array.findHighest(mark);

        System.out.println("The highest result is " + resultHighest);

        sc.close();
    }

    double findHighest(double[] m){

        double highest = 0.0;

        for(int i = 0; i < m.length; i++){

            if(m[i] > highest){highest = m[i];}
        }

        return highest;
    }
}