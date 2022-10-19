package lesson3;

public class Car {
    // Fields.
    public String name;
    public String color;
    public double weight;

    // Output methods.
    public void outputCarMethod(String name, String color, double weight){
        System.out.println(name + ", " + color+ ", " + weight);
    }
    public void printCarClassMethod(Car car){
        if(car != null){
            System.out.println(car.name + ", " + car.color + ", " + car.weight);
        }
    }

    // Empty ctor.
    public Car(){

    }
    // Ctor with only 'color'.
    public Car(String color){
        this.color = color;
    }
    // Ctor with 'color' and 'weight'.
    public Car(String color, int weight){
        this.color = color;
        this.weight = weight;
    }
}
