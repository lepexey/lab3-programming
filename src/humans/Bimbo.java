package humans;

import interfaces.FallingAsleep;

public class Bimbo extends Character implements FallingAsleep {
    private boolean isSleeping = false;
    public Bimbo(){
        super("Бимбо", 1, 50, 8);
    }
    @Override
    public void lyingInBed() {
        System.out.println(getName() + " лежит в корзинке");
    }

    @Override
    public void fallingAsleep() {
        System.out.println(this.getName() + " засыпает");
    }

    @Override
    public void alreadySleeping() {
        isSleeping = true;
        System.out.println(this.getName() + " спит");
    }

    @Override
    public boolean checkSleeping() {
        if (isSleeping)
            alreadySleeping();
        else
            System.out.println(getName() + " не спит");
        return isSleeping;
    }
}
