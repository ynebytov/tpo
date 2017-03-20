package tpo.lab3;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by anastasia on 19.03.17.
 */
public class Galaxy {
    Location location;
    ArrayList Stars = new ArrayList();
    ArrayList Creatures = new ArrayList();
    War war;

    List<Words> textList = new ArrayList<>();


    public Galaxy(Location location) {
        this.location = location;
    }

    public void recive(Words text) {
        this.textList.add(text);
    }
}
