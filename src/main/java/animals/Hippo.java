package animals;

public class Hippo extends Animal{

    public Hippo(String name) {
        super(name);
    }

    @Override
    public void printAnimalName() {
        System.out.println(this.getName());
    }
}
