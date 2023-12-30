package humans;

import interfaces.FallingAsleep;
import objects.Energy;

public class Bimbo extends Character implements FallingAsleep {
    public Bimbo(){
        super("Бимбо", 1, 50, 8);
    }
    @Override
    public void lyingInBed() {
        System.out.println(getName() + " лежит в корзинке");
        energy = Energy.BORED;
    }

}
