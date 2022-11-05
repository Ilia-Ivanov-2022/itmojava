package lesson9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class GameScore {

    Map<String, Integer> playerGameScore = new HashMap<>();

    public GameScore(){}

    public GameScore(Map<String, Integer> gameScore) {
        this.playerGameScore = gameScore;
    }

    public Map<String, Integer> getGameScore() {
        return playerGameScore;
    }

    public void setGameScore(Map<String, Integer> gameScore) {
        this.playerGameScore = gameScore;
    }


    public void setGameScore(String name, Integer score) {
        User newUser = new User(name);
        newUser.setName(name);
        playerGameScore.put(name, score);
        System.out.println(playerGameScore.toString());
    }

    public String userScore(){
        String name = stringReader();
        if(!playerGameScore.containsKey(name)){
            System.out.println("Player with this name don't exist in the records. Try again.");
        }
        return (name + " score is " + playerGameScore.get(name));
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

