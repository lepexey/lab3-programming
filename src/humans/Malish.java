package humans;

import interfaces.FallingAsleep;
import interfaces.Thinking;

public class Malish extends Character implements FallingAsleep, Thinking {
    private boolean isSleeping = false;

    public Malish() {
        super("Малыш", 7, 135, 35);
    }

    @Override
    public void lyingInBed() {
        System.out.println(getName() + " лежит в кровати");
    }

    @Override
    public void fallingAsleep() {
        System.out.println(getName() + " засыпает");
    }

    @Override
    public void alreadySleeping() {
        isSleeping = true;
        System.out.println(getName() + " спит");
    }

    @Override
    public boolean checkSleeping() {
        if (isSleeping)
            alreadySleeping();
        else
            System.out.println(getName() + " не спит");
        return isSleeping;
    }

    @Override
    public void think(Character person) {
        System.out.println(getName() + " думает о персонаже: " + person.getName());
    }
}
