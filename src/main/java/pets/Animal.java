package pets;

public abstract class Animal implements Moodble{
    private boolean isHungry;
    private String name;

    public String getName() {
        return name;
    }

    public Animal( String name, boolean isHungry) {
        this.name = name;
        this.isHungry = isHungry;
    }

    @Override
    public void action() {
        if(!isHungry) {
            System.out.println("Very activity");
        }
        else {
            System.out.println("Sleepy");
        }
    }

    public void voice() {}

    public void feed() {
        if(!isHungry) {
            System.out.println(getName() + " is not hungry");
        }
        else {
            System.out.println(getName() + " is hungry, feed me");
        }
    }

    public boolean getIsHungry() {
        return isHungry;
    }
}
