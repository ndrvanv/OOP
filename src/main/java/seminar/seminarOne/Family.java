package seminar.seminarOne;
import java.io.Serializable;
import java.util.ArrayList;

public class Family implements Serializable {
    ArrayList<Address> humans;
    ArrayList<Family> families;
    public Family(ArrayList<Address> humans) {
        this.humans = humans;
    }

    public ArrayList<Address> getHumans() {
        return humans;
    }
    public void setHumans(ArrayList<Address> humans) {
        this.humans = humans;
    }
    public ArrayList<Address> addHuman(Human human) {
        if (!humans.contains(human)) {
            humans.add(human);
            if (human.getMother() != null) {
                human.getMother().addChild(human);
            }
            if (human.getFather() != null) {
                human.getFather().addChild(human);
            }
        }
        return humans;
    }
    public ArrayList<Human> printHuman(String lastName) {
        for (Human o: humans) {
            if(o.getLastName().equals(lastName))
                return humans;
        }
        return null;
    }
}
