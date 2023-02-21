package seminar.seminarOne;

import java.io.Serializable;
import java.util.ArrayList;

public class Human extends Address implements Serializable {
    private String firstName, lastName;
    private Human father, mother;
    private Gender gender;
    private int age;
    ArrayList<Human> children;
    private GetInfo getInfo;




    public Human(String firstName, String lastName, int age, Gender gender, Address address) {
        super(address);
        this(firstName, lastName, age, null, null, gender);
    }
    public Human(String firstName, String lastName, int age, Human father, Human mother, Gender gender, String address) {
        super(address);
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.father = father;
        this.mother = mother;
        this.gender = gender;
        children = new ArrayList<>();
    }


    public boolean addChild(Human ch) {
        if(!children.contains(ch)) {
            children.add(ch);
            return true;
        }
        return false;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public Human getFather() {
        return father;
    }


    public Human getMother() {
        return mother;
    }

    public ArrayList<Human> getChildren () {
        return children;
    }




    @Override
    public String toString() {
        return "\n\nHuman{" +
                "\nFirst Name: " + firstName  +
                "\nLast Name: " + lastName  +
                "\nAge: " + age + " years old" +
                "\nFather: " + getInfo.getInfoFather() +
                "\nMother: " + getInfo.getInfoMother() +
                "\nChild: " + getInfo.getInfoChild() +
                "\nGender: " + gender +
                '}';
    }

}




