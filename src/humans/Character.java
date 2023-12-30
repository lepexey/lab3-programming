package humans;

import interfaces.FallingAsleep;
import objects.Energy;

import java.util.Objects;

public abstract class Character implements FallingAsleep {
    protected int age;
    protected int height;
    protected int weight;
    protected final String name;
    protected boolean isSleeping;
    protected Energy energy = Energy.NORMAL;

    protected Character(String name, int age, int height, int weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public void lyingInBed() {
        System.out.println(getName() + " лежит в кровати");
        energy = Energy.BORED;

    }

    @Override
    public void fallingAsleep() {
        System.out.println(getName() + " засыпает");
        energy = Energy.TIRED;
    }

    @Override
    public void sleep() {
        if (energy.getEnergy() < 3) {
            isSleeping = true;
            energy = Energy.VEGETABLE;
            System.out.println(getName() + " спит");
        }
    }

    @Override
    public boolean checkSleeping() {
        return isSleeping;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Character character = (Character) o;
        return age == character.age && height == character.height && weight == character.weight && Objects.equals(name, character.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, height, weight, name);
    }

    @Override
    public String toString() {
        return "Human{" +
                "age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                ", name='" + name + '\'' +
                '}';
    }
}
