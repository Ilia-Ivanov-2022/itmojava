package lesson2.creatures;


public class Creature {
    // Variables
    private String name;
    private Boolean isOrthograde;
    private Boolean hasTail;
    private Boolean isWaterborn;
    private Boolean isAirborn;
    private Boolean isUnderground;
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
    public Creature(String name, Boolean isOrthograde, Boolean isAirborn, Boolean hasTail){
        this.name = name;
        this.isOrthograde = isOrthograde;
        this.isAirborn = isAirborn;
        this.hasTail = hasTail;
    }
    // Properties
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getIsOrthograde() {
        return isOrthograde;
    }

    public void setIsOrthograde(Boolean orthograde) {
        isOrthograde = orthograde;
    }

    public Boolean getHasTail() {
        return hasTail;
    }

    public void setHasTail(Boolean tail) {
        this.hasTail = tail;
    }

    public Boolean getIsAirborn() {
        return isAirborn;
    }

    public void setIsAirborn(Boolean fly) {
        isAirborn = fly;
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
    public void setArmNumber(){
        Integer arms = 0;
        if(isOrthograde) arms = 2;
        this.armNumber = arms;
    }

    public Integer getWingNumber() {
        return wingNumber;
    }
    public void setWingNumber(){
        Integer wings = 0;
        if(isAirborn)
            wings = 2;
        this.wingNumber = wings;
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
                ", isOrthograde=" + isOrthograde +
                ", hasTail=" + hasTail +
                ", isAirborn=" + isAirborn +
                ", legNumber=" + legNumber +
                ", armNumber=" + armNumber +
                ", wingNumber=" + wingNumber +
                ", weight=" + weight +
                ", height=" + height +
                ", color=" + color +
                '}';
    }
}

