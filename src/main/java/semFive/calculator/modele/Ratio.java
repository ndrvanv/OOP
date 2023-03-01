package semFive.calculator.modele;

public class Ratio extends SetDigits{
    public Ratio(double a, double b) {
        this.x = a;
        this.y = b;
        Logger.logData("Рациональное число " + x + " , " + y +  " создано");
    }
}
