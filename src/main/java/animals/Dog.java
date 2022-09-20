package animals;

public class Dog extends Canine implements Pet{

    public Dog(String name) {
        super(name);
    }

    @Override
    public void printAnimalName() {
        System.out.println(this.getName());
    }

    @Override
    public void beFriendly() {
        System.out.println("loves everyone");
    }

    @Override
    public void play() {
        System.out.println("runs around for hours");
    }
}
