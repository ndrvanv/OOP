package semFive.modele;

public class Complex extends SetDigits {
    protected double x;
    protected double y;
    public Complex(double x, double y) {
        this.x = x;
        this.y = y;
        Logger.logData("Комплексное число " + x + " , " + y +  " i создано");
//        x + ia + y + ib = (x + y ) + (a + b) = z + ic
    }

    @Override
    public String toString() {
        return (x + " " + y );
    }
}
