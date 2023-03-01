package semFive.calculator.view;

import semFive.modele.Complex;

import java.util.Scanner;

public class View {
    public Double getInputDouble(String str) {
        Scanner scn = new Scanner(System.in);
        double doubInp;
        while (true) {
            System.out.println(str);
            try {
                doubInp = Double.parseDouble(scn.next());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Введите рациональное число!");
            }
        }
        return doubInp;
    }
    public Integer getInputInteger(String str) {
        Scanner scn = new Scanner(System.in);
        int intInp;
        while (true) {
            System.out.println(str);
            try {
                intInp = Integer.parseInt(scn.next());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Введите целое число!");
            }
        }
        return intInp;
    }
    public void printRatio(String str, Double data) {
        System.out.println(str + data);
    }
    public void printComplex(String str, Complex data) {
        System.out.println(str + data);
    }
}
