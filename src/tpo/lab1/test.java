package tpo.lab1;

/**
 * Created by nebyt on 19.03.2017.
 */
public class test {

    public static void main(String[] args) {
        int[] array = {372,456,634,714,258,789,186,651,44,215,958,105,372,26,819,607,33,156,130,616,824,456,868,941,533,576,335,241,80,663};
        Utils.printArray(array);
        RadixSorter rs = new RadixSorter();
        rs.sort(array, 3);
        Utils.printArray(array);

        array = new int[]{1, 28, 76, 345, 35};
        Utils.printArray(array);
        rs.sort(array, 2);
        Utils.printArray(array);
    }
}