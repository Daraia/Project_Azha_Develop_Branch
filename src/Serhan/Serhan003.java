package Serhan;

import java.util.Arrays;

public class Serhan003 {
    public static void main(String[] args) {

        int[] array = {0,4,5,6,7,9,0,0,4,123,12};

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    array[j] = array[j] ^ array[j + 1];
                    array[j + 1] = array[j] ^ array[j + 1];
                    array[j] = array[j] ^ array[j + 1];
                }
            }
        }

        System.out.println(Arrays.toString(array));

    }
}
