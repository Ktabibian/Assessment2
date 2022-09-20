package animals;

public class Wolf extends Canine{

    public Wolf(String name) {
        super(name);
    }

    @Override
    public void printAnimalName() {
        System.out.println(this.getName());
    }
}
