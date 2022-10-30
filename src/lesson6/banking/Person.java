package lesson6.banking;

abstract class Person {
    // Fields
    protected String name;
    protected String surName;
    protected int accountBalance;

    // Abstract method.
    abstract void print ();

    // Constructor.
    protected Person(String name, String surName) {
        this.name = name;
        this.surName = surName;
    }

    // Get methods.
    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    // Set methods.
    public void setName(String name){
        this.name = name;
    }
    public void setSurNameName(String surname){
        this.surName = surname;
    }
}
