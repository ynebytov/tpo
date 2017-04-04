package tpo.test;

import org.junit.Before;
import org.junit.Test;
import tpo.lab3.*;

import java.util.HashMap;
import java.util.Map;

import static junit.framework.TestCase.assertEquals;
import static org.hamcrest.core.IsNot.not;
import static org.junit.Assert.*;

/**
 * Created by anastasia on 03.04.17.
 */
public class Task3JUnit4Test {

    FabricOfTheSpaceAndTime fst;
    int warlikeCreaturesForWar;
    int edgeVariate;

    @Before
    public void setUp() {
        fst = new FabricOfTheSpaceAndTime();
        fst.doWork();
        warlikeCreaturesForWar = (int) 1E6;
        edgeVariate = (int) 5E4;
    }

    @Test
    public void timeTest(){
        assertEquals(fst.getArthur().getLastTalkTime(), fst.getHole().getOpenTime(), 1E3);
    }

    @Test
    public void talkTest(){
        assertEquals("А у меня, кажется, большие проблемы с образом жизни", fst.getArthur().getLastWords().toString());
    }

    @Test
    public void holeTest(){
        assertEquals("случайная", fst.getHole().getType());
    }

    @Test
    public void transferTest(){
        Hole hole = fst.getHole();
        assertEquals("далеко-далеко во времени", hole.getLastTransferType());
        assertTrue(SpaceExpanses.class == hole.getLastTransferThrough().getClass());
        assertEquals("далекая галактика", hole.getLastTransferDestination().getType());
        assertThat(hole.getLastTransferSource(), not(hole.getLastTransferDestination()));
    }

    @Test
    public void galaxyTest(){
        Galaxy gal = fst.getHole().getLastTransferDestination();
        HashMap<Star, Integer> warlikeStars = new HashMap<>();
        for (Star st : gal.getStars()) {
            int tmp = 0;
            for (Creature crt: st.getCreatures()) {
                if (crt.isWarlike() & crt.isStrange()) {
                    tmp++;
                }
            }
            if (tmp != 0) {
                warlikeStars.put(st, tmp);
            }
        }
        for (Map.Entry ent:
             warlikeStars.entrySet()) {
            System.out.println(((Star)ent.getKey()).getName() + ": " + ent.getValue());
        }
        assertTrue(warlikeStars.size() > 1);
        int warlikeCreatures = 0;
        for (int wsCrt:
             warlikeStars.values()) {
            warlikeCreatures += wsCrt;
        }
        assertEquals(warlikeCreaturesForWar, warlikeCreatures, edgeVariate); //не страшная или не на грани
    }
}
