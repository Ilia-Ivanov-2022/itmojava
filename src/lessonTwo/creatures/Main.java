package lessonTwo.creatures;

public class Main {
    public static void main(String[] args) {
        Creature turtle = new Creature("Turtle", Color.GREEN);
        System.out.println(turtle);

        Creature eagle = new Creature();
        eagle.setName("Eagle");
        eagle.isFly = true;
        eagle.isBipedal = true;
        eagle.armNumber = 3;
        eagle.legNumber = 5;
        eagle.wingNumber = 1;
        eagle.weight = 100500.00;
        eagle.height = 1000.00;
        eagle.color = Color.BLACK_WHITE;
        System.out.println(eagle);
    }
}
