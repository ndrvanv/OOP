package seminar.seminarOne;

import java.io.Serializable;
import java.util.ArrayList;

public abstract class Human implements Serializable {
    private String firstName;
    private String lastName;
    private Gender gender;
    private int age;
    private GetInfo getInfo;

    public Human(String firstName, String lastName, int age, Gender gender) {

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

    @Override
    public String toString() {
        return "\n\nHuman{" +
                "\nFirst Name: " + firstName  +
                "\nLast Name: " + lastName  +
                "\nAge: " + age + " years old" +
                "\nChild: " + getInfo.getInfoChild() +
                "\nGender: " + gender +
                '}';
    }

}




