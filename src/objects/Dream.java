package objects;

import abstraction.Character;
import abstraction.PhysicalObject;
import abstraction.TimeOperands;
import interfaces.Interaction;

public class Dream extends PhysicalObject implements Interaction {
    public Dream() {
        super("сон", 0);
    }

    @Override
    public String interact(Character... characters) {
        StringBuilder result = new StringBuilder();
        for (Character character : characters)
            result.append(character.getName()).append("а").append(" одолевал ").append(name);

        return result.toString();
    }

    public String interact(TimeOperands time, Character... characters) {
        StringBuilder result = new StringBuilder();
        for (Character character : characters)
            result.append(character.getName()).append("а").append(" ").append(time.getTime()).append(" ").append("одолевал ").append(name);

        return result.toString();
    }
}
