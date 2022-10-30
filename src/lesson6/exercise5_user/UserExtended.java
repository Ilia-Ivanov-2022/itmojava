package lesson6.exercise5_user;

public class UserExtended extends User {


    public UserExtended(){}

    public UserExtended(int age, String name){
        super(age);
        this.userName = name;
    }

    public void setUserExtended(){
        super.setUserAge();
        this.userName = nameScanner();
    }
    public String getUserName(){
        return userName;
    }

    public void printUser(String name){
        System.out.println("User name: " + getUserName());
        System.out.println("User age: " + getUserAge());
    }

}
