package tpo.lab3;

/**
 * Created by anastasia on 19.03.17.
 */
public class SpaceExpanses {
    Location location;
    Boolean almostEndless;

    public void send(Words text, Galaxy dst) {
        dst.recive(text);
    }
}
