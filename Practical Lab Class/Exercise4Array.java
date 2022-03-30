// sum up all of the values (using array) starting at 1 and going until the sum is greater than 100

class Exercise4Array{

    public static void main(String[] args){

        // Local initialisations
        int integers[] = new int[100], sum = 0, i, j;

        // Insert values into array integers
        for(i = 0; i < integers.length; i++){

            integers[i] = i + 1;        
        }

        // Start summing values until sum > 100
        for(j = -1; (100 - sum) > integers[j + 1]; j++){
            
            sum += integers[j + 1];        
        }

        // Prints the final sum
        System.out.println("The sum from 1 to " + (j + 1) + " is " + sum + ".");
    }
}