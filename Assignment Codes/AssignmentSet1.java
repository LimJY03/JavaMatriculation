/*
 * Everyday, 5 weather stations have recorded temperatures expressed in degree Fahrenheit (°F).
 * Write a program that will accept each weather station ID, station name, Fahrenheit temperature
 * in a day, convert it to degree Celsius (°C) and display all the converted temperatures with
 * station name to the screen.
 * Calculate the average temperature, and print a temperature report of minimum and maximum
 * temperature in degree Celsius (°C) with their index location respectively. In addition, the
 * program also provides access to temperature based on the station ID. Test the system's ability
 * to receive and display records based on station ID. If a record is found, relevant information
 * will be displayed together with index location or no record will be found otherwise. After all
 * temperatures have been processed, the words ‘All temperatures processed’ are to be
 * displayed on the screen.
 */

// Import Java libraries to be used
import java.util.Scanner;

class AssignmentSet1{

    // Global declarations and initialisations for global usage in all methods
    static Scanner sc = new Scanner(System.in);
    static AssignmentSet1 program = new AssignmentSet1();

    // Main method: program executes here
    public static void main(String[] args){

        // Local declarations and initialisations for local usage
        final int datasetCount = 5;        
              
        int stationID[] = new int[datasetCount], stationIDFewMax[] = new int[datasetCount], stationIDFewMin[] = new int[datasetCount];
        String stationName[] = new String[datasetCount], stationNameFewMax[] = new String[datasetCount], stationNameFewMin[] = new String[datasetCount];
        double temperatureCelcius[] = new double[datasetCount];

        int stationIDMax = 0, stationIDMin = 0, maxCount = 0, minCount = 0;
        String stationNameMax = "", stationNameMin = "";
        double temperatureAvg = 0.0, temperatureMax = 0, temperatureMin = 0;
        boolean maxFew = false, minFew = false;

        // Get data input into arrays
        Object stationDetails[] = program.getStationDetails(stationID, stationName, temperatureCelcius);

            // Assign details from stationDetails[] into arrays for better readability
            stationID = (int[])stationDetails[0];
            stationName = (String[])stationDetails[1];
            temperatureCelcius = (double[])stationDetails[2];

        // Display converted temperatures with station name
        program.div_line();
        program.showStationDetailsList(stationID, stationName, temperatureCelcius);        

        // Determine average temperature
        temperatureAvg = program.getAverageTemperature(temperatureCelcius);
        
        // Get maximum and minimum temperature full details
        Object maximumTemperatureDataset[] = program.getMaximumTemperatureDetails(stationID, stationName, temperatureCelcius);
        Object minimumTemperatureDataset[] = program.getMinimumTemperatureDetails(stationID, stationName, temperatureCelcius);

            // Assign details from TemperatureDataset[] to variables for better readability
            stationIDMax = (int)maximumTemperatureDataset[0];
            stationNameMax = maximumTemperatureDataset[1].toString();
            temperatureMax = (double)maximumTemperatureDataset[2];

            stationIDMin = (int)minimumTemperatureDataset[0];
            stationNameMin = minimumTemperatureDataset[1].toString();
            temperatureMin = (double)minimumTemperatureDataset[2];
        
        // Check if there are multiple stations with same max / min temperatures
        Object maximumTemperatureDatasetFew[] = program.checkMultipleMaximumDetails(temperatureMax, temperatureCelcius, stationID, stationName);
        Object minimumTemperatureDatasetFew[] = program.checkMultipleMinimumDetails(temperatureMin, temperatureCelcius, stationID, stationName);

            // Assign details from TemperatureDatasetFew[] to variables for better readability
            maxFew = (boolean)maximumTemperatureDatasetFew[0];
            maxCount = (int)maximumTemperatureDatasetFew[1];
            stationIDFewMax = (int[])maximumTemperatureDatasetFew[2];
            stationNameFewMax = (String[])maximumTemperatureDatasetFew[3];
        
            minFew = (boolean)minimumTemperatureDatasetFew[0];
            minCount = (int)minimumTemperatureDatasetFew[1];
            stationIDFewMin = (int[])minimumTemperatureDatasetFew[2];
            stationNameFewMin = (String[])minimumTemperatureDatasetFew[3];
        
        // Display average temperature
        program.showAvg(datasetCount, temperatureAvg);
        
        // Display max temperature and min temperature station details depending on if there are multiple stations having max and/or min temperatures
        program.showMax(maxFew, maxCount, stationNameFewMax, stationIDFewMax, temperatureMax, stationNameMax, stationIDMax);
        program.showMin(minFew, minCount, stationNameFewMin, stationIDFewMin, temperatureMin, stationNameMin, stationIDMin);        

        // User search for temperature of specific station
        program.showSearch(stationID, stationName, temperatureCelcius);

        // Display program footer
        program.showFooter();

        // Prevent resource leak for scanner
        sc.close();
    }

