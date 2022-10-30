package lesson6.banking;

import java.util.Scanner;

public class BankEmployee extends Person implements Banking{

    protected String bankName;

    // Constructor.
    public BankEmployee(String name, String surName, String bankName) {
        super(name, surName);
        this.bankName = bankName;
    }
    @Override
    public void print(){
        System.out.println("Employee name: " + name + "\n" +
                "Employee surname: " + surName + "\n" +
                "Employee of bank: " + bankName);    }

    @Override
    public void openAccount(){
        System.out.print("Choose '1' for Saving or '2' for Checking Account: ");
        Scanner scanner = new Scanner(System.in);
        int accNum = scanner.nextInt();
        if(accNum == 1){
            System.out.println(SAVING + " opened.");
        } else if (accNum == 2) {
            System.out.println(CHECKING + " opened.");
        }else {
            System.out.println("Wrong number. See you soon.");
        }
    }
    @Override
    public void closeAccount(){
        System.out.print("You are closing your account. " +
                "Choose '1' for Saving or '2' for Checking Account: ");
        Scanner scanner = new Scanner(System.in);
        int accNum = scanner.nextInt();
        if(accNum == 1) {
            System.out.println("Your Saving account is closed. " +
                    "The balance is withdrawn.");
        }else if (accNum == 2) {
            System.out.println("Your Checking account is closed.");
        }else System.out.println("Wrong number. See you soon.");
    }

    @Override
    public void deposit() {
        Client client = new Client(name, surName);
        client.deposit();
    }

    @Override
    public void withdraw() {
        Client client = new Client(name, surName);
        client.withdraw();
    }
}
