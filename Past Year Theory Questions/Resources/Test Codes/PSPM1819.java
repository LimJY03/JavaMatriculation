import java.util.Scanner;

class PSPM1819{}

class Q5{

    public static void main(String[] args){

        int a = 10, b = 5;
        double c = 2, x = 4.2, y = 33;

        c = a + b - x / c;
        y = 56 % 5 / 2 + a;        
        
        System.out.println(c + " " + y);
        
        int n = 10;

        while(n > 0){
        
            System.out.print(n + ", ");
            n--;
        }

        System.out.print("Bravo!");
    }
}

class Q6{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of athletes: ");
        final int n = sc.nextInt();

        int id[] = new int[n], idWinner = 0;
        double distanceLonger[] = new double[n], distanceLongest = 0.0;

        for(int i = 0; i < id.length; i++){

            System.out.print("Enter ID, Jump1, Jump2: ");
            id[i] = sc.nextInt();
            distanceLonger[i] = getLarger(sc.nextDouble(), sc.nextDouble());

            if(distanceLonger[i] > distanceLongest){
                idWinner = id[i];
                distanceLongest = distanceLonger[i];
            }
        }

        System.out.println("The winner is athlete with ID " + idWinner);
        System.out.println("The winning jump is " + distanceLongest + "m.");

        sc.close();
    }

    static double getLarger(double n1, double n2){

        return n1 > n2 ? n1 : n2;
    }
}