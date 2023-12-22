package humans;

import java.util.Objects;

public abstract class Character {
    protected int age;
    protected int height;
    protected int weight;
    protected final String name;

    protected Character(String name, int age, int height, int weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
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
