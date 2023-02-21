package pets;

public class Dog extends Animal{
    public Dog(String name, boolean isHungry) {
        super(name, isHungry);
    }

    @Override
    public void voice() {
        System.out.println("gaw - gaw");
    }
}
