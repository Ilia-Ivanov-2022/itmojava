package lessonTwo.creatures;


public class Creature {
    // Variables
    private String name;
    private Boolean isBipedal;
    private Boolean isTail;
    private Boolean isFly;
    private Integer legNumber;
    private Integer armNumber;
    private Integer wingNumber;
    private Double weight;
    private Double height;

    private Color color;

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
        this.isTail = tail;
    }

    public Boolean getFly() {
        return isFly;
    }

    public void setFly(Boolean fly) {
        isFly = fly;
    }

    public Integer getLegNumber() {
        return legNumber;
    }

    public void setLegNumber(Integer legNumber) {
        this.legNumber = legNumber;
    }

    public Integer getArmNumber() {
        return  armNumber;
    }
    public void setArmNumber(Integer armNumber){
        this.armNumber = armNumber;
    }

    public Integer getWingNumber() {
        return wingNumber;
    }
    public void setWingNumber(Integer wingNumber){
        this.wingNumber = wingNumber;
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

