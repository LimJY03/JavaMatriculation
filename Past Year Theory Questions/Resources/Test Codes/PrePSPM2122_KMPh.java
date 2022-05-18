class PrePSPM2122_KMPh{}

class Q4a{

    public static void main(String[] args){

        java.util.Scanner sc = new java.util.Scanner(System.in);
        int arrNum[] = new int[10], sumEven = 0, numHighest = 0;

        for(int i = 0; i < 10; i++){

            System.out.print("Enter a number: ");
            arrNum[i] = sc.nextInt();

            if(arrNum[i] % 2 == 0){sumEven += arrNum[i];}

            if(arrNum[i] > numHighest){numHighest = arrNum[i];}
        }

        System.out.println("Max value entered: " + numHighest);
        System.out.println("Sum of even number: " + sumEven);

        sc.close();
    }
}

class Q4b{

    public static void main(String[] args){

        Q4b call = new Q4b();
        int sum = call.sumNumber();

        System.out.println("The sum of numbers from 1 to 30 is " + sum);
    }

    int sumNumber(){

        int sum = 0;        

        for(int i = 0; i <= 30; i++){
            sum += i;
        }
        
        return sum;
    }
}