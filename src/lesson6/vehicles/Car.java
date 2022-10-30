package lesson6.vehicles;

public class Car {
    protected int weight;
    protected String model;
    protected char color;
    protected float speed;


    public void outPut () {
        System.out.println("Вес " + model + " составляет " + weight + "кг.");
        System.out.println("Цвет машины - " + color + " и её скорость - " + speed);
    }

    public Car (int w, String m, char c, float s) {
        weight = w;
        model = m;
        color = c;
        speed = s;
    }

    public Car () {}
}
