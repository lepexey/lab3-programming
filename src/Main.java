import humans.*;
import objects.Birdhouse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Carlson carlson = new Carlson();
        Malish malish = new Malish();
        Bimbo bimbo = new Bimbo();

        List<Relative> relativeList = new ArrayList<>();
        Mum mum = new Mum();
        Dad dad = new Dad();
        Bosse bosse = new Bosse();
        Betan betan = new Betan();
        Collections.addAll(relativeList, mum, dad, bosse, betan);

        Birdhouse birdhouse = new Birdhouse();

        // start of program
        carlson.farewell();
        malish.lyingInBed();
        bimbo.lyingInBed();
        for (Relative person : relativeList) {
            person.wishAGoodNight(malish);
        }
        if (!malish.checkSleeping())
            malish.think(carlson);

        carlson.construct(birdhouse);
    }

}