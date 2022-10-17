package lessonTwo;


public class Calculator {
    //    Sum
    public static int sumInt(int a, int b){
        return a + b;
    }
    public static long sumLong(long a, long b){
        return a + b;
    }
    public static double sumDouble(double a, double b){
        return a + b;
    }
//  Division
    public static double divInt(int a, int b) {
        double c = 0;
        if (b != 0) {
            c = a / b;
        }
        return c;
    }
    public static double divLong(long a, long b){
        double c = 0;
        try{
            c = a / b;
        }
        catch(ArithmeticException e){
            System.out.println("Division by zero!");
        }
        return c;
    }
    public static double divDouble(double a, double b){
        double c = 0;
        if(b != 0) {
            c = a / b;
        }
        return c;
    }
    // Multiplication
    public static int multInt(int a, int b){
        return a * b;
    }
    public static long multLong(long a, long b){
        return a * b;
    }
    public static double multDouble(double a, double b){
        return a * b;
    }
    // Substruction
    public static int subsructInt(int a, int b){
        return a - b;
    }
    public static long subsructLong(long a, long b){
        return a - b;
    }public static double subsructDouble(double a, double b){
        return a - b;
    }
}
