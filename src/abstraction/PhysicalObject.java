package abstraction;

import java.util.Objects;

public abstract class PhysicalObject {
    protected final String name;
    protected final int size;

    public PhysicalObject(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        PhysicalObject object = (PhysicalObject) o;
        return object.name == this.name && object.size == this.size;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, size);
    }

    @Override
    public String toString() {
        return "PhysicalObject{name=" + name + ", size=" + size + "}";
    }
}
