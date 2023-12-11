package objects;

import abstraction.Color;
import abstraction.Furniture;

public class Basket extends Furniture {
    private String place;

    public Basket(String name, int size, Color color) {
        super(name, size, color);
    }

    @Override
    public void installLocation(String place) {
        this.place = place;
    }

    @Override
    public String getLocation() {
        return place;
    }

    @Override
    public String toString() {
        return getLocation() + " " + name;
    }
}
