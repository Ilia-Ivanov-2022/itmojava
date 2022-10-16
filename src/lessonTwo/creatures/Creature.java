package lessonTwo.creatures;


public class Creature {
    // Variables
    private String name;
    public Boolean isBipedal;
    public Boolean isTail;
    public Boolean isFly;
    public Integer legNumber;
    public Integer armNumber;
    public Integer wingNumber;
    public Double weight;
    public Double height;

    public Color color;

    // Constructors
    public Creature(){
    }
    public Creature(String name, Color color){
        this.name = name;
        this.color = color;
    }
    public Creature(String name, Boolean isBipedal, Boolean isFly, Boolean isTail){
        this.name = name;
        this.isBipedal = isBipedal;
        this.isFly = isFly;
        this.isTail = isTail;
    }
    // Properties
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getBipedal() {
        return isBipedal;
    }

    public void setBipedal(Boolean bipedal) {
        isBipedal = bipedal;
    }

    public Boolean getTail() {
        return isTail;
    }

    public void setTail(Boolean tail) {
        isTail = tail;
    }

    public Boolean getFly() {
        return isFly;
    }

    public void setFly(Boolean fly) {
        if(!isBipedal) {
            isFly = null;
        } else isFly = fly;
    }

    public Integer getLegNumber() {
        if(isBipedal)
            return 4;
        else return 2;
    }

    public Integer getArmNumber() {
        if((isBipedal == true)|| ((isBipedal == true) && (isFly== true)))
            return 0;
        else return 2;
    }

    public Integer getWingNumber() {
        if(!isFly)
            return null;
        else return 2;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Creature{" +
                "name='" + name + '\'' +
                ", isBipedal=" + isBipedal +
                ", isTail=" + isTail +
                ", isFly=" + isFly +
                ", legNumber=" + legNumber +
                ", armNumber=" + armNumber +
                ", wingNumber=" + wingNumber +
                ", weight=" + weight +
                ", height=" + height +
                ", color=" + color +
                '}';
    }
}

