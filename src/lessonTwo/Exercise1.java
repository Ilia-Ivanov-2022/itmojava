package lessonTwo;


public class Exercise1 {
    public static void main(String[] args) {
        int x1 = 59;
        int x2 = 623;
        long y1 = 34576232l;
        long y2 = 35987456l;
        double z1 = 89461654854.67;
        double z2 = 57.82;
        System.out.println(Calculator.sumInt(x1, x2));
        System.out.println(Calculator.multDouble(z1, z2));
        System.out.println(Calculator.subsructLong(y2, y1));

        System.out.println("Division of Longs");
        System.out.println(Calculator.divLong(y1, y2));
        System.out.println("Division of ints");
        System.out.println(Calculator.divInt(x1, x2));


    }
}
