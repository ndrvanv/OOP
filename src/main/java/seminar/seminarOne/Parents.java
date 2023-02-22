package seminar.seminarOne;

import java.util.ArrayList;

public class Parents extends Human {

    ArrayList<Parents> parents;
    private String father;
    private String mother;
    private ArrayList<Children> children;


    public Parents(String firstName, String lastName, int age, Gender gender) {
        super(firstName, lastName, age, gender);
    }

    public Parents(String firstName, String lastName, int age, Gender gender, String father, String mother) {
        super(firstName, lastName, age, gender);
        this.father = father;
        this.mother = mother;
        children = new ArrayList<>();
    }

    public boolean addChild(Children ch) {
        if(!children.contains(ch)) {
            children.add(ch);
            return true;
        }
        return false;
    }

    public ArrayList<Parents> getParents() {
        return parents;
    }

    public String getFather() {
        return father;
    }

    public String getMother() {
        return mother;
    }
}
