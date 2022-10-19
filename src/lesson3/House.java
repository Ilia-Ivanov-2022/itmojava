package lesson3;

import java.util.Calendar;

public class House {

    public String houseName;
    public int floorNumber;
    public int yearBuilt;

    // Method setting house values.
    public void setHouse(String name, int floorNum, int yearBlt){
        this.houseName = name;
        this.floorNumber = floorNum;
        this.yearBuilt = yearBlt;
    }
    // Output method.
    public void printHouse(House house){
        if(house != null){
            System.out.println("The house info: " + house.houseName + ", "
                    + house.floorNumber + ", " + house.yearBuilt);
        }
    }
    // House age method.
    public void houseAge(String houseName, int yearBlt){
        int crntYear = Calendar.getInstance().get(Calendar.YEAR);
        if(yearBlt > -8000 && yearBlt < crntYear){
            System.out.println(houseName + " house age: " + (crntYear - yearBlt));
        }
        else System.out.println("Wrong house building year");
    }
}
