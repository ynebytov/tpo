package tpo.lab3;

/**
 * Created by anastasia on 19.03.17.
 */
public class Creature {
    Boolean strange, warlike;

    private long lastWordsTime;
    private Words lastWords;
    private Galaxy location;


    public Creature(Galaxy location) {
        this.location = location;
    }

    public Words talk(String speech){
        lastWordsTime = System.currentTimeMillis();
        return this.lastWords = new Words(this, speech);
    }

    public Words getLastWords() {
        return lastWords;
    }

    public long getLastTalkTime() {
        return lastWordsTime;
    }

    public Creature(Galaxy location, Boolean strange, Boolean warlike) {
        this(location);
        this.strange = strange;
        this.warlike = warlike;
    }

    public Galaxy getLocation() {
        return location;
    }

    public boolean isStrange() {
        return strange;
    }

    public boolean isWarlike() {
        return warlike;
    }
}