package lesson9;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class FunWithCollections {

    // Exercise 1.
    public HashSet<Object> noDuplicates(List<Object> rawList){
        return new HashSet<>(rawList);       // TreeSet - ClassCastException
    }

    // Exercise 2.
    // Add 1M random elements to a list.
    public List<Integer> fillList(List<Integer> list){
        for (int i = 0; i < 1000000; i++) {
            list.add(ThreadLocalRandom.current().nextInt(-10000, 10000));
        }
        return list;
    }
    // Measure time of picking 100K random elements out of a 1M list.
    public void pickRandomValues(List<Integer> list) {
        List<Integer> pickedRandomValues = null;
        
        System.out.println("Hit '1' if you wish to test ArrayList or '2' for LinkedList");
        if(scan() == 1) {pickedRandomValues = new ArrayList<>();}
        else if (scan() == 2) {pickedRandomValues = new LinkedList<>();}
        else System.out.println("Wrong number. Try again.");

        Date start = new Date();
        for (int i = 0; i < 100000; i++) {
            int randomIndex = ThreadLocalRandom.current().nextInt(0, list.size());
            int randomElement = list.get(randomIndex);
            pickedRandomValues.add(randomElement);
        }

        if(pickedRandomValues != null){
            Date finish = new Date();
            System.out.println("List size: " + pickedRandomValues.size() + "\n" +
                    "Type: " + pickedRandomValues.getClass() + "\n" +
                    "Elapsed time: " + (finish.getTime() - start.getTime()) + " ms.");
        }

    }


    // Service methods.
    public int scan(){
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }
}
