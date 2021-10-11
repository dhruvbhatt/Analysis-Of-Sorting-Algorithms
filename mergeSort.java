package algo.Sorts;

import java.util.Arrays;

public class mergeSort {
    /**O(NlogN) Runtime but not in place. Uses O(N) space*/
    private final int [] arr;

    public mergeSort(int[] arr) {
        this.arr = arr;
    }
    public  void sort()
    {
        split(arr,0, arr.length-1);
    }
    public static int[] split(int[] arr, int l, int r)
    {
        if(r>l)
        {
            int m=(l+r)/2;
            //divide it into two halves
            int[] lH =split(arr,l,m);
            int[] rH =split(arr,m+1,r);
            return merge(lH,rH);
        }
        else {
            return Arrays.copyOfRange(arr, l, r + 1);//Recurse until it can return single element array, and then gets merged.
        }
    }
    public static int[] merge(int[] lh, int[] rh)
    {
        int[] finalArr =new int[lh.length+ rh.length];
        int i=0;int j=0;int k=0;//i is main array's counter i.e. Merged array which will be returned
        while (j<lh.length&&k<rh.length)
        {//INCASE ONE SUB ARRAY IS BIGGER(not yet inserted, cause larger elements) IT CAN BE JUST ADDED AT THE END.
         //results in faster runtime and ensures don't get a null pointer exception
            if(lh[j]<rh[k])
            {
                finalArr[i]=lh[j];
                j++;
            }
            else
            {
                finalArr[i]=rh[k];
                k++;
            }
            i++;
        }
        //for remaining values
        while (j<lh.length)
        {
            finalArr[i]=lh[j];
            j++;
            i++;
        }
        while (k< rh.length)
        {
            finalArr[i]=rh[k];
            k++;
            i++;
        }
        return finalArr;//returns the merged array
    }
}
