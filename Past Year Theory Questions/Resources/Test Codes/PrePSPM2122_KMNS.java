import java.util.Scanner;

class PrePSPM2122_KMNS{}

class Q8a{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        double sales[] = new double[7], salesTotal = 0.0, salesAvg = 0.0, salesHighest = 0.0, salesLowest = 99999.9; 
        int aboveAvg = 0;

        for(int i = 0; i < sales.length; i++){

            System.out.print("Enter sales: RM");
            sales[i] = sc.nextDouble();

            while(sales[i] < 0){

                System.out.println("PLEASE ENTER POSITIVE VALUE");
                System.out.print("Enter sales: RM");
                sales[i] = sc.nextDouble();
            }

            salesTotal += sales[i];

            if(sales[i] > salesHighest){salesHighest = sales[i];}
            if(sales[i] < salesLowest){salesLowest = sales[i];}
        }

        salesAvg = salesTotal / sales.length;

        for(int j = 0; j < sales.length; j++){

            if(sales[j] > salesAvg){aboveAvg++;}
        }

        System.out.println("Total sales for a week: RM" + salesTotal);
        System.out.println("Average sales for a week: RM" + String.format("%.2f", salesAvg));
        System.out.println("Number of sales above average: " + aboveAvg);
        System.out.println("The highest sale in a week: RM" + salesHighest);
        System.out.println("The lowest sale in a week: RM" + salesLowest);

        if(salesTotal < 25000){
            System.out.println("TOTAL SALE IS NOT ENOUGH");
        }
        else{
            System.out.println("BUSINESS ARE PROFITABLE");
        }

        sc.close();
    }
}

class Q8b{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int num = 0, sumPositive = 0, evenCount = 0, divBy3 = 0;
        
        System.out.print("Enter a number (0 to stop): ");
        num = sc.nextInt();

        while(num != 0){

            if(num > 0){sumPositive += num;}
            if(num % 2 == 0){evenCount++;}
            if(num % 3 == 0){divBy3++;}

            System.out.print("Enter a number (0 to stop): ");
            num = sc.nextInt();
        }

        System.out.println("The sum of all positive number: " + sumPositive);
        System.out.println("Total even number: " + evenCount);
        System.out.println("Total number divisible by 3: " + divBy3);

        sc.close();
    }
}