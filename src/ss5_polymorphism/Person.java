package ss5_polymorphism;

import java.util.Objects;

public class Person  extends  Object{
    private int id;
    // Person has a String
    private String name;

    // Person has a Address
    private Address address;

    public double add(double a, double b, double c) {
        return a + b + c;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public Person() {
    }

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void run() {
        System.out.println("Person run");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id;
    }
}
