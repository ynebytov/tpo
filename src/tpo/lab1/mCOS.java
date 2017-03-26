package tpo.lab1;

import java.math.BigInteger;
import java.util.HashMap;

/**
 * Created by nebyt on 19.03.2017.
 */
public class mCOS {
    static HashMap<Integer, BigInteger> cache = new HashMap<>();

    private static BigInteger factorial(int x) {
        BigInteger ret;

        if (x == 0) return BigInteger.ONE;
        if (null != (ret = cache.get(x))) return ret;
        ret = BigInteger.valueOf(x).multiply(factorial(x-1));
        cache.put(x, ret);
        return ret;
    }

    static public double cos(double x) {
        double add = 0.0;
        double result = 0.0;
        int n = 0;
        int sign = -1;

        if (Double.isNaN(x)) return Double.NaN;
        if (Double.isInfinite(x)) return Double.NaN;
        do {
            result += sign * add;
            add = Math.pow(x, 2*n)/
                    factorial(2*n).doubleValue();
            sign *= -1;
            n++;
        }while(add > 0.000_000_000_000_000_1);

        return result;
    }
}
