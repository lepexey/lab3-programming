package humans;

import interfaces.Constructable;
import interfaces.Farewell;
import objects.Energy;
import objects.PhysicalObject;

public class Carlson extends Character implements Farewell, Constructable {
    public Carlson() {
        super("Карлсон", 36, 160, 70);
    }

    @Override
    public void construct(PhysicalObject object) {
        if (energy.equals(Energy.NORMAL) || energy.equals(Energy.SUPER_FRESH)) {
            System.out.println(this.getName() + " мастерит " + object.getName());
            energy = Energy.BORED;
        }

    }

    @Override
    public void farewell() {
        System.out.println(getName() + " прощается");
    }
}
