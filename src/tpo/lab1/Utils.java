package tpo.lab1;

import java.math.BigInteger;
import java.util.HashMap;

/**
 * Created by nebyt on 19.03.2017.
 */
public class Utils {

    static HashMap<Integer, BigInteger> cache = new HashMap<>();

    public static BigInteger factorial(int x) {
        BigInteger ret;

        if (x == 0) return BigInteger.ONE;
        if (null != (ret = cache.get(x))) return ret;
        ret = BigInteger.valueOf(x).multiply(factorial(x-1));
        cache.put(x, ret);
        return ret;
    }

    public static Double round(double x, int n) {
        for (int i = 0; i++ < n; x = x*10);
        x = Math.round(x);
        for (int i = 0; i++ < n; x = x/10);
        return x;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.println();
    }

    public static void copyArray(int[] src, int[] dst) {
        for (int i = 0; i < src.length; i++) {
            dst[i] = src[i];
        }
    }

    public static void clearArray(int[] digs) {
        for (int i = 0; i < digs.length; i++) {
            digs[i] = 0;
        }
    }
}
