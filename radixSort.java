package algo.Sorts;

import java.util.Arrays;

public class radixSort {
    private final int [] arr;

    public radixSort(int[] arr) {
        this.arr = arr;
    }

    public void sort() {
        int max = 0;
        for (int i = 0; i < arr.length; i++)
            max = Math.max(max, arr[i]);//TO GET MAX VALUE in array
        int i = 1;
        while (max / i > 0)
        {
            cS(i, arr);//calls sub routine digit no of times(length of max)
            i *= 10;
        }
    }

    public static void cS(int place, int[] arr) {
        //counting sort routine

        int n = arr.length;
        int max = 0;
        int[] output = new int[n];
        int[] count = new int[10];//0-9 digits. Only keeps single digit values.

        for (int i = 0; i < n; i++) {
            //single digits extracted
            count[(arr[i] / place) % 10]++;
            //EG. (a) 35/1=>35;35%10=5 (b) 35/10=3;3%100=3 (1's place and 10's place respectively)
        }
        for (int i = 1; i < 10; i++)
            count[i] += count[i - 1];//Calculates summation in a Bottom Up approach
        for (int i = n - 1; i >= 0; i--) {
            output[count[(arr[i] / place) % 10] - 1] = arr[i];
            count[(arr[i] / place) % 10]--;//creates the array
        }
        for (int i = 0; i < n; i++)
            arr[i] = output[i];//data is passed to the array which was passed as the parameter
    }
}

