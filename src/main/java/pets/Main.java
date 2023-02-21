package pets;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Dog d1 = new Dog("Loli", true);
        Cat c1 = new Cat("Nya", false);
        Hamster p1 = new Hamster("Manya", false);
        ArrayList<Animal> animals = new ArrayList<>();
        Collections.addAll(animals, d1, c1, p1);
        voiceAnimal(animals);
    }
    static void voiceAnimal(ArrayList<Animal> listAnimal) {
        for (Animal animal: listAnimal) {
            animal.feed();
            animal.voice();
            animal.action();

        }
    }
}
