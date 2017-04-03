package tpo.lab3;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by anastasia on 19.03.17.
 */
public class Star {
    String name;
    List<Creature> creatures = new ArrayList<>();

    public Star(String sun) {
        this.name = sun;
    }

    public List<Creature> getCreatures() {
        return creatures;
    }

    public void addCreature(Creature crt) {
        this.creatures.add(crt);
    }

    public String getName() {
        return name;
    }
}
