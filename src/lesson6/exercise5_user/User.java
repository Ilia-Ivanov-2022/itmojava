package lesson6.exercise5_user;


import java.util.Scanner;

public class User {

    String userName;
    int userAge;

    public User(){}
    public User(int age){
        this.userAge = age;
    }

    public void setUserAge() {
        this.userAge = ageScanner();
    }

    public int getUserAge() {
        return userAge;
    }
    public int ageScanner(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter user age: ");
        return scan.nextInt();
    }
    public String nameScanner(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter user name: ");
        return scan.nextLine();
    }
}
