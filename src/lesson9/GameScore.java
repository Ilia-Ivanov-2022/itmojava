package lesson9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class GameScore {

    Map<User, Integer> playerGameMap = new HashMap<>();

    public void setGamePlayer(User user, Integer score) {
        playerGameMap.put(user, score);
        System.out.println("New user " + user.getName() + " with score " + playerGameMap.get(user) + " has been added.");
    }

    public void printUserScore(Map<User, Integer> map){
        String name = stringReader();
        Integer result = null;
        for(Map.Entry<User, Integer> entry: map.entrySet()){
            if(name.equalsIgnoreCase(entry.getKey().getName())){
                result = entry.getValue();
            }
        }
        System.out.print(name + " score is " + result);
    }
    public void printAllPlayers(){
        System.out.println("===== Players Table =====");
        for (Map.Entry<User, Integer> entry : playerGameMap.entrySet()) {
            System.out.println(entry.getKey().getName() + ": " + playerGameMap.get(entry.getKey()));
        }
    }

    // Service methods.
    public String stringReader(){
        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(r);
        System.out.print("Please enter a player name to check his score: ");
        try {
            return reader.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}

