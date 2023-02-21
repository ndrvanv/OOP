package seminar.seminarOne;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

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
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ArrayList<Address> listHuman = new ArrayList<>();
        Human p1 = new Human("Anna", "Ivanova", 23, Gender.female, "qwerty 1");
        Human p2 = new Human("Vladimir", "Ivanov", 24, Gender.male, "qwerty 1");
        Human p3 = new Human("Nikolai", "Petrov", 36, Gender.male, "Wall Street 27");
        Human p4 = new Human("Vera", "Petrova", 33, Gender.female, "Wall Street 27");
        Human p5 = new Human("Vlad", "Samarov", 41, Gender.male, "34 St. River");
        Human p6 = new Human("Vlada", "Samarova", 42, Gender.female, "34 St. River");
        Human p7 = new Human("Lida", "Antonova", 29, Gender.female, "65 Luis Leaf");
        Human p8 = new Human("Viktor", "Antonov", 31, Gender.male, "65 Luis Leaf");
        Collections.addAll(listHuman, p1, p2, p3, p4, p5, Human p8);

        ArrayList<Child>listChild = new ArrayList<>();
        Child ch1 = new Child("Oleg", "Petrov", 2, Gender.male, "Wall Street 27");
        Child ch2 = new Child("Maria", "Petrova", 1, Gender.female, "Wall Street 27");
        Child ch3 = new Child("Jenya", "Ivanova", 1, Gender.female, "qwerty 1");
        Child ch4 = new Child("Hanna", "Samarova", 10, Gender.female, "34 St. River");
        Collections.addAll(listChild, ch1, ch2, ch3, ch4);

        Family family = new Family(listHuman);
        family.addHuman(ch1);
        family.setHumans(listHuman);
        p1.addChild(ch3);
        p2.addChild(ch3);
        p3.addChild(ch1);
        System.out.println(family.printHuman("Ivanova"));

//        Серилизация в файл с помощью класса ObjectOutStream
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("addressPerson.out"));
        objectOutputStream.writeObject(listHuman);
        objectOutputStream.writeObject(listChild);
        objectOutputStream.close();

//        Восстановление из файла с помощью класса ObjectInputStream // TODO
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("addressPerson.out"));
        ArrayList<Human> restoredHuman = (ArrayList<Human>) objectInputStream.readObject();
        ArrayList<Human> restoredChild = (ArrayList<Human>) objectInputStream.readObject();
        objectInputStream.close();

//       Серилизация с помощью класса ByteArrayOutputStream
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream2.writeObject(listHuman);
        objectOutputStream2.writeObject(listChild);
        objectOutputStream2.flush();

//      Восстановление с помощью класса ByteArrayInputStream // TODO
        ObjectInputStream objectInputStream2 = new ObjectInputStream(new ByteArrayInputStream(byteArrayOutputStream.toByteArray()));
        ArrayList<Human> listenHumanRestoredFromByte = (ArrayList<Human>) objectInputStream2.readObject();
        ArrayList<Human> listenChildrenRestoredFromByte = (ArrayList<Human>) objectInputStream2.readObject();
        objectInputStream2.close();

        System.out.println("Before Serialize: " + "\n" + listHuman + "\n" + listChild);
        System.out.println("After Restored From Byte: " + "\n" + listenHumanRestoredFromByte + "\n" + listenChildrenRestoredFromByte);
        System.out.println("After Restorted" + "\n" + restoredHuman + "\n" + restoredChild);
    }
}
