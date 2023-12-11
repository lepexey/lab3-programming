package objects;

import abstraction.Character;
import abstraction.PhysicalObject;
import interfaces.Interaction;

public class Bed extends PhysicalObject implements Interaction {
    public Bed(String name, int size) {
        super(name, size);
    }

    @Override
    public String interact(Character... characters) {
        StringBuilder result = new StringBuilder();
        for (Character character: characters)
            result.append(character.getName()).append(" лежал в кроватке");

        return result.toString();
    }
}
