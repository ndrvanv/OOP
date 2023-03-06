package semFive.calculator;

import semFive.calculator.presenter.Presenter;
import semFive.calculator.view.View;
import semFive.calculator.modele.RatioCalculator;

public class Main {
    public static void main(String[] args) {
//        Logger.logData(" Hello world");
//        ComplexCalculator calculator = new ComplexCalculator();
//        System.out.println((calculator.difference()));
        Presenter presenter = new Presenter(new View(), new RatioCalculator());
        presenter.menuCalculator();
    }
}
