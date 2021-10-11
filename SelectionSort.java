package algo.Sorts;

class SelectionSort
{
    //O(N^2) with low swaps, but no optimization condition
    private final int [] arr;
    public SelectionSort(int[] arr) {
        this.arr=arr;
    }


    public void sort()
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array and place it at the top.
            int minIndex = i;//by default
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[minIndex])
                    minIndex = j;//will gain the smallest after N iteration

            //ONLY O(N) SWAPS
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

}