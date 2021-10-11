package algo.Sorts;

public class QuickSort
{
    //O(N^2) worstime but performs in O(NlogN) average case(depends on choice of pivot) and is inplace.
    private final int [] arr;
    public QuickSort(int[] arr) {
        this.arr=arr;
    }

    public void sort()
    {
        sort(arr,0, arr.length-1);
    }
    private void sort(int arr[],int l,int r)
    {
        if(l<r)
        {//recurse until single elements
            int p=partition(arr,l,r);
            sort(arr,l,p-1);
            sort(arr,p+1,r);
        }
    }
    public static int partition(int arr[],int l,int r)
    {//Just partitions the array(NOT SORT)
        int pivot=arr[r];//choosing right most as pivot always(can randomise it for better results)
        int pIndex=l;
        for (int i=l;i<r;i++)
        {//less than R, since it's the partitioning element
            if(arr[i]<pivot)
            {
                swap(arr,i,pIndex);
                pIndex++;
            }
        }
        /**All smaller elements are to its left and larger to its right after N iterations*/
        swap(arr,r,pIndex);
        return pIndex;
    }
    public static void swap(int arr[],int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
