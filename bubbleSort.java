package algo.Sorts;

public class bubbleSort {
    //o(n^2) with high number of swaps
    private final int[] arr;

    public bubbleSort(int[] arr) {
        this.arr=arr;
    }
    public void sort()
    {
        int temp=0;
        for(int i=0;i<arr.length;i++)
        {
            boolean swapped=false;
            for(int j=0;j<arr.length-1;j++)
            {
                if(arr[j]>arr[j+1])
                {//swaps adjacent elements
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped=true;
                }
            }
            if(!swapped)//slight optimization. If no swaps took place, then already sorted.
                break;
        }
    }
}
