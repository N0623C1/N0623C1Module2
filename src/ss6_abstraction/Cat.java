package ss6_abstraction;

public abstract class Cat extends Animal {
    private String color;

    public Cat(int id, String name, String color) {
        super(id, name);
//        this.setId(id);
//        this.setName(name);
        this.color = color;
    }

    @Override
    public void tiengKeu() {
        System.out.println("Meo Meo");
    }
}
