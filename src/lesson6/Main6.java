package lesson6;

import lesson6.banking.BankEmployee;
import lesson6.banking.Banking;
import lesson6.banking.Client;
import lesson6.exercise4.Child;
import lesson6.exercise5_user.UserExtended;
import lesson6.vehicles.Car;
import lesson6.vehicles.Lorry;

public class Main6 {
    public static void main(String[] args) {
        // Exercise 1 & 2.
        System.out.println("===== Banking =====");
        Client client = new Client("Piter", "Till","Bank of Scotland");
        client.print();
        BankEmployee be = new BankEmployee("Tony", "STARK", "Dukascopy");
        be.openAccount();
        client.openAccount();
        be.closeAccount();
        Banking account = new Client("Alisa", "Freindlikh", "Raiffeisen");
        account.openAccount();

        // Exercise 3. Car.
        System.out.println("===== Car/ Lorry =====");
        Car sedan = new Car(1500, "Volga 3110", 'w', 90);
        sedan.outPut();

        Lorry truck = new Lorry(3000, "Scania", 'y', 100, 4, 12000);
        truck.newWheels(6);
        truck.outPut();

        //Exercise 4.
        System.out.println("===== Parent/ Child =====");
        Child child = new Child();
        child.setSomeInt();
        child.printParent();

        // Exercise 5.
        System.out.println("===== Another Parent/ Child =====");
        UserExtended userExt = new UserExtended();
        userExt.setUserExtended();
        userExt.printUser(userExt.nameScanner());
    }
}
