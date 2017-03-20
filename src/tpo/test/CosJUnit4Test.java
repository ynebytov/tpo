package tpo.test;

import org.junit.After;
import org.junit.Test;
import tpo.lab1.Utils;
import tpo.lab1.mCOS;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by nebyt on 19.03.2017.
 */
public class CosJUnit4Test {

    @Test
    public void CosTest() {
        assertEquals(Math.cos(Double.NaN), mCOS.cos(Double.NaN));
        assertEquals(Math.cos(Double.NEGATIVE_INFINITY), mCOS.cos(Double.NEGATIVE_INFINITY));
        assertEquals(Math.cos(Double.POSITIVE_INFINITY), mCOS.cos(Double.POSITIVE_INFINITY));

        int acc = 5;
        for (double i = -3 * Math.PI / 2; i < 3 * Math.PI / 2; i += 0.00001) {
            assertEquals(Utils.round(Math.cos(i), acc), Utils.round(mCOS.cos(i), acc));
        }
    }

    @After
    public void tearDown() {
        System.out.println("All tests passed");
    }
}
