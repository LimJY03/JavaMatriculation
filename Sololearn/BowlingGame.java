import java.util.*;

class BowlingGame{}

class Bowling{

    HashMap<String, Integer> players;

    Bowling() {
        players = new HashMap<String, Integer>();
    }

    public void addPlayer(String name, int p) {
        players.put(name, p);
    }

    //your code goes here
    public void getWinner(){

        int max = 0;
        String max_name = "";

        for(String name: players.keySet()){

            if(players.get(name) > max){
                max = players.get(name);
                max_name = name;
            }
        }

        System.out.println(max_name);
    }    
}

class Program {

    public static void main(String[] args){

        Bowling game = new Bowling();
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 3; i++) {

            String input = sc.nextLine();
            String[] values = input.split(" ");
            String name = values[0];
            int points = Integer.parseInt(values[1]);

            game.addPlayer(name, points);
        }

        game.getWinner();

        sc.clsoe();
    }
}