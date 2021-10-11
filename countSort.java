package algo.Sorts;

import java.util.Arrays;

public class countSort {
    //O(N), it uses partial hashing. Takes a lot of space and it's
    //implement range similar to array generator to use negative values
    //SPACE IS O(DISTINGUISHED N) or O(|N|)
    private final int [] arr;
    public countSort(int [] arr) {
        this.arr=arr;
    }

    public void sort()
    {
        int n=arr.length;
        int[] output =new int[n];
        //all number greater than 0
        int max=0;
        //calculating max
        for(int i=0;i<n;i++)
            max=Math.max(max,arr[i]);
        int[] brr =new int[max+1];
        //updating keys for each
        for(int i=0;i<n;i++)
            brr[arr[i]]++;
        //cumulative count start from 1 since zero will stay as it is
        for(int i=1;i<=max;i++)
            brr[i]+=brr[i-1];
        /**BACKWARDS FOR SORT STABILITY V IMP*/
        for(int i=n-1;i>=0;i--)
        {
            output[brr[arr[i]]-1]=arr[i];
            brr[arr[i]]=brr[arr[i]]-1;
        }
    }
}
