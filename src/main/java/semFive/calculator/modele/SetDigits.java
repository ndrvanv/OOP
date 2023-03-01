package semFive.calculator.modele;

public class SetDigits {
    protected double x;
    protected double y;
    protected double a;
    protected double b;

    public void setX(double x) {
        this.x = x;
        Logger.logData("Число х: " + x );

    }

    public void setA(double a) {
        this.a = a;
        Logger.logData("Мнимая часть x: " + a );
    }

    public void setY(double y) {
        this.y = y;
        Logger.logData("Мнимая часть y: " + y );
    }

    public void setB(double b) {
        this.b = b;
        Logger.logData("Мнимая часть y: " + b );
    }

}
