package lesson7;

import java.util.Scanner;

public class Airplane {

    protected static class Wing{
        int wingWeight;
        public Wing(){}
        public Wing(int wngWght){
            this.wingWeight = wngWght;
        }

        public int getWingWeight(){
            return wingWeight;
        }

        public void setWingWeight(){
            this.wingWeight = scanner();
        }

        public void printWingWeight(){
            System.out.println("The aiplane wing weight is " + wingWeight);
        }
    }

    public static int scanner(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter wing weight: ");
        return scanner.nextInt();
    }

}
