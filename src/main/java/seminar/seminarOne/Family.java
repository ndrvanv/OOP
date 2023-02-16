package seminar.seminarOne;
import java.util.ArrayList;
import java.util.Objects;

public class Family {
    ArrayList<Human> humans;
    ArrayList<Family> families;
    public Family(ArrayList<Human> humans) {
        this.humans = humans;
    }

    public ArrayList<Human> getHumans() {
        return humans;
    }
    public void setHumans(ArrayList<Human> humans) {
        this.humans = humans;
    }
    public ArrayList<Human> addHuman(Human human) {
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
