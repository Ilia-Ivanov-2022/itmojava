package lesson3;

public class Tree {
    public String treeName;
    public int treeAge;
    public Boolean isAlive;

    // Ctor for Name and Age.
    public Tree(String trName, int trAge){
        this.treeName = trName;
        this.treeAge = trAge;
        System.out.println("Tree: " + treeName + ", " + treeAge);
    }
    // Ctor for all values.
    public Tree(String trName, int trAge, Boolean isAlv){
        this.treeName = trName;
        this.treeAge = trAge;
        this.isAlive = isAlv;
        System.out.println("Tree: " + treeName + ", " + treeAge + ", alive: " + isAlive);
    }
    // Ctor empty.
    public Tree(){
        System.out.println("Пустой конструктор без параметра сработал.");
    }
}
