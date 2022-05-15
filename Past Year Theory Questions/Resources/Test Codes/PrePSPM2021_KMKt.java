import java.util.Scanner;

class PrePSPM2021_KMKt{}

class Q5{

    public static void main(String[] args){

        System.out.println(FindMin(6, 3, 10));
    }

    static int FindMin(int n1, int n2, int n3){

        return (n1 < n2 && n1 < n3) ? n1 : (n2 < n1 && n2 < n3) ? n2 : n3;
    }
}

class Q6{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String clothesBrand[] = new String[7], brandLowest = "", brandHighest = "";
        double clothesSales[] = new double[7], salesLowest = 99999.0, salesHighest = 0.0, salesTotal = 0.0, salesAvg = 0.0;

        for(int i = 0; i < 7; i++){

            System.out.print("Enter brand name #" + (i + 1) + ": ");
            clothesBrand[i] = sc.next();
            System.out.print("Enter sales volume for " + clothesBrand[i] + ": ");
            clothesSales[i] = sc.nextDouble();

            if(clothesSales[i] > salesHighest){
                salesHighest = clothesSales[i];
                brandHighest = clothesBrand[i];
            }

            if(clothesSales[i] < salesLowest){
                salesLowest = clothesSales[i];
                brandLowest = clothesBrand[i];
            }
            
            salesTotal += clothesSales[i];
        }

        for(int j = 0; j < 7; j++){
            
            System.out.println(clothesBrand[j] + " has sales of RM" + String.format("%.2f", clothesSales[j]));
        }

        System.out.println("Total Sales is RM" + String.format("%.2f", salesTotal));
        System.out.println("Average Sales is RM" + String.format("%.2f", (salesTotal / 7)));
        System.out.println("Highest Sales is RM" + String.format("%.2f", salesHighest) + " from " + brandHighest);
        System.out.println("Lowest Sales is RM" + String.format("%.2f", salesLowest) + " from " + brandLowest);

        sc.close();
    }
}