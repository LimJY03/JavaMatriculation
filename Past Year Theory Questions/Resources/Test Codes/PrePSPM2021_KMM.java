import java.util.Scanner;

class PrePSPM2021_KMM{}

class Q6{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        double salary[] = new double[30], salaryHighest = 0.0, salaryLowest = 99999.0;
        int count700 = 0, count800 = 0, count900 = 0, count1000 = 0;

        for(int i = 0; i < 30; i++){

            System.out.print("Enter gross sales for salesperson #" + (i + 1) + ": ");
            salary[i] = sc.nextInt() * 0.09 + 200;

            if(salary[i] > 1000){count1000++;}
            else if(salary[i] > 900){count900++;}
            else if(salary[i] > 800){count800++;}
            else if(salary[i] > 700){count700++;}

            if(salary[i] > salaryHighest){salaryHighest = salary[i];}
            
            if(salary[i] < salaryLowest){salaryLowest = salary[i];}
        }
        
        System.out.println("There are " + count700 + " salesman that have salaries between RM700 to RM799");
        System.out.println("There are " + count800 + " salesman that have salaries between RM800 to RM899");
        System.out.println("There are " + count900 + " salesman that have salaries between RM900 to RM999");
        System.out.println("There are " + count1000 + " salesman that have salaries over RM1000");

        System.out.println("The highest salary earned is RM" + String.format("%.2f", salaryHighest));
        System.out.println("The lowest salary earned is RM" + String.format("%.2f", salaryLowest));

        sc.close();
    }
}