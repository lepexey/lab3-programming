package humans;

import interfaces.Construct;
import interfaces.Farewell;
import objects.Energy;
import objects.PhysicalObject;

public class Carlson extends Character implements Farewell, Construct {
    public Carlson() {
        super("Карлсон", 36, 160, 70);
    }

    @Override
    public PhysicalObject construct(PhysicalObject object) {
        if (energy.equals(Energy.NORMAL) || energy.equals(Energy.SUPER_FRESH)) {
            System.out.println(this.getName() + " мастерит " + object.getName());
            energy = Energy.BORED;
            return object;
        } else {
            return null;
        }

    }

    @Override
    public void farewell() {
        System.out.println(getName() + " прощается");
    }
}
