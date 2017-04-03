package tpo.lab3;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by anastasia on 19.03.17.
 */
public class Galaxy {
    List<Star> stars = new ArrayList<>();
    List<Words> textList = new ArrayList<>();
    private String type;


    public Galaxy(String type) {
        this.type = type;
    }

    public Galaxy() {

    }

    public void recive(Words text) {
        this.textList.add(text);
    }

    public String getType() {
        return type;
    }

    public List<Star> getStars() {
        return this.stars;
    }

    public void addStar(Star star) {
        this.stars.add(star);
    }
}
