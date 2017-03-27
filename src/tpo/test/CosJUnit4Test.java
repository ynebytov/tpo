package tpo.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import tpo.lab1.Utils;
import tpo.lab1.mCOS;

import java.util.HashMap;
import java.util.Map;

import static junit.framework.Assert.assertTrue;
import static junit.framework.Assert.fail;
import static junit.framework.TestCase.assertEquals;

/**
 * Created by nebyt on 19.03.2017.
 */
public class CosJUnit4Test {

    private HashMap<Double, Double> basicTests = new HashMap<Double, Double>();
    private int accuracy = 6;

    @Before
    public void setup() {
        //Infinity & NaN
        basicTests.put(Double.NaN, Math.cos(Double.NaN));
        basicTests.put(Double.NEGATIVE_INFINITY, Math.cos(Double.NEGATIVE_INFINITY));
        basicTests.put(Double.POSITIVE_INFINITY, Math.cos(Double.NEGATIVE_INFINITY));

        //For basic & parity
        for (double i = 0; i < 2*Math.PI; i += 0.000_01) {
            basicTests.put(i, Utils.round(Math.cos(i), accuracy));
        }
    }

    @Test
    public void CosTest() {
        double expected, value, result, parityResult, periodicityResult;
        for (Map.Entry entry : basicTests.entrySet()) {
            //Get testing values
            value = (double) entry.getKey();
            expected = (double) entry.getValue();
            result = Utils.round(mCOS.cos(value), accuracy);
            parityResult = Utils.round(mCOS.cos(-value), accuracy);
            periodicityResult = Utils.round(mCOS.cos(value + Math.PI*2), accuracy);

            //Expected result test
            assertEquals("Not Equal result", expected, result);
            //Parity test
            assertEquals("Is Not Parity", expected, parityResult);
            //Periodicity test
            assertEquals("Is Not Periodicity",expected, periodicityResult);

            if (Double.isNaN(value) || Double.isInfinite(value)) {
                continue;
            }
            //
            if(!(result <= 1.0 && result >= -1.0)) {
                fail("Fail with ".concat(String.valueOf(result)));
            }
            //
            if (value > -Math.PI/2 && value < Math.PI/2) {
                assertTrue(result > 0);
            }
            //
            if (value > Math.PI/2 && value < Math.PI*3/2) {
                assertTrue(result < 0);
            }
        }
    }

    @After
    public void clear() {
        basicTests = null;
    }
}
