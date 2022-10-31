package lesson7;

public class Main7 {
    public static void main(String[] args) {
        // Airplane.
        Airplane.Wing wingLeft = new Airplane.Wing();
        Airplane.Wing wingRight = new Airplane.Wing();

        wingLeft.setWingWeight();
        wingRight.setWingWeight();

        wingLeft.printWingWeight();
        wingRight.printWingWeight();

    }
}
