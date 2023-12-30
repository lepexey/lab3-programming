package humans;

import interfaces.Thinking;
import objects.Energy;

public class Malish extends Character implements Thinking {

    public Malish() {
        super("Малыш", 7, 135, 35);
    }

    @Override
    public void think(Character person) {
        System.out.println(getName() + " думает о персонаже: " + person.getName());
        if (this.energy.getEnergy() > 3) {
            this.energy = Energy.BORED;
        }
    }
}
