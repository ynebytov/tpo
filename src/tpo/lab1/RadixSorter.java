package tpo.lab1;

/**
 * Created by nebyt on 19.03.2017.
 */
public class RadixSorter {

    private int[] digs = new int[10];
    private StringBuilder returnValue = new StringBuilder();

    private void addReturnValue(int[] array) {
        returnValue.append("[");
        returnValue.append(array[0]);
        for (int i = 1; i < array.length; i++) {
            returnValue.append("," + array[i]);
        }
        returnValue.append("]");
    }

    public String sort(int[] array) {
        returnValue.delete(0, returnValue.length());
        boolean replace = true;
        int[] res = new int[array.length];
        for(int i = 1; true; i++) {
            Utils.copyArray(array, res);
            addReturnValue(res);
            Utils.clearArray(digs);
            for (int k = 0; k < res.length; k++) {
                digs[res[k]/((int)Math.pow(10,i-1))%10]++;
            }
            if (!replace && digs[0] == array.length) {
                break;
            }
            returnValue.append("\n");
            addReturnValue(digs);
            returnValue.append("\n");
            for (int k = 0; k < digs.length - 1; k++) {
                digs[k+1] += digs[k];
            }
            replace = false;
            for (int k = res.length - 1; k >= 0; k--) {
                int place = --digs[res[k]/((int)Math.pow(10,i-1))%10];
                array[place] = res[k];
                if (place != k) {
                    replace = true;
                }
            }
        }
        return returnValue.toString();
    }

}