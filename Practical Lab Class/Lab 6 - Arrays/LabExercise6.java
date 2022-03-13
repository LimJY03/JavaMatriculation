import java.util.Scanner;
import java.util.ArrayList;
import java.text.DecimalFormat;

class LabExercise6{}

class S1Q1{

    public static void main(String[] args){

        int array[] = new int[6];

        System.out.println(array);
    }
}

class S1Q2{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        double array[] = new double[10];

        //Enter values into array
        for(int i = 0; i < 10; i++){
            System.out.print("Enter a decimal number: ");
            array[i] = sc.nextDouble();
        }

        System.out.println("\nThe numbers entered are:");

        //Display values until the last second value so that the "," does not add to the last value
        for(int j = 0; j < array.length - 1; j++){
            System.out.print(array[j] + ", ");
        }

        //Display last value
        System.out.print(array[array.length - 1]);

        sc.close();
    }
}

class S1Q3{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String a[] = new String[5];

        //Enter values into array
        for(int i = 0; i < 5; i++){
            System.out.print("Enter a word: ");
            String[i] = sc.next();
        }

        sc.close();
    }
}

class S2Q1{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        //Determining size of array
        System.out.print("Enter the number of days: ");
        double temperature[] = new double[sc.nextInt()];

        // Alternative method to determine size of array
        /* System.out.print("Enter the number of days: ");
         * int n = sc.nextInt();
         * double[] temperature = new double[n];
         */

        //Enter values into array
        for(int i = 0; i < temperature.length; i++){
            System.out.print("Enter the temperature for day " + (i + 1) + ": ");
            temperature[i] = sc.nextDouble();
        }

        //Display values from array
        for(int j = 0; j < temperature.length; j++){
            System.out.println("The temperature for day " + (j + 1) + " is " + temperature[j]);
        }

        sc.close();
    }
}

class S2Q2{

    public static void main(String[] args){

        //Local initialisation part 1
        Scanner sc = new Scanner(System.in);
        int n;
        double weightMin = 9999;
        String nameMin = "";

        //Determining size of array
        System.out.print("Enter number of students: ");
        n = sc.nextInt();

        //initialisation part 2
        String name[] = new String[n];
        double weight[] = new double[n];

        //Enter values into both arrays
        for(int i = 0; i < n; i++){
            System.out.print("Enter name of student: ");
            sc.nextLine();
            name[i] = sc.nextLine();
            
            System.out.print("Enter the weight of student (kg): ");
            weight[i] = sc.nextDouble();
        }

        //Find minimum
        for(int j = 0; j < n; j++){
            if(weight[j] < weightMin){
                weightMin = weight[j];
                nameMin = name[j];
            }
        }

        //Display minimum weight + name
        System.out.println(nameMin + " has the lowest weight of " + weightMin + " kg.");
             
        sc.close();
    }
}

class S2Q3{

    public static void main(String[] args){

        //Local initialisations
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> odd = new ArrayList<Integer>();
        int number[] = new int[10];

        //Enter values into array
        for(int i = 0; i < 10; i++){
            System.out.print("Enter an integer: ");
            number[i] = sc.nextInt();
        }

        //Determine odd numbers
        for(int j = 0; j < 10; j++){
            if(number[j] % 2 != 0){
                odd.add(number[j]);
            }
        }

        //Display odd numbers
        if(odd.size() == 0){
            System.out.println("There are no odd numbers entered."); //no odd numbers entered
        }
        else if(odd.size() == 1){
            System.out.println("The odd number entered is: " + odd.get(0)); //one odd number entered
        }
        else{
            System.out.print("The odd numbers entered are:\n" + odd.get(0)); //more than one odd numbers entered
            for(int k = 1; k < odd.size(); k++){
                System.out.print(", " + odd.get(k));
            }
        }

        //Prevent resource leak for scanner
        sc.close();
    }
}

class S3Q1{

    public static void main(String[] args){

        //Local Initialisations
        Scanner sc = new Scanner(System.in);
        int num[] = new int[10], sum = 0, input;

        for(int i = 0; i < 10; i++){
            System.out.print("Enter an integer: ");
            input = sc.nextInt();
            num[i] = input;
            sum = sum + input;
        }

        //Display the sum of all array elements
        System.out.println("The sum of all array elements is " + sum);

        //Prevent resource leak for scanner
        sc.close();
    }
}

class S3Q2{

