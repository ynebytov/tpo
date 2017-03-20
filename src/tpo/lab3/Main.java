package tpo.lab3;

import java.util.Date;

/**
 * Created by anastasia on 19.03.17.
 */
public class Main {
    public void main(){
        Creature cr = new Creature();
        Date d = new Date();
        cr.location.setLocation(1,1,1, d);
    }
}
