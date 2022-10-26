package lesson5;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FunWithStrings {
    // METHODS FOR ABOVE EXERCISES.
    // Exercise 1. The longest word.
    protected void longestWord(String str){
        String pattern = "([\\.,])";
        str = str.replaceAll(pattern, "");
        String[] strings = str.split(" ");

        int wordLength = 0;
        String lngstWord = null;
        for(String string : strings){
            if(string.length() > wordLength){
                wordLength = string.length();
                lngstWord = string;
            }
        }
        System.out.println("The longest word in the given string is '" + lngstWord + "'.");
    }

    // Exercise 2. Palindrome.
    protected void palindromeSB() {

        String wordToCheck = scan("Enter a word to check for palindrome: ");

        if (wordToCheck.contains(" ")) {
            System.out.println("Enter a single word.");
            palindromeSB();
        }
        StringBuilder sb = new StringBuilder(wordToCheck);
        if (wordToCheck.equalsIgnoreCase(sb.reverse().toString())) {
            System.out.println("The word " + wordToCheck + " is a palindrome.");
        } else {
            System.out.println("The word " + wordToCheck + " is not a palindrome.");
        }
    }

    // Exercise 3. Бяка.
    protected void bjaka(String check, String search, String replace){
        check = check.toLowerCase();
        if(check.contains(search)){
            check = check.replace(search, replace);
        }
        System.out.println(check);
    }

    // Exercise 4. A substring in a string.
    protected void stringInAString(String subString, String string){
        int count = 0;
        int startIndex = 0;
        List<Integer>indecies = new ArrayList<>();
        Pattern pattern = Pattern.compile(subString);
        Matcher match = pattern.matcher(string);
        while(match.find(startIndex)){
            count++;
            indecies.add(match.start());
            startIndex = match.start() + 1;
        }
        System.out.println("Total occurrences of a substring in the given string: " + count);
    }

    // Exercise 5.
    protected void invertStringSB(String string){
        System.out.println(string);
        StringBuilder stringBuilder = new StringBuilder(string);
        System.out.println(stringBuilder.reverse());
    }
    protected void invertString(String string){
        System.out.println(string);
        System.out.print("Inverted string: ");
        char[] inverse = string.toCharArray();
        for(int i = inverse.length - 1; i >= 0; i--){
            System.out.print(inverse[i]);
        }
    }

    // Service methods for all exercises.
    protected String scan(String str){
        Scanner scanner = new Scanner(System.in);
        System.out.print(str);
        return scanner.nextLine();
    }
}
