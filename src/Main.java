import Humans.Carlson;
import Humans.Malish;
import Humans.Relative;
import abstraction.Color;
import abstraction.Moves;
import abstraction.TimeOperands;
import objects.*;

public class Main {
    public static void main(String[] args) {
        Malish malish = new Malish();
        Carlson carlson = new Carlson();
        Bed bed = new Bed("Кроватка", 120);

        Relative mum = new Relative("Мама", 36, 160, 49);
        Relative dad = new Relative("Папа", 38, 180, 88);
        Relative betan = new Relative("Бетан", 14, 180, 88);
        Relative bosse = new Relative("Боссе", 15, 180, 88);

        System.out.println(TimeOperands.LATER.getTime() + " " + carlson.getName() + " "
                + carlson.doSomething(Moves.BECAME) + " " + carlson.doSomething(Moves.GOODBYE));

        System.out.print(TimeOperands.AN_HOUR_AHEAD.getTime() + " " + bed.interact(malish));

        Basket basket = new Basket("корзинка", 20, Color.BLACK);
        basket.installLocation("рядом");
        System.out.println(" а " + basket + " " + Moves.LOCATED.getAction());

        System.out.println(GroupComing.comeTogether(mum, dad, betan, bosse));

        Dream dream = new Dream();
        System.out.println(dream.interact(TimeOperands.ALREADY, malish));

        System.out.println("Но " + malish.getName() + " " + TimeOperands.YET.getTime() + " "
                + malish.doSomething(Moves.SLEEP, true) + ", а " + Moves.THINK.getAction() +
                " о " + carlson.getName() + "е");

        System.out.println("Что " + carlson.getName() + " " + TimeOperands.NOW.getTime() + " "
                + Moves.DO.getAction() + "?");

        Birdhouse birdhouse = new Birdhouse("скворечник");
        System.out.println("Может " + birdhouse.interact(Moves.TINKER, carlson) + "?");
    }
}