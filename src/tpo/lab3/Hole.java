package tpo.lab3;

/**
 * Created by anastasia on 19.03.17.
 */
public class Hole {

    private String state;

    public Hole(String state) {
        this.state = state;
    }

    public void transfer(Words talk, SpaceExpanses thr, Galaxy dst) {
        thr.send(talk, dst);
    }
}
