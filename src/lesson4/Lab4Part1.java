package lesson4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Lab4Part1 {
    public static void main(String[] args) {
        // Exercise 1.
        System.out.println("==== Exercise 1 ====");
        int i1 = 1;
        while (i1 < 100) { // Как вариант, можно опустить проверку на четность,
            if (i1 % 2 != 0) { // установив шаг i1 += 2;
                System.out.println(i1);
            }
            i1++;
        }
        // Exercise 2.
        System.out.println("==== Exercise 2 ====");
        List<Integer> divBy3 = new ArrayList<>();
        List<Integer> divBy5 = new ArrayList<>();
        List<Integer> divBy3and5 = new ArrayList<>();
        for(int i2 = 1; i2 <= 100; i2++){
            if((i2 % 3 == 0) && (i2 % 5 == 0)){
                divBy3and5.add(i2);
            }
            else if(i2 % 3 == 0){
                divBy3.add(i2);
            }
            else if(i2 % 5 == 0){
                divBy5.add(i2);
            }
        }
        System.out.print("Делится на 3: ");
        for (int d : divBy3
             ) {
            System.out.print(d + " ");
        }
        System.out.print("\n" + "Делится на 5: ");
        for (int d : divBy5
        ) {
            System.out.print(d + " ");
        }
        System.out.print("\n" + "Делится на 3 и 5: ");
        for (int d : divBy3and5
        ) {
            System.out.print(d + " ");
        }

        // Exercise 3.
        System.out.println("==== Exercise 3 ====");
        Scanner scanner = new Scanner(System.in);
        System.out.print("\n" + "Введите первое число: ");
        int first3 = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int second3 = scanner.nextInt();
        System.out.print("Введите третье число, равное сумме первых двух: ");
        int third3 = scanner.nextInt();
//      see method 'sum' after 'main'.
        System.out.println("Результат: " + sum(first3, second3, third3));

        // Exercise 4.
        System.out.println("==== Exercise 4 ====");
        System.out.print("Введите первое число: ");
        int first4 = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int second4 = scanner.nextInt();
        System.out.print("Введите третье число: ");
        int third4 = scanner.nextInt();
        scanner.close();
        // see method 'compare' after 'main'.
        System.out.println("Результат: " + compare(first4, second4, third4));

        // Exercise 5.
        System.out.println("==== Exercise 5 ====");
        int[][] arr = new int[][]{{5, 8, 54, 1}, {3, 15, 34, -3}, {1}, {-3, 3}, {2,5,85}};
        for (int[] a : arr) {
            printArray(a);
            System.out.println(checkArray(a));
        }

        // Exercise 6.
        System.out.println("==== Exercise 6 ====");
        // Using array from exercise 5.
        for(int[] a : arr){
            System.out.println(check1and3InArray(a));
        }

    }
//  Method for exercise 3.
    private static Boolean sum(int a, int b, int c) {
        return ((a + b) == c);
    }
    // Method for exercise 4.
    private static Boolean compare(int a, int b, int c){
        return (a < b && b < c);
    }
    // Methods for exercise 5.
    private static void printArray(int[] args){
        System.out.print("Array = ");
        for (int a : args
             ) {
            System.out.print(a + " ");
        }
        System.out.println();
    }
    private static boolean checkArray(int[] args){
        return ((args[0] == 3) || (args[args.length - 1] == 3));
    }
    // Method for Exercise 6.
    private static boolean check1and3InArray(int[] args){
        //return Arrays.stream(args).anyMatch(i -> (i == 1) || (i == 3));
        for(int i : args){
            if((i == 1) || (i == 3)){
                return true;
            }
        }
        return false;
    }
}
