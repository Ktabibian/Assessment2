package animals;

public class Cat extends Animal implements Pet{

    public Cat(String name) {
        super(name);
    }

    @Override
    public void printAnimalName() {
        System.out.println(this.getName());
    }

    @Override
    public void beFriendly() {
        System.out.println("avoids company");
    }

    @Override
    public void play() {
        System.out.println("mostly lounges through the day");
    }
}
