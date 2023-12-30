package objects;

import java.util.Objects;

public abstract class PhysicalObject {
    protected String name;
    protected int weight;
    protected Color color;

    public PhysicalObject(String name, int weight, Color color) {
        this.name = name;
        this.weight = weight;
        this.color = color;
    }

    public String getName(){
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PhysicalObject object = (PhysicalObject) o;
        return weight == object.weight && color == object.color && Objects.equals(name, object.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight, name, color);
    }


    @Override
    public String toString() {
        return "PhysicalObject{" +
                ", weight=" + weight +
                ", color=" + color +
                ", name='" + name + '\'' +
                '}';
    }
}
