package pets;

public class Hamster extends Animal{
    public Hamster(String name, boolean isHungry) {
        super(name, isHungry);
    }

    public void voice() {
        System.out.println("chi - hruu");
    }

    @Override
    public void action() {
        if(!getIsHungry()) {
            System.out.println("run - run");
        }
        else {
            System.out.println("runnnnniiiiinnnngggggggg");
        }
    }
}
