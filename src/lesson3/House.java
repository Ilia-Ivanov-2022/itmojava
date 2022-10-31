package lesson3;

import java.util.Calendar;

public class House {

    protected String houseName;
    protected int floorNumber;
    protected int yearBuilt;

    // Method setting house values.
    protected void setHouse(String name, int floorNum, int yearBlt){
        this.houseName = name;
        this.floorNumber = floorNum;
        if((yearBlt > -8000) && (yearBlt < Calendar.getInstance().get(Calendar.YEAR))) {
            this.yearBuilt = yearBlt;
        }else{
            while((yearBlt < -8000) && (yearBlt > Calendar.getInstance().get(Calendar.YEAR))){
                System.out.println("Wrong house built year. Please enter a correct one.");
                setHouse(name, floorNum, yearBlt);
            }
        }
    }
    // Output method.
    protected void printHouse(House house){
        if(house != null){
            System.out.println("The house info: " + house.houseName + ", "
                    + house.floorNumber + ", " + house.yearBuilt);
        }
    }
    // House age method.
    void houseAge(String houseName, int yearBlt){
        System.out.println(houseName + " house age: " +
                (Calendar.getInstance().get(Calendar.YEAR) - yearBlt));
    }
}
