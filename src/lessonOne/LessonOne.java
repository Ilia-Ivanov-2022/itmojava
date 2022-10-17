package lessonOne;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class LessonOne {
    public static void main(String[] args) throws IOException {
        // Exercise 1.
        System.out.println("Я ");
        System.out.println("хорошо");
        System.out.println("знаю");
        System.out.println("Java.");

        // Exercise 2.
        System.out.println(( 46 + 10 ) * ( 10 / 3.0 ));
        System.out.println(( 29 ) * ( 4 ) * (- 15 ));

        // Exercise 3.
        int number = 10500;
        double result3 = (number/10d)/10;
        System.out.println(result3);

        // Exercise 4.
        float x1 = 3.6f;
        float x2 = 4.1f;
        float x3 = 5.9f;

        float result4 = x1 * x2 * x3;
        System.out.println(result4);

        // Exercise 5.
        Scanner scanner5 = new Scanner(System.in);

        // Input.
        System.out.print("Please, enter a number: ");
        Integer int1 = scanner5.nextInt();
        System.out.print("Please, enter another number: ");
        Integer int2 = scanner5.nextInt();
        System.out.print("Please, enter last number: ");
        Integer int3 = scanner5.nextInt();
        scanner5.close();
        // Output.
        System.out.println(int1);
        System.out.println(int2);
        System.out.println(int3);

//        Exercise 6.
//        Scanner
        Scanner scanner6 = new Scanner(System.in);
        System.out.println("Введите целочисленное число:");
        int b = scanner6.nextInt();
        if (b % 2 != 0) {
            System.out.println("Нечетное");
        } else if(b > 100) {
            System.out.println("Выход за пределы диапазона");
        }else System.out.println("Четное");

//        Buffered Reader
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter an integer:");
        String br = reader.readLine();

        if (Integer.parseInt(br) % 2 != 0) {
            System.out.println("Odd");
        } else if(Integer.parseInt(br) > 100) {
            System.out.println("Out of range");
        }else System.out.println("Even");
    }
}
