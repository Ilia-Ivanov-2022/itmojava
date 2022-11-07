package lesson9;

class User {
    private String name;

    public User(){}
    public User(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User setUser(String name){
        return new User(name);
    }
}
