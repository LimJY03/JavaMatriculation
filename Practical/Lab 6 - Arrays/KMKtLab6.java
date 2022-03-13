import java.util.Scanner;

class KMKtLab6{}

class ArrayDemo1{

    public static void main(String[] args){

        int[] array = new int[5]; //declare and create an array of integers with size 5

        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
}

class ArrayDemo2{

    public static void main(String[] args){

        int[] array = new int[] {1, 2, 3, 4, 5}; //array declaration and initialization

        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
}

class ArrayDemo3{

    public static void main(String[] args){

        int[] anArray = new int[10]; //declare and create an array "anArray" of integers of size 10.

        for(int i = 0; i < anArray.length; i++){
            anArray[i] = i;
            System.out.print(anArray[i] + " ");
        }
        System.out.println();
    }
}

class ArrayInputExample1{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n;
        
        System.out.print("Enter the number of elements you want to store: ");
        n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements of the array: ");

        for(int i = 0; i < n; i++){
            array[i] = sc.nextInt();
        }

        System.out.println("Array elements are: ");

        for(int i = 0; i < n; i++){
            System.out.println("array[" + i + "] = " + array[i]);
        }

        sc.close();
    }
}

class EvenArray{

    public static void main(String[] args){

        int[] list = {2, 5, 16, 18, 21};

        System.out.println("The even numbers of array: ");

        for(int i = 0; i < list.length; i++){
            if(list[i] % 2 == 0){
                System.out.print(list[i] + " ");
            }
        }

        System.out.println();
    }
}

class Sales{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        final int SALESPEOPLE = 4;
        double[] sales = new double[SALESPEOPLE];
        String[] salesperson = new String[SALESPEOPLE];

        for(int i = 0; i < sales.length; i++){
            System.out.print("Enter sales for salesperson " + (i + 1) + ": ");
            sales[i] = sc.nextDouble();
            System.out.print("Enter name for salesperson " + (i + 1) + ": ");
            salesperson[i] = sc.next();
        }

        System.out.println("\nSalesperson Sales");
        System.out.println("-------------------");

        for(int i = 0; i < sales.length; i++){
            System.out.print(salesperson[i]);
            System.out.println("        " + sales[i]);
        }

        double maxSales = sales[0];
        String maxNames = salesperson[0];

        for(int i = 0; i < sales.length; i++){
            if(sales[i]  > maxSales){
                maxSales = sales[i];
                maxNames = salesperson[i];
            }
        }

        System.out.println("\nHighest sales is: " + maxSales);
        System.out.println("Sales person name is: " + maxNames);

        sc.close();
    }
}

class ArrayAverage{

    public static void main(String[] args){

        int sum = 0, max = 0, min = 100;
        int[] marks = new int[] {82, 70, 99, 90, 92, 75, 87, 85, 91, 100, 91, 87};

        for(int i = 0; i < marks.length; i++){
            sum = sum + marks[i];
            
            if(min > marks[i]){
                min = marks[i];
            }
            
            if(max < marks[i]){
                max = marks[i];
            }
        }

        double average = (double) sum / marks.length; //convert "sum" var from int to double
        
        System.out.println("min: " + min);
        System.out.println("max: " + max);
        System.out.printf("average: %.2f", average); //display averagee with formatting decimals value
    }
}

class LinearSearchExample{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int counter, num, item;
        int[] array;

        try{

            System.out.print("Enter the number of elements: ");
            num = sc.nextInt();
            array = new int[num];
            System.out.println("Enter " + num + " integers");

            for(counter = 0; counter < num; counter++){
                array[counter] = sc.nextInt();
            }

            System.out.print("Enter the search value: ");
            item = sc.nextInt();
            
            for(counter = 0; counter < num; counter++){
                if(array[counter] == item){
                    System.out.println(item + " is present at location " + (counter + 1));
                    break; //after success execute, break loop
                }
            }

            if(counter == num){
                System.out.println(item + " doesn't exist in array.");
            }
        }
        finally{
            
            sc.close();
        }
    }
}

class FrequencySample{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String[] name = new String[3], gender = new String[3];
        int maleCount = 0, femaleCount = 0, i;

        try{

            System.out.println("Enter name and Gender (M/F)");
            System.out.println("Name Gender");

            for(i = 0; i < gender.length; i++){
                name[i] = sc.next();
                gender[i] = sc.next();
            }

            for(i = 0; i < gender.length; i++){
                if(gender[i].equalsIgnoreCase("M")){
                    maleCount++;
                }
                else if(gender[i].equalsIgnoreCase("F")){
                    femaleCount++;
                }
            }

            System.out.println("maleCount: " + maleCount);
            System.out.println("femaleCount: " + femaleCount); 
        }
        finally{
            
            sc.close();
        }
    }
}