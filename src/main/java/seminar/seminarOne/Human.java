package seminar.seminarOne;

import java.util.ArrayList;

public class Human {
    private String firstName, lastName;
    private Human father, mother;
    private Gender gender;
    private int age;
    ArrayList<Human> children;

    public Human(String firstName, String lastName, int age, Gender gender) {
        this(firstName, lastName, age, null, null, gender);
    }
    public Human(String firstName, String lastName, int age, Human father, Human mother, Gender gender) {
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

    public Integer getAge() {
        return age;
    }

    public void setAge() {
        this.age = age;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public ArrayList<Human> getChildren() {
        return children;
    }

    public void setChildren(ArrayList<Human> children) {
        this.children = children;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getInfoMother() {
        if(mother != null) {
            return mother.firstName;
        }
        return "no name";
    }
    public String getInfoFather() {
        if(father != null) {
            return father.firstName;
        }
        return "no name";
    }
    public String getInfoChild() {
        StringBuilder str = new StringBuilder();
        if(children.size() != 0) {
            str.append(children.get(0).getFirstName());
            for (int i = 1; i < children.size(); i++) {
                str.append(",");
                str.append(children.get(i).getFirstName());
            }
        }
        else {
            str.append("no child");
        }
        return str.toString();
    }

    @Override
    public String toString() {
        return "\n\nHuman{" +
                "\nFirst Name: " + firstName  +
                "\nLast Name: " + lastName  +
                "\nAge: " + age + " years old" +
                "\nFather: " + getInfoFather() +
                "\nMother: " + getInfoMother() +
                "\nChild: " + getInfoChild() +
                "\nGender: " + gender +
                '}';
    }
}




