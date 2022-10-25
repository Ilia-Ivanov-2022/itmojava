package lesson5;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        String sample = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.";
        String anotherSample = "The brown fox jumped over a lazy dog";
        String substring = "Lorem Ipsum";

        FunWithStrings fws = new FunWithStrings();

        // Exercise 1. The longest word in a text.
        fws.longestWord(sample);
        fws.longestWord(anotherSample);

        // Exercise 2. Check if an entered word is a palindrome.
        fws.palindrome();
        // Using StringBuilder.
        fws.palindromeSB();

        // Exercise 3. Бяка.
        fws.bjaka();

        // Exercise 4. Substring occurrences in a strings.
        fws.stringInAString(substring, sample);

        // Exercise 5.
        fws.invertStringSB(anotherSample);
        fws.invertString(anotherSample);
    }
}
