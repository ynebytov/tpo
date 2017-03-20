package tpo.lab3;

/**
 * Created by nebyt on 20.03.2017.
 */
public class FabricOfTheSpaceAndTime {

    private static Creature Arthur = new Creature();;
    private static Galaxy firstGalaxy = new Galaxy(new Location()   );
    private static Galaxy secondGalaxy = new Galaxy(new Location());
    private static SpaceExpanses se = new SpaceExpanses();

    static Hole openRandomHole(){
        return new Hole("Random");
    }

    public static void main(String[] args) {
        openRandomHole().transfer(
                Arthur.talk("А у меня, кажется, большие проблемы с образом жизни"),
                se,
                secondGalaxy);
    }

}
