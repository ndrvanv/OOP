package seminar.seminarOne;

import java.util.ArrayList;

public class Child extends Human{

    ArrayList<Child> childList;
    private ArrayList<Human> children;
    public Child(String firstName, String lastName, Integer age, Gender gender) {
        super(firstName, lastName, age, gender);
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
