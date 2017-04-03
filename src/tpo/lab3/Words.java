package tpo.lab3;

/**
 * Created by anastasia on 19.03.17.
 */
public class Words {
    private Creature source;
    private String words;

    public Words(Creature source, String words) {
        this.source = source;
        this.words = words;
    }

    public String toString() {
        return words;
    }

    public Creature getSource() {
        return source;
    }
}
