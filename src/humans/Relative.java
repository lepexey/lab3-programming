package humans;

import interfaces.WishGoodNight;

public abstract class Relative extends Character implements WishGoodNight {
    public Relative(String name, int age, int height, int weight) {
        super(name, age, height, weight);
    }

    @Override
    public void wishAGoodNight(Character person) {
        System.out.println(name + " желает спокойной ночи персонажу: " + person.getName());
    }

}