    // Input and store details for station ID
    int[] enterStationID(int i, int stationID[]){

        System.out.print("\n[Enter station ID         ] -> ");
        stationID[i] = sc.nextInt();

        return stationID;
    }

    // Input and store details for station name
    String[] enterStationName(int i, String stationName[]){

        sc.nextLine(); /*clear buffer, that's because the sc.nextInt() method does not read the newline 
        character in your input created by hitting "Enter," and so the call to sc.nextLine returns 
        after reading that newline.*/

        System.out.print("[Enter station name       ] -> ");
        stationName[i] = sc.nextLine();

        return stationName;
    }

    // Input and store details for station temperature
    double[] enterStationTemperature(int i, double temperatureCelcius[]){

        double temperatureFahrenheit = 0.0;
        
        System.out.print("[Enter station temperature] -> ");
        temperatureFahrenheit = sc.nextDouble();

        temperatureCelcius[i] = program.convertFahrenheitCelcius(temperatureFahrenheit);

        return temperatureCelcius;
    }

    Object[] getStationDetails(int stationID[], String stationName[], double temperatureCelcius[]){

        Object stationDetails[] = new Object[3];

        for(int i = 0; i < stationID.length; i++){

            stationID = program.enterStationID(i, stationID);
            stationName = program.enterStationName(i, stationName);
            temperatureCelcius = program.enterStationTemperature(i, temperatureCelcius);
        }

        stationDetails[0] = stationID;
        stationDetails[1] = stationName;
        stationDetails[2] = temperatureCelcius;

        return stationDetails;
    }

    // Unit Conversion from Fahrenheit to Celcius
    double convertFahrenheitCelcius(double temperatureFahrenheit){
        return ((temperatureFahrenheit - 32) * 5) / 9;
    }

    // Div for display separator
    void div_line(){
        System.out.println("\n--------------------------------------------------------------------------\n");
    }

    // Display station details
    void showStationDetailsList(int stationID[], String stationName[], double temperatureCelcius[]){

        for(int i = 0; i < stationID.length; i++){

            System.out.println("The temperature at " + stationName[i] + " (Station ID: " + stationID[i] + ") is " + temperatureCelcius[i] + "°C.");
        }
    }

    // Process and determine average temperature
    double getAverageTemperature(double temperatureCelcius[]){

        double temperatureSum = 0.0;

        for(int i = 0; i < temperatureCelcius.length; i++){

            temperatureSum += temperatureCelcius[i];
        }

        return temperatureSum / temperatureCelcius.length;
    }

    // Process and determine maximum temperature
    Object[] getMaximumTemperatureDetails(int stationID[], String stationName[], double temperatureCelcius[]){

        Object maximumTemperatureDataset[] = new Object[3];
        double temperatureMax = -9999;

        for(int i = 0; i < temperatureCelcius.length; i++){

            if(temperatureCelcius[i] > temperatureMax){
                
                temperatureMax = temperatureCelcius[i];
                
                maximumTemperatureDataset[0] = stationID[i];
                maximumTemperatureDataset[1] = stationName[i];
                maximumTemperatureDataset[2] = temperatureCelcius[i];
                
            }
        }

        return maximumTemperatureDataset;
    }

    // Process and determine minimum temperature
    Object[] getMinimumTemperatureDetails(int stationID[], String stationName[], double temperatureCelcius[]){

        Object minimumTemperatureDataset[] = new Object[3];
        double temperatureMin = 9999;

        for(int i = 0; i < temperatureCelcius.length; i++){

            if(temperatureCelcius[i] < temperatureMin){
                
                temperatureMin = temperatureCelcius[i];
                
                minimumTemperatureDataset[0] = stationID[i];
                minimumTemperatureDataset[1] = stationName[i];
                minimumTemperatureDataset[2] = temperatureCelcius[i];
                
            }
        }

        return minimumTemperatureDataset;
    }

    // Check if there are multiple stations with maximum temperature
    Object[] checkMultipleMaximumDetails(double temperatureMax, double[] temperatureCelcius, int[] stationID, String[] stationName){

        Object maximumTemperatureDatasetFew[] = new Object[4];
        int stationIDFewMax[] = new int[5], maxCount = 0;
        String stationNameFewMax[] = new String[5];
        boolean maxFew = false;

        for(int i = 0; i < stationID.length; i++){
            
            if(temperatureCelcius[i] == temperatureMax){

                stationIDFewMax[maxCount] = stationID[i];
                stationNameFewMax[maxCount] = stationName[i];

                maxCount++;
            }
        }

        if(maxCount > 1){
            maxFew = true;
        }

        maximumTemperatureDatasetFew[0] = maxFew;
        maximumTemperatureDatasetFew[1] = maxCount;
        maximumTemperatureDatasetFew[2] = stationIDFewMax;
        maximumTemperatureDatasetFew[3] = stationNameFewMax;

        return maximumTemperatureDatasetFew;
    }

