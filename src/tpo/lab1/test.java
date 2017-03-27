package tpo.lab1;

/**
 * Created by nebyt on 19.03.2017.
 */
public class test {

    public static void main(String[] args) {
        RadixSorter rs = new RadixSorter();
        int[]array = new int[]{4, 24, 93, 5, 81, 64, 77};
        String test = rs.sort(array);
        System.out.println("Test is: \n" + test);
    }
}