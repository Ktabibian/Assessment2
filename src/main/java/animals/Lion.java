package animals;

public class Lion extends Feline{

    public Lion(String name) {
        super(name);
    }

    @Override
    public void printAnimalName() {
        System.out.println(this.getName());
    }
}
