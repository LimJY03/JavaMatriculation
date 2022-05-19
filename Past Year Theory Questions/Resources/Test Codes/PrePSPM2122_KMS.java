import java.util.Scanner;

class PrePSPM2122_KMS{}

class Q4kms{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int lowCount = 0;

        System.out.print("Enter number of persons: ");
        final int n = sc.nextInt();

        double arrSystolic[] = new double[n], arrDiastolic[] = new double[n], diastolicMin = 999.9;
        
        for(int i = 0; i < n; i++){

            System.out.print("Enter systolic and diastolic blood pressure: ");
            arrSystolic[i] = sc.nextDouble();
            arrDiastolic[i] = sc.nextDouble();

            if(arrDiastolic[i] < diastolicMin){diastolicMin = arrDiastolic[i];}

            if(arrSystolic[i] < 100 && arrDiastolic[i] < 60){lowCount++;}
        }

        System.out.println("The minimum reading of diastolic blood pressure is " + diastolicMin + " mmHg");
        System.out.println("The number of person categorized as low blood pressure is " + lowCount);

        sc.close();
    }
}