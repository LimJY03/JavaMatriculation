import java.util.Scanner;

class PrePSPM2021_KMNS{}

class Q5c{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Q5c bus = new Q5c();
        char input = 'Y';

        System.out.print("Do you want to start? (Y/N): ");
        input = sc.next().charAt(0);

        while(input != 'N'){

            System.out.print("Enter destination code and ticket quantity separated by white space: ");
            bus.calcPrice(sc.nextInt(), sc.nextInt());

            System.out.print("Do you want to continue? (Y/N): ");
            input = sc.next().charAt(0);
        }

        sc.close();
    }

    void calcPrice(int code, int count){

        double price = 0.0;

        if(code == 1){price = 45.0;}
        else if(code == 2){price = 28.0;}
        else if(code == 3){price = 55.5;}

        System.out.println("Ticket Price is RM" + String.format("%.2f", (price * count)));
        System.out.println("Insurance is RM" + String.format("%.2f", (price * count * 0.05)));
        System.out.println("Total Price is RM" + String.format("%.2f", (price * count * 1.05)));
    }
}