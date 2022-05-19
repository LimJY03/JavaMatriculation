import java.util.Scanner;

class PrePSPM2122_KMPP{}

class Q4c{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = 0;

        System.out.print("Enter number of students: ");
        n = sc.nextInt();

        String studID[] = new String[n], nameHighest = "";
        double pracOne[] = new double[n], pracTwo[] = new double[n], markHighest = 0.0;

        for(int i = 0; i < n; i++){

            studID[i] = sc.next();
            pracOne[i] = sc.nextDouble();
            pracTwo[i] = sc.nextDouble();

            if(pracOne[i] > markHighest){
                
                markHighest = pracOne[i];
                nameHighest = studID[i];
            }
            if(pracTwo[i] > markHighest){
                
                markHighest = pracTwo[i];
                nameHighest = studID[i];
            }
        }

        System.out.println("Best student is " + nameHighest);
        System.out.println("Highest score is " + markHighest);

        sc.close();
    }
}