package lesson6.vehicles;

public class Lorry extends Car{

    protected int wheelsNumber;
    protected int maxWeight;

    public void newWheels(int whlsNmbr){
        this.wheelsNumber = whlsNmbr;
        System.out.println("Number of wheels is " + wheelsNumber);
    }

    //Constructor.
    public Lorry(){}
    public Lorry(int wght, String mdl, char clr, float spd, int whlsNmbr, int maxWght) {
        super(wght, mdl, clr, spd);
        this.wheelsNumber = whlsNmbr;
        this.maxWeight = maxWght;
    }


}
