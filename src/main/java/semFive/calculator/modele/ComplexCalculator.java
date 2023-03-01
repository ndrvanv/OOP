package semFive.calculator.modele;

public class ComplexCalculator extends SetDigits implements Model<Complex> {


    @Override
    public Complex sum() {
        Logger.logData("Сумма комплексных чисел" + (x + y) + " " + (a+b));
        return new Complex((x + y),(a+b));
    }

    @Override
    public Complex multy() {
        Logger.logData("Произведение комплексных чисел: " + (x*a  - y*b) + " " + (y* a + b *x));
        return new Complex((x*a  - y*b),(y* a + b *x));
    }

    @Override
    public Complex divide() {
        Logger.logData("частное комплекс чисел: " + (x*a  + y * b) /(y * y + b * b) + " " + " " + (y* a - b *x)/(y*y+b*b));
        return new Complex((x*a  + y*b) /(y*y+b*b), (y* a - b *x)/(y*y+b*b));
    }

    @Override
    public Complex difference() {
        Logger.logData("Разность комплексных чисел: " + (x -a) +" " + (y-b));
        return new Complex((x -a),(y-b));
    }
}
