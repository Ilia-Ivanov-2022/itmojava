package lesson3;

public class Main3 {
    public static void main(String[] args) {

        System.out.println("===== Exercise 2 =====");
        // Exercise 2 - Car.
        Car car1 = new Car();
        car1.name = "Jaguar";
        car1.color = "White";
        car1.weight = 1600;

        Car car2 = new Car();
        car2.name = "Mitsubishi";
        car2.color = "Blue";
        car2.weight = 1200;

        car1.outputCarMethod(car1.name, car1.color, car1.weight);
        car2.printCarClassMethod(car2);

        System.out.println("===== Exercise 3 =====");
        // Exercise 3  - House
        House house1 = new House();
        House house2 = new House();
        // Set house.
        house1.setHouse("MyHouse", 2, 2023);
        house2.setHouse("Another House", 7, 1327);
        // Output.
        house1.printHouse(house1);
        house2.printHouse(house2);
        // House age.
        house1.houseAge(house1.houseName, house1.yearBuilt);
        house2.houseAge(house2.houseName, house2.yearBuilt);

        System.out.println("===== Exercise 4 =====");
        // Exercise 4 - Three trees forest.
        Tree oak = new Tree();
        Tree pine = new Tree("Pine", 35);
        Tree maple = new Tree("Maple", 24, true);
    }
}
