import java.util.Scanner;

class PSPM1718{}

class ErrorTestQ2b_ii{

    public static void main(String[] args){

        char A = 'S';
        char B = 'Z';

        if(A > B)
            System.out.print(A);
        else
            System.out.print(B); // System prints value in B because A is not > B (A cannot compare with B)
    }
}

class OutputDPTestQ2d{

    public static void main(String[] args){

        // Variables to hold the regular price, amount of discount and sale price
        double regularPrice = 70.00, discount, salePrice;

        // Calculate the amount of a 30% discount
        discount = regularPrice * 0.3;

        // Calculate the sale price by subtracting the discount from regular price
        salePrice = regularPrice - discount;

        // Display the results
        System.out.println("Regular price: RM" + regularPrice);
        System.out.println("Discount amount : RM" + discount);
        System.out.println("Sale price: RM" + salePrice);
    }
}

class Q4{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int excellentCount = 0, averageCount = 0, weakCount = 0;
        double marks = 0.0, marksHighest = 0.0, marksLowest = 100.0;
        boolean terminate = false;

        while(!terminate){
            System.out.print("Enter a mark: ");
            marks = sc.nextDouble();

            if(marks > 100 || marks < 0){
                terminate = true;
                break;
            }
            else if(marks > 80){
                excellentCount++;
            }
            else if(marks > 50){
                averageCount++;
            }
            else{
                weakCount++;
            }

            if(marks > marksHighest){
                marksHighest = marks;
            }

            if(marks < marksLowest){
                marksLowest = marks;
            }
        }

        System.out.println("Number of Excellent students: " + excellentCount);
        System.out.println("Number of Average students: " + averageCount);
        System.out.println("Number of Weak students: " + weakCount);
        System.out.println("Highest marks: " + marksHighest);
        System.out.println("Lowest marks: " + marksLowest);

        sc.close();
    }
}