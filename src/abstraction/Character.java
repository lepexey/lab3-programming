package abstraction;

import java.util.Objects;

public abstract class Character {
    protected String name;
    protected int age;
    protected int height;
    protected int weight;

    public Character(String name, int age, int height, int weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Character object = (Character) o;
        return object.name == this.name && object.age == this.age && object.height == height && object.weight == weight;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, height, weight);
    }

    @Override
    public String toString() {
        return "Character{name=" + name +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight + "}";
    }
}
