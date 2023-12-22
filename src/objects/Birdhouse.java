package objects;

import humans.Character;
import interfaces.Constructable;

public class Birdhouse extends PhysicalObject implements Constructable {

    public Birdhouse() {
        super("скворечник", 20, Color.WHITE);
    }

    @Override
    public void construct(Character person) {
        System.out.println(person.getName() + " мастерит " + name);
    }
}
