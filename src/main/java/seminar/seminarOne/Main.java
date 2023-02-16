package seminar.seminarOne;
import java.util.ArrayList;
import java.util.Collections;
/*
Реализовать, с учетом ооп подхода, приложение Для проведения исследований с генеалогическим древом.
Идея: описать некоторое количество компонент, например: модель человека компонента хранения связей
и отношений между людьми: родитель, ребёнок - классика, но можно подумать и про отношение, брат,
свекровь, сестра и т. д. компонент для проведения исследований дополнительные компоненты, например
отвечающие за вывод данных в консоль, загрузку и сохранения в файл, получение\построение отдельных
моделей человека Под “проведением исследования” можно понимать получение всех детей выбранного человека.
Описать с ООП стиле, логику взаимодействия объектов реального мира между собой: шкаф-человек.
Какие члены должны быть у каждого из классов (у меня на семинаре студенты пришли к тому, чтобы продумать
взаимодействия жена разрешает открыть дверцу шкафа мужу, после чего эту дверцу можно открыть) Подумать
как описать логику взаимодействия человека и домашнего питомца. Сценарий: “Человек “зовёт” котика “кис-кис”,
котик отзывается. Какое ещё взаимодействие может быть? Продумать какие проблемы могут возникнуть в том, коде,
который они написали. Например в первой задаче (с генеалогическим древом) мы можем знать о двух людях, но не знаем
в каких “отношениях” они были - двоюродные или троюродные, или мы точно знаем как звали прапрабабушку, но совершенно
не знаем прабабушку - как хранить такие связи или что будет если в компоненту обхода передать ссылку на null-дерево.
У задач нет единственного правильного решения
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Human> listHuman = new ArrayList<>();
        Human p1 = new Human("Anna", "Ivanova", 23, Gender.female);
        Human p2 = new Human("Vladimir", "Ivanov", 24, Gender.male);
        Human p3 = new Human("Nikolai", "Petrov", 36, Gender.male);
        Human p4 = new Human("Vera", "Petrova", 33, Gender.female);
        Human p5 = new Human("Vlad", "Samarov", 41, Gender.male);
        Human p6 = new Human("Vlada", "Samarova", 42, Gender.female);
        Human p7 = new Human("Lida", "Antonova", 29, Gender.female);
        Human p8 = new Human("Viktor", "Antonov", 31, Gender.male);
        Collections.addAll(listHuman, p1, p2, p3, p4, p5, p6, p7, p8);
//        System.out.println(listHuman);

        ArrayList<Child>listChild = new ArrayList<>();
        Child ch1 = new Child("Oleg", "Petrov", 2, Gender.male);
        Child ch2 = new Child("Maria", "Petrova", 1, Gender.female);
        Child ch3 = new Child("Jenya", "Ivanova", 1, Gender.female);
        Child ch4 = new Child("Hanna", "Samarova", 10, Gender.female);
        Collections.addAll(listChild, ch1, ch2, ch3, ch4);
//        System.out.println(listChild);

        Family family = new Family(listHuman);
        family.addHuman(ch1);

        family.setHumans(listHuman);
        p1.addChild(ch3);
        p2.addChild(ch3);
        p3.addChild(ch1);
//        p4.getChild(ch1); // Добавление второго ребенка...

        System.out.println(family.printHuman("Ivanova")); //Печать Фамилий
    }
}
