package abstraction;

import java.util.Objects;

public abstract class Furniture {
    protected String name;
    protected int size;
    protected Color color;
    public abstract void installLocation(String place);
    public abstract String getLocation();

    public Furniture(String name, int size, Color color){
        this.name=name;
        this.size = size;
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Furniture object = (Furniture) o;
        return object.name == this.name && object.size == this.size && object.color == this.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, size, color);
    }

    @Override
    public String toString() {
        return "PhysicalObject{name=" + name
                + ", size=" + size
                + ", color=" + color + "}";
    }

}
