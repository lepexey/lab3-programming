package humans;

import interfaces.Construct;
import interfaces.Farewell;
import objects.*;

import java.util.Collections;

public class Carlson extends Character implements Farewell, Construct {
    private Propeller propeller;

    public Carlson(Propeller propeller) {
        super("Карлсон", 36, 160, 70);
        this.propeller = propeller;
    }

    public void setPropeller(Propeller propeller) {
        this.propeller = propeller;
    }

    public Propeller getPropeller() {
        return propeller;
    }

    @Override
    public PhysicalObject construct(Materials material) {
        if (material == Materials.WOOD) {
            System.out.println(getName() + " мастерит скворечник");
            return new Birdhouse();
        } else if (material == Materials.PLASTIC) {
            System.out.println(getName() + " делает новый винт для полета");
            return new Propeller(propeller.getVersion() + 0.01f);
        } else {
            System.out.println("Неизвестный материал: " + material);
        }
        return null;
    }

    @Override
    public void farewell() {
        System.out.println(getName() + " прощается");
    }
}
