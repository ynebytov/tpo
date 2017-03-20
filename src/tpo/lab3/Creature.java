package tpo.lab3;

/**
 * Created by anastasia on 19.03.17.
 */
public class Creature {
    Location location;
    int index;
    Star star;
    Boolean strange, warlike;

    public War balance(Creature creature) { //!!!
        War war = new War();
        war.Creatures.add(index, creature);
        return war;
    }

    public Words talk(String speech){
        return new Words(speech);
    }
}
