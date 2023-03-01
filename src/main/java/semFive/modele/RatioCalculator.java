package semFive.modele;

public class RatioCalculator extends SetDigits implements Model<Double>{


    @Override
    public Double sum() {
        Logger.logData("Сумма рациональных чисел: "  + (x + y));
        return (x + y);
    }

    @Override
    public Double multy() {
        Logger.logData("Произведение рациональных чисел: " + (x * y));
        return (x * y);
    }

    @Override
    public Double divide() {
        Logger.logData("Частное рациональных чисел: " + (x / y));
        return (x / y);
    }

    @Override
    public Double difference() {
        Logger.logData("Разность рациональных чисел: " + (x - y));
        return (x - y);
    }
}
