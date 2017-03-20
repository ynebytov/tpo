package tpo.lab1;

/**
 * Created by nebyt on 19.03.2017.
 */
public class RadixSorter {

    private int[] digs = new int[10];

    public void sort(int[] array, int rank) {
        int[] res = new int[array.length];
        for(int i = 1; i <= rank; i++) {
            Utils.copyArray(array, res);
            Utils.clearArray(digs);
            for (int k = 0; k < res.length; k++) {
                digs[res[k]/((int)Math.pow(10,i-1))%10]++;
            }
            for (int k = 0; k < digs.length - 1; k++) {
                digs[k+1] += digs[k];
            }
            for (int k = res.length - 1; k >= 0; k--) {
                array[--digs[res[k]/((int)Math.pow(10,i-1))%10]] = res[k];
            }
        }
    }

}