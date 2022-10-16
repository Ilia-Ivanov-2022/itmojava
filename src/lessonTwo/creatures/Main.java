package lessonTwo.creatures;

public class Main {
    public static void main(String[] args) {
        Creature turtle = new Creature("Turtle", Color.GREEN);
        System.out.println(turtle);

        Creature eagle = new Creature();
        eagle.setName("Eagle");
        eagle.setFly(true);
        eagle.setBipedal(true);
        eagle.setArmNumber(3);
        eagle.setLegNumber(5);
        eagle.setWingNumber(7);
        eagle.setWeight(100500.00);
        eagle.setHeight(1000.00);
        eagle.setColor(Color.BLACK_WHITE);
        System.out.println(eagle);
    }
}
