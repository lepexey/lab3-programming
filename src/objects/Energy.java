package objects;

public enum Energy {
    SUPER_FRESH(5),
    NORMAL(4),
    BORED(3),
    TIRED(2),
    VEGETABLE(1);

    private int energy;
    Energy(int energy) {
        this.energy = energy;
    }

    public int getEnergy() {
        return energy;
    }
}
