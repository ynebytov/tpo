package tpo.lab3;

import java.util.Random;

/**
 * Created by anastasia on 19.03.17.
 *
 * Например, в тот самый момент, когда Артур произнес "А у меня, кажется,
 * большие проблемы с образом жизни", в ткани пространства-времени открылась
 * случайная дыра и перенесла его слова далеко-далеко во времени через почти
 * бескрайние просторы космоса в далекую галактику, где странные воинственные
 * существа балансировали на грани ужасной межзвездной войны.
 *
 */

public class FabricOfTheSpaceAndTime {

    private Galaxy arthurGalaxy;
    private Galaxy secondGalaxy;
    private SpaceExpanses se;
    private Hole hole;

    private Creature Arthur;

    private Hole openRandomHole(){
        return new Hole("случайная");
    }

    public Creature getArthur() {
        return Arthur;
    }
    public Hole getHole() {
        return hole;
    }

    public FabricOfTheSpaceAndTime() {
        arthurGalaxy = new Galaxy();
        secondGalaxy = new Galaxy("далекая галактика");
        for(String starName : new String[]{"Альдебаран", "Сириус", "Мирфак", "Альтаир"}) {
            Star star = new Star(starName);
            Random rd = new Random();
//            long count = rd.nextInt(100)*50_000;
//            for(long i = 0; i < count; i++) {
//                star.addCreature(new Creature(secondGalaxy, rd.nextBoolean(), rd.nextBoolean()));
//            }
            for (int i = 0; i < 250_000; i++) {
                star.addCreature(new Creature(secondGalaxy, true, true));
            }
            secondGalaxy.addStar(star);
        }
        se = new SpaceExpanses();
        Arthur = new Creature(arthurGalaxy);

        Star sun = new Star("Sun");
        sun.addCreature(Arthur);
        arthurGalaxy.addStar(sun);
    }

    public void doWork() {
        this.hole = openRandomHole();
        this.hole.transfer(
                "далеко-далеко во времени",
                Arthur.talk("А у меня, кажется, большие проблемы с образом жизни"),
                this.se,
                this.secondGalaxy);
    }
}
