package seminar.seminarOne;
import java.io.Serializable;
import java.util.ArrayList;

public class Family implements Serializable {
    private Children children;
    private Parents mother;
    private Parents father;
    ArrayList<Human> humans;
    ArrayList<Parents> families;
    public Family(ArrayList<Human> parents) {
        this.humans = parents;
    }
    public ArrayList<Human> getHumans() {
        return humans;
    }
    public void setHumans(ArrayList<Human> families) {
        this.humans = families;
    }
    public ArrayList<Parents> addHuman(ArrayList<Children> ch) {
        for(Human child  : families)
        if (!families.contains(child)) {
//            families.add(ch);
            if (mother.getMother() != null) {
                mother.addChild((Children) child);
            }
            if (father.getFather() != null) {
                father.addChild((Children) child);
            }
        }
        return families;
    }
    public ArrayList<Human> printHuman(String lastName) {
        for (Human o: humans) {
            if(o.getLastName().equals(lastName))
                return humans;
        }
        return null;
    }
}
