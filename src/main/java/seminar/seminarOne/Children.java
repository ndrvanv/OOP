package seminar.seminarOne;

import java.io.Serializable;
import java.util.ArrayList;

public class Children extends Human implements Serializable {
    ArrayList<Children> childList;
    ArrayList<Human> children;
    public Children(String firstName, String lastName, Integer age, Gender gender) {
        super(firstName, lastName, age, gender);
    }
    public Children(String firstName, String lastName, int age, Gender gender, ArrayList<Children> childList, ArrayList<Human> children) {
        super(firstName, lastName, age, gender);
        this.childList = childList;
        this.children = children;
    }
    public void getChild(ArrayList<Children> childList, Children NewChild) {
        this.childList = childList;
        children.add(NewChild);
    }
    public ArrayList<Human> getChildren () {
        return children;
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
