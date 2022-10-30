package lesson6.exercise4;

public class Child extends Parent{

    public void printParent(){
        System.out.println("Parent class integer: " + super.getSomeInt());
    }
}
