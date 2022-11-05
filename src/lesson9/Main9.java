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

        //
        fwc.pickRandomValues(randomArrayList);
        //fwc.pickRandomValues(randomLinkedList);

        // Exercise 3.
        System.out.println("===== Exercise 3 =====");
        GameScore gs = new GameScore();
        gs.playerGameScore.put("Marvin", 1254);
        gs.playerGameScore.put("Helene", 3571);
        gs.playerGameScore.put("Irvin", 2576);
        gs.playerGameScore.put("Jessy", 9543);
        gs.playerGameScore.put("Kevin", 7536);


        System.out.println(gs.playerGameScore.toString());
        System.out.println(gs.userScore());
    }
}
