class PAL7_LimJunYi{

    void determineHighest(){

        //Local initialisations
        String month[] = {"Jan","Feb", "Mac", "Apr", "Mei", "Jun"}, highestMonth = "";
        int monthlySales[] = {30, 28, 35, 25, 33, 18}, highestSales = 0;

        //Compare monthlySales to determine the highestSales
        for(int j = 0; j < monthlySales.length; j++){            
            if(monthlySales[j] > highestSales){
                highestSales = monthlySales[j];
                highestMonth = month[j];
            }
        }

        //Output the result of comparison
        System.out.println("Highest sales is " + highestSales + " in " + highestMonth + ".");
    }

    public static void main(String[] args){

        //Local initialisations
        PAL7_LimJunYi obj1 = new PAL7_LimJunYi();

        //Call self-created method
        obj1.determineHighest();        
    }
}