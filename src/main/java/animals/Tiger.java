package animals;

public class Tiger extends Feline{

    public Tiger(String name) {
        super(name);
    }

    @Override
    public void printAnimalName() {
        System.out.println(this.getName());
    }
}
