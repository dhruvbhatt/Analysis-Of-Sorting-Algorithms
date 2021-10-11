package algo.Sorts;

import java.util.Arrays;

public class InsertionSort {
    //O(N^2) with relatively low swaps compared to bubble sort and optimization
    private final int [] arr;

    public InsertionSort(int [] arr) {
        this.arr=arr;
    }

    public void sort()
    {
        for(int i=1;i<arr.length;i++)
        {
            int j=i-1;//sorted sub array
            int temp=arr[i];
            while (j>=0&&temp<arr[j])
            {/**doesn't go through entire sorted subArray after reaching it's "insertion point"*/
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]= temp;
        }
    }
}


