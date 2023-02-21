package seminar.seminarOne;

import java.io.Serializable;
import java.util.ArrayList;

public class Child extends Human implements Serializable {

    ArrayList<Child> childList;
    private ArrayList<Human> children;
    public Child(String firstName, String lastName, Integer age, Gender gender, Address address) {
        super(firstName, lastName, age, gender, address);
    }

    public Child(String firstName, String lastName, int age, Gender gender, Address address, ArrayList<Child> childList, ArrayList<Human> children) {
        super(firstName, lastName, age, gender, address);
        this.childList = childList;
        this.children = children;
    }

    public Child(String firstName, String lastName, int age, Human father, Human mother, Gender gender, String address, ArrayList<Child> childList, ArrayList<Human> children) {
        super(firstName, lastName, age, father, mother, gender, address);
        this.childList = childList;
        this.children = children;
    }

    public void getChild(ArrayList<Child> childList, Child NewChild) {
        this.childList = childList;
        children.add(NewChild);
    }


    @Override
    public String toString() {
        return super.toString();
    }
}