    // Check if there are multiple stations with minimum temperature
    Object[] checkMultipleMinimumDetails(double temperatureMin, double[] temperatureCelcius, int[] stationID, String[] stationName){

        Object minimumTemperatureDatasetFew[] = new Object[4];
        int stationIDFewMin[] = new int[5], minCount = 0;
        String stationNameFewMin[] = new String[5];
        boolean minFew = false;

        for(int i = 0; i < stationID.length; i++){
            
            if(temperatureCelcius[i] == temperatureMin){

                stationIDFewMin[minCount] = stationID[i];
                stationNameFewMin[minCount] = stationName[i];

                minCount++;
            }
        }

        if(minCount > 1){
            minFew = true;
        }

        minimumTemperatureDatasetFew[0] = minFew;
        minimumTemperatureDatasetFew[1] = minCount;
        minimumTemperatureDatasetFew[2] = stationIDFewMin;
        minimumTemperatureDatasetFew[3] = stationNameFewMin;

        return minimumTemperatureDatasetFew;
    }

    // Display average temperature of all stations
    void showAvg(int datasetCount, double temperatureAvg){

        System.out.println("\n----------------------------[Processed Report]----------------------------\n");
        System.out.println("The average temperature for " + datasetCount + " stations is " + temperatureAvg + ".");
    }

    // Process and determine details for station(s) with maximum temperature
    void showMax(boolean maxFew, int maxCount, String stationNameFewMax[], int stationIDFewMax[], double temperatureMax, String stationNameMax, int stationIDMax){

        int counterShowMax;

        if(maxFew){

            // Format output to obey grammar
            for(counterShowMax = 0; counterShowMax < (maxCount - 1); counterShowMax++){

                System.out.print(stationNameFewMax[counterShowMax] + " (Station ID: " + stationIDFewMax[counterShowMax] + ")");

                if(counterShowMax == (maxCount - 2)){
                    System.out.print(" and ");
                }
                else{
                    System.out.print(", ");
                }
            }
            
            System.out.println(stationNameFewMax[counterShowMax] + " (Station ID: " + stationIDFewMax[counterShowMax] + ") has the maximum temperature of " + temperatureMax + "°C.");
        }
        else{
            System.out.println(stationNameMax + " (Station ID: " + stationIDMax + ") has the maximum temperature of " + temperatureMax + "°C.");
        }
    }

    // Process and determine details for station(s) with minimum temperature
    void showMin(boolean minFew, int minCount, String stationNameFewMin[], int stationIDFewMin[], double temperatureMin, String stationNameMin, int stationIDMin){

        int counterShowMin;

        if(minFew){

            // Format output to obey grammar
            for(counterShowMin = 0; counterShowMin < (minCount - 1); counterShowMin++){

                System.out.print(stationNameFewMin[counterShowMin] + " (Station ID: " + stationIDFewMin[counterShowMin] + ")");

                if(counterShowMin == (minCount - 2)){
                    System.out.print(" and ");
                }
                else{
                    System.out.print(", ");
                }
            }
            
            System.out.println(stationNameFewMin[counterShowMin] + " (Station ID: " + stationIDFewMin[counterShowMin] + ") has the minimum temperature of " + temperatureMin + "°C.");
        }
        else{
            System.out.println(stationNameMin + " (Station ID: " + stationIDMin + ") has the minimum temperature of " + temperatureMin + "°C.");
        }
    }

    // Determine if search is wanted and display details for station searched
    void showSearch(int stationID[], String stationName[], double temperatureCelcius[]){

        int stationIDSearch = 0;
        char userSearchChoice = 'z';
        
        program.div_line();        
        System.out.print("[Choose if you want to search details (Y/N)] -> ");
        userSearchChoice = sc.next().charAt(0);

        if(userSearchChoice == 'Y' || userSearchChoice == 'y'){

            System.out.print("\n[Enter station ID to search for its details] -> ");
            stationIDSearch = sc.nextInt();

            for(int i = 0; i < stationID.length + 1; i++){

                if(i == stationID.length){ // if the linear search is beyond the array size, this section will run

                    System.out.println("\nNo record is found.");
                }            
                else if(stationID[i] == stationIDSearch){

                    System.out.println("\nThe temperature at " + stationName[i] + " (Station ID: " + stationID[i] + ") is " + temperatureCelcius[i] + "°C.");

                    break; // if successfully obtained search details, break from loop
                }
            }
        }        
    }

    // Format and display required footer
    void showFooter(){

        program.div_line();
        System.out.println("All temperature processed.");
        program.div_line();
    }
}