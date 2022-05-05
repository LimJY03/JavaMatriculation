class PSPM1920{}

class Q4{

    public static void main(String[] args){

        double length = 4.5;
        double width = 9.3;
        double height = 7.8;
        double volume = 0.0;

        volume = length * width * height;

        System.out.println("The volume of cuboid is " + volume + " cm3");
    }
}

class Q5{

    public static void main(String[] args){

        Q5 convert = new Q5();
        double degreeCelcius = 28.5;

        double degreeFahrenheit = convert.celciusToFahrenheit(degreeCelcius);
        System.out.println(degreeCelcius + " °C in Fahrenheit is " + degreeFahrenheit + " °F.");
    }

    double celciusToFahrenheit(double celcius){

        return (celcius * (9.0 / 5.0)) + 32;
    }
}

class Q7a{

    public static void main(String[] args){

        Q7 check = new Q7();

        System.out.println(check.divisibleBy3(7));
    }

    public boolean divisibleBy3(int number){
    
        return (number % 3 == 0);
    }
}

class Q7b{

    public static void main(String[] args){

        Q7b arrStats = new Q7b();

        int myList[] = {1, 4, 3, 5, 2}, max = 0;

        max = arrStats.findMax(myList);

        System.out.println("The maximum number in the array is " + max);
    }

    int findMax(int[] arrInput){

        int maximum = -99999;

        for(int i = 0; i < arrInput.length; i++){

            if(arrInput[i] > maximum){
                maximum = arrInput[i];
            }
        }

        return maximum;
    }
}