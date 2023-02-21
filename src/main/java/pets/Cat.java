package pets;

public class Cat extends Animal{
    public Cat(String name, boolean isHungry) {
        super( name, isHungry);
    }

    @Override
    public void voice() {
        System.out.println("mau - mau");
    }
}
