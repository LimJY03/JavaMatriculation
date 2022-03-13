import java.text.DecimalFormat; // format price dp
import java.util.Scanner; // for user input

class LimJunYi_F2T9{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in); // declare method
        DecimalFormat df = new DecimalFormat("###,###.00"); // set format, ".00" represents substitution of 0 for any missing digit at the decimal place

        try{

            System.out.println("------------------------- GR Tech Sdn Bhd ----------------------"); // requirement?
            System.out.print("Input item: ");
            String itemname = sc.nextLine(); // item name might have spaces in between
            System.out.print("Input price of item RM: ");
            double price = sc.nextDouble(); // item price has decimal places
            System.out.print("Input quantity: ");
            int quantity = sc.nextInt(); // item quantity is an integer

            double sum = price * quantity;
            double discount = 0.1 * sum;
            double net = sum - discount;
            double donation = 0.03 * net;

            System.out.println("------------------------- GR Tech Sdn Bhd -----------------------"); // requirement?
            System.out.println("Total payment for " + itemname + " is RM " + df.format(sum));
            System.out.println("Discount for " + itemname+ " is RM " + df.format(discount));
            System.out.println("Net payment for " + itemname + " is RM " + df.format(net));
            System.out.println("Donating to charities is RM " + df.format(donation) + "\n");

        }finally{

            sc.close(); // close scanner to prevent memory lost
        }
    }
}