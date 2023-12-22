package humans;

import interfaces.Farewell;

public class Carlson extends Character implements Farewell {
    public Carlson() {
        super("Карлсон", 36, 160, 70);
    }

    @Override
    public void farewell() {
        System.out.println(getName() + " прощается");
    }
}
