package lesson6.exercise4;

import java.util.Scanner;

public class Parent {
    int someInt = 0;

    public int getSomeInt() {
        return someInt;
    }

    public void setSomeInt() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter integer value: ");
        this.someInt = scanner.nextInt();
    }

}
