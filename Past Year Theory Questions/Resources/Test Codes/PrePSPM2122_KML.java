class PrePSPM2122_KML{}

class Q4{

    public static void main(String[] args){

        double temp[] = {37.9, 37.8, 39.2, 40.1, 36.9, 37.2, 38.3}, tempMax = 0.0, tempMin = 99.0, tempSum = 0.0, tempAvg = 0.0;
        int belowAvg = 0;

        for(int i = 0; i < temp.length; i++){

            if(temp[i] > tempMax){tempMax = temp[i];}
            if(temp[i] < tempMin){tempMin = temp[i];}

            tempSum += temp[i];
        }

        tempAvg = tempSum / temp.length;

        for(int j = 0; j < temp.length; j++){

            if(temp[j] < tempAvg){belowAvg++;}
        }

        System.out.println("The average temperature is " + tempAvg);
        System.out.println("The maximum temperature is " + tempMax);
        System.out.println("The minimum temperature is " + tempMin);
        System.out.println("There are " + belowAvg + " temperatures that are below average.");
    }
}