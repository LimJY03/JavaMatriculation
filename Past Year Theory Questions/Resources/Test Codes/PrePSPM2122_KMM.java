class PrePSPM2122_KMM{}

class Q6{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int num[] = new int[9], sumEvenIndex = 0, sumOddIndex = 0, sumAll = 0, sumEvenInt = 0, belowAvg = 0, intMax = 0, intMin = 9999999;
        double average = 0.0;

        for(int i = 0; i < num.length; i++){

            System.out.print("Enter integer #" + (i + 1) + ": ");
            num[i] = sc.nextInt();

            // Sum of elements present at even indexes and odd indexes in array
            if(i % 2 == 0){sumEvenIndex += num[i];}
            else{sumOddIndex += num[i];}

            // Sum for all integers in array
            sumAll += num[i];

            // Sum of even integers exist in the array
            if(num[i] % 2 == 0){sumEvenInt += num[i];}

            // Determine maximum and minimum integer
            if(num[i] > intMax){intMax = num[i];}
            if(num[i] < intMin){intMin = num[i];}
        }
        
        // Determine average
        average = (sumAll + 0.0) / num.length;

        // Determine number of elements below average
        for(int j = 0; j < num.length; j++){

            if(num[j] < average){belowAvg++;}
        }

        System.out.println("Sum of elements present at even indexes in array is " + sumEvenIndex);
        System.out.println("Sum of elements present at odd indexes in array is " + sumOddIndex);
        System.out.println("Sum of all integers in array is " + sumAll);
        System.out.println("Sum of even integers exist in array is " + sumEvenInt);
        System.out.println("Average is " + average);
        System.out.println("Number of elements below average is " + belowAvg);
        System.out.println("Maximum integer is " + intMax);
        System.out.println("Minimum integer is " + intMin);

        sc.close();
    }
}