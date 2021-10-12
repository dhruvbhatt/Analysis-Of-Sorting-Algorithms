package algo.Sorts;

import java.util.Arrays;

public class randomArrGenerator {
    private final int max,min,size;
    public randomArrGenerator(int max,int min,int size) {
        //accepts range and size
        this.max=max;
        this.min=min;
        this.size=size;
    }

    /**Randomly generates an array for Testing purposes*/
    public int[]generateArray() {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            //Math.random generates a number between 0=< and <1. Add min to ensure min is lowest possible value
            arr[i] = (int) (Math.random() * (max - min + 1) + min);
        }
        return arr;
    }
}
