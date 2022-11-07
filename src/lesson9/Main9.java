package lesson9;

import lesson3.Car;

import java.util.*;

public class Main9 {
    public static void main(String[] args) {

        FunWithCollections fwc = new FunWithCollections();

        // Exercise 1.
        System.out.println("===== Exercise 1 =====");
        List<Object> raw = new ArrayList<>();
        raw.add("Yesterday");
        raw.add("Yesterday");
        raw.add("Yesterday");
        raw.add(18490);
        raw.add(18490);
        raw.add(18490);
        raw.add(18490);
        raw.add(3l);
        raw.add(new Car());
        raw.add(new Car());
        raw.add(new Car("Black", 1547));
        raw.add(new Car("Black", 1547));
        raw.add(3l);
        System.out.println("List with duplicates: " + raw);

        System.out.println("Sorted out duplicates: " + fwc.noDuplicates(raw));

         //Exercise 2.
         //Хорошая статья по теме: https://habr.com/ru/post/233797/
        System.out.println("===== Exercise 2 =====");
        List<Integer> randomArrayList = new ArrayList<>();
        List<Integer> randomLinkedList = new LinkedList<>();

        // Fill the lists with random elements.
        fwc.fillList(randomArrayList);
        System.out.println("ArrayList size: " + randomArrayList.size());
        fwc.fillList(randomLinkedList);
        System.out.println("LinkedList size: " + randomLinkedList.size());


        fwc.pickRandomValues(randomArrayList);
        fwc.pickRandomValues(randomLinkedList);

        // Exercise 3.
        System.out.println("===== Exercise 3 =====");
        User user = new User();
        GameScore gs = new GameScore();
        gs.setGamePlayer(user.setUser("Edgar"), 1254);
        gs.setGamePlayer(user.setUser("David"), 5486);
        gs.setGamePlayer(user.setUser("Cindy"), 2435);
        gs.setGamePlayer(user.setUser("Andrew"), 7546);
        gs.setGamePlayer(user.setUser("Bob"), 9568);
        gs.setGamePlayer(user.setUser("Fiona"), 4258);


        gs.printAllPlayers();
        gs.printUserScore(gs.playerGameMap);
    }
}
