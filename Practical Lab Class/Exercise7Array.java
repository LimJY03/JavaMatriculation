/*
 * Write a program Java Coding ONLY (no IPO and etc) to print odd numbers from 1 to
 * 111, then sum up all numbers of 2nd index , 5th index , 17th index and the last index.
 */

 class Exercise7Array{

    public static void main(String[] args){

        // Local initialisations
        int oddNumber[] = new int[(1 + 111)/2];

        // Input values into array + display while auto inputting
        for(int i = 0; i < oddNumber.length - 1; i++){
            oddNumber[i] = (2 * i) + 1;
            System.out.print(((2 * i) + 1) + ", ");
        }

        oddNumber[((1 + 111)/2) - 1] = 111;
        System.out.println(111);

        // Sum up numbers required and display
        System.out.println("The sum of " + oddNumber[1] + ", " + oddNumber[4] + ", " + oddNumber[16] + " and 111 is " + oddNumber[1] + oddNumber[4] + oddNumber[16] + 111 + ".");
    }
 }