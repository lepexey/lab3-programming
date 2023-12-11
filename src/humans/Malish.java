package humans;

import abstraction.Character;
import abstraction.Moves;

public class Malish extends Character {
    public Malish(){
        super("Малыш", 7, 130, 43);
    }

    public String doSomething(Moves action, boolean negative) {
        if (!negative)
            return action.getAction();
        return "не " + action.getAction();
    }
}
