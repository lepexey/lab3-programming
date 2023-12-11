package objects;

import abstraction.Character;
import abstraction.Moves;
import abstraction.PhysicalObject;
import interfaces.Constructable;
import interfaces.Interaction;

public class Birdhouse extends PhysicalObject implements Interaction, Constructable {

    public Birdhouse(String name) {
        super(name, 50);
    }

    @Override
    public String interact(Character... characters) {
        StringBuilder result = new StringBuilder();
        for (Character character: characters)
            result.append(character.getName()).append(" делает скворечник");

        return result.toString();
    }

    public String interact(Moves action, Character... characters) {
        StringBuilder result = new StringBuilder();
        for (Character character: characters)
            result.append(character.getName()).append(" ").append(action.getAction()).append(" ").append(name);

        return result.toString();
    }


    @Override
    public String tinker() {
        return "мастерит "+ name;
    }
}
