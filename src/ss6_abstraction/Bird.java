package ss6_abstraction;

public class Bird extends Animal implements Flyable{
    @Override
    public void tiengKeu() {
        System.out.println("Chíp chíp");
    }

    @Override
    public void fly() {
        System.out.println("Bay cao");
    }
}
