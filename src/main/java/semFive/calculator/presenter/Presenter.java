package semFive.calculator.presenter;

import semFive.calculator.view.View;
import semFive.calculator.modele.ComplexCalculator;
import semFive.calculator.modele.RatioCalculator;

public class Presenter {
    View view;
    RatioCalculator ratioCalc;
    ComplexCalculator complexCalc;

    public Presenter(View view, RatioCalculator calculRatio) {
        this.view = view;
        this.ratioCalc = calculRatio;
    }
    public Presenter(View view, ComplexCalculator comCalc) {
        this.view = view;
        this.complexCalc = comCalc;
    }
    public void menuCalculator() {
        int select = view.getInputInteger("Выберите то что будете считать:" +
                "\n1)\tКомплексные числа" +
                "\n2)\tРациональные число");
        switch (select) {
            case 1:
                calcComplex();
                break;
            case 2:
                calcRatio();
                break;
            default:
                System.out.print("Нет такого варианта...");
        }
    }
    public void calcComplex() {
        complexCalc.setX(view.getInputDouble("Введите первое число: "));
        complexCalc.setA(view.getInputDouble("Введите мнимое первого число: "));
        complexCalc.setY(view.getInputDouble("Введите второе число: "));
        complexCalc.setB(view.getInputDouble("Введите мнимое второго числа: "));
        switch (actionCalc()) {
            case 1:
                view.printComplex( "Сумма чисел ",  complexCalc.sum());
                break;
            case 2:
                view.printComplex("Разность: ", complexCalc.difference());
                break;
            case 3:
                view.printComplex("Произведение:", complexCalc.multy());
                break;
            case 4:
                view.printComplex("Деление: ", complexCalc.divide());
            default:
                System.out.print("Ожидание...");
        }
    }
    public void calcRatio() {
        ratioCalc.setX(view.getInputDouble("Введите первое число: "));
        ratioCalc.setY(view.getInputDouble("Введите второе число: "));
        switch (actionCalc()) {
            case 1:
                view.printRatio("Сумма чисел: ", ratioCalc.sum());
                break;
            case 2:
                view.printRatio("Разность чисел: ", ratioCalc.difference());
                break;
            case 3:
                view.printRatio("Умножение чисел: ", ratioCalc.multy());
                break;
            case 4:
                view.printRatio("Деление чисел: ", ratioCalc.divide());
            default:
                System.out.print("Ожидание...");
        }
    }
    public int actionCalc() {
        int num = view.getInputInteger("Выберите действие:" +
                "\n\t1) Сложение: " +
                "\n\t2) Вычитание: " +
                "\n\t3) Умножение: " +
                "\n\t4) Деление: ");
        return num;
    }
}