    public static void main(String[] args){

        //Local initialisations
        Scanner sc = new Scanner(System.in);
        String name[] = new String[50], nameMax = "";
        double score[] = new double[50], scoreEntered, scoreTotal = 0, scoreAverage, scoreMax = 0;
        int scoreMaxFreq = 0;

        //Enter values into arrays
        for(int i = 0; i < name.length; i++){
            System.out.print("Enter student's name: ");
            sc.nextLine(); //clear buffer
            name[i] = sc.nextLine();

            System.out.print("Enter " + name[i] + "'s marks:");
            scoreEntered = sc.nextDouble();
            
            //Calculate total score
            score[i] = scoreEntered;
            scoreTotal = scoreTotal + scoreEntered;
        }

        //Calculate and display average score
        scoreAverage = scoreTotal / name.length;
        System.out.println("\nThe average score is " + scoreAverage);

        //Determine and display name of student whose score is below average
        System.out.println("The students whose test scores are below " + scoreAverage + " marks are:");
        for(int j = 0; j < name.length; j++){
            if(score[j] < scoreAverage){
                System.out.println(name[j]);
            }
        }

        //Determine highest score
        for(int k = 0; k < name.length; k++){
            if(score[k] > scoreMax){
                scoreMax = score[k];
                nameMax = name[k];
            }
        }
        
        //Highest score frequency check
        for(int p = 0; p < name.length; p++){
            if(score[p] == scoreMax){
                scoreMaxFreq = scoreMaxFreq + 1;
            }
        }
        
        //Display highest score and name of student(s) having highest score
        System.out.println("\nThe highest score is " + scoreMax);
        if(scoreMaxFreq == 1){
            System.out.println("The student that obtain the highest score is: " + nameMax);
        }
        else{
            System.out.println("The students that obtain the highest score are:");
            for(int q = 0; q < name.length; q++){
                if(score[q] == scoreMax){
                    System.out.println(name[q]);
                }
            }
        }

        //Prevent resource leak for scanner
        sc.close();
    }
}

class S3Q3{

    public static void main(String[] args){

        //Local initialisation part 1
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#0.00");
        int n; 

        //Determining size of array
        System.out.print("Enter number of days: ");
        n = sc.nextInt();

        //Local initialisation part 2
        double temperature[] = new double[n], temperatureInput, temperatureSum = 0, temperatureAvg;

        //Enter values into array
        System.out.println(); //create a blank line
        for(int i = 0; i < n; i++){
            System.out.print("Enter the temperature for day " + (i + 1) + ": ");
            temperatureInput = sc.nextDouble();
            temperature[i] = temperatureInput;

            //Calculate total temperature
            temperatureSum = temperatureSum + temperatureInput;
        }

        //Calculate average temperature
        temperatureAvg = temperatureSum / n;
        String temperatureAvgFormatted = df.format(temperatureAvg);

        //Display temperature of each day
        System.out.println(); //create a blank line
        for(int j = 0; j < temperature.length; j++){
            System.out.println("The temperature for day " + (j + 1) + " is " + temperature[j]);
        }
        
        //Display average temperature
        System.out.println("\nThe average temperature for " + temperature.length + " days is " + temperatureAvgFormatted);

        //Prevent resource leak for scanner
        sc.close();
    }
}

class S3Q4{

    public static void main(String[] args){

        //Local initialisations part 1
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#0.00");
        int n;

        //Determining size of array
        System.out.print("Enter number of students: ");
        n = sc.nextInt();

        //Local initialisations part 2
        String name[] = new String[n], nameHighest = "", nameLowest = "", markAverageFormatted;
        double mark[] = new double[n], markHighest = 0, markLowest = 100, markInput, markSum = 0, markAverage;

        //Enter values into array
        System.out.println(); //Create blank line
        for(int i = 0; i < n; i++){
            System.out.print("Enter student " + (i + 1) + "'s name (without space): ");
            name[i] = sc.next();

            System.out.print("Enter " + name[i] + "'s marks: ");
            markInput = sc.nextDouble();
            mark[i] = markInput;

            //Calculate total marks
            markSum = markSum + markInput;
        }

        //Obtain highest and lowest marks and names of students associated with them
        System.out.println(); //Create blank line
        for(int j = 0; j < name.length; j++){
            if(mark[j] > markHighest){
                markHighest = mark[j];
                nameHighest = name[j];
            }

            if(mark[j] < markLowest){
                markLowest = mark[j];
                nameLowest = name[j];
            }
        }

        //Calculate average marks
        markAverage = markSum / name.length;
        markAverageFormatted = df.format(markAverage);

        //Display the name with mark for highest and lowest mark students, and the average marks
        System.out.println("\n" + nameHighest + " got the highest marks of " + markHighest);
        System.out.println(nameLowest + " got the lowest marks of " + markLowest);
        System.out.println("The average marks is " + markAverageFormatted);

        //Prevent resource leak for scanner
        sc.close();
    }
}