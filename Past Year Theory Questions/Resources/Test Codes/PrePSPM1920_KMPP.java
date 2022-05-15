import java.util.Scanner;

class PrePSPM1920_KMPP{}

class KepalaBatasWind{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        double windSpeed = 0.0, windSpeedTotal = 0.0, windSpeedHighest = 0.0, windSpeedLowest = 99999.9, windSpeedAverage = 0.0;

        for(int i = 0; i < 14; i++){

            System.out.print("Enter wind speed for day " + (i + 1));
            windSpeed = sc.nextDouble();

            if(windSpeed > windSpeedHighest){windSpeedHighest = windSpeed;}
            if(windSpeed < windSpeedLowest){windSpeedLowest = windSpeed;}

            windSpeedTotal += windSpeed;
        }

        windSpeedAverage = windSpeedTotal / 14;

        System.out.println("The highest wind speed is " + windSpeedHighest);
        System.out.println("The lowest wind speed is " + windSpeedLowest);
        System.out.println("The difference between highest wind speed and average wind speed is " + (windSpeedHighest - windSpeedAverage));

        sc.close();
    }
}