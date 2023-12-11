package Humans;

import abstraction.Character;
import abstraction.Moves;

public class Carlson extends Character {
    public Carlson() {
        super("Карлсон", 34, 120, 80);
    }

    public String doSomething(Moves action) {
        return action.getAction();
    }
}
