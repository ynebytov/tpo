package tpo.lab3;

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

    private static Creature Arthur = new Creature();;
    private static Galaxy firstGalaxy = new Galaxy(new Location());
    private static Galaxy secondGalaxy = new Galaxy(new Location());
    private static SpaceExpanses se = new SpaceExpanses();
    private static Star firstStar = new Star("Sun");

    static Hole openRandomHole(){
        return new Hole("Random");
    }

    public static void main(String[] args) {

        firstGalaxy.addCreatures(Arthur);
        for (int i = 0; i < 5; i++) {
            secondGalaxy.addCreatures(new Creature(firstStar, true, true));
        }

        for (int i = 0; i < 5; i++) {

        }

        openRandomHole().transfer(
                Arthur.talk("А у меня, кажется, большие проблемы с образом жизни"),
                se,
                secondGalaxy);

    }




}
