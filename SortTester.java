package algo.Sorts;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class SortTester {

    public static void main(String[] args) {//DRIVER CODE
        randomArrGenerator arrGen=new randomArrGenerator(100,0,25000);
        //randomArrGenerator arrGen=new randomArrGenerator(200,0,200);
        //randomArrGenerator arrGen=new randomArrGenerator(100000,0,100);
        //randomArrGenerator arrGen=new randomArrGenerator(45000,0,1000);
        //randomArrGenerator arrGen=new randomArrGenerator(6624344,0,33000);

        int [] arr=arrGen.generateArray();
        long startTime = System.nanoTime();
        //Bubble Sort O(N^2)
        bubbleSort bubbleSort=new bubbleSort(arr.clone());
        bubbleSort.sort();
        long endTime   = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println(totalTime+" nanoseconds taken by Bubble Sort");
        startTime = System.nanoTime();
        //Selection Sort O(N^2)
        SelectionSort selectionSort=new SelectionSort(arr.clone());
        selectionSort.sort();
        endTime=System.nanoTime();
        totalTime = endTime - startTime;
        System.out.println(totalTime+" nanoseconds taken by Selection Sort");
        startTime = System.nanoTime();
        //Insertion Sort O(N^2)
        InsertionSort insertionSort=new InsertionSort(arr.clone());
        insertionSort.sort();
        endTime=System.nanoTime();
        totalTime = endTime - startTime;
        System.out.println(totalTime+" nanoseconds taken by Insertion Sort");
        startTime = System.nanoTime();
        //Merge Sort O(NLogN)
        mergeSort mergeSort =new mergeSort(arr.clone());//CAN ALSO PASS ARR ITSELF, SINCE IT'S NOT INPLACE
        mergeSort.sort();
        endTime=System.nanoTime();
        totalTime = endTime - startTime;
        System.out.println(totalTime+" nanoseconds taken by Merge Sort");
        startTime = System.nanoTime();
        //QUICKSORT O(N^2) but average is O(NlogN). LAST ELEMENT IS ALWAYS PIVOT
        QuickSort quickSort=new QuickSort(arr.clone());
        quickSort.sort();
        endTime=System.nanoTime();
        totalTime = endTime - startTime;
        System.out.println(totalTime+" nanoseconds taken by Quick Sort");
        startTime = System.nanoTime();
        //COUNTING SORT O(N)
        countSort countSort=new countSort(arr.clone());
        countSort.sort();
        endTime=System.nanoTime();
        totalTime = endTime - startTime;
        System.out.println(totalTime+" nanoseconds taken by Counting Sort");
        startTime = System.nanoTime();
        //RADIX WITH COUNTING SORT SUB ROUTINE
        radixSort radixSort=new radixSort(arr.clone());
        radixSort.sort();
        endTime=System.nanoTime();
        totalTime = endTime - startTime;
        System.out.println(totalTime+" nanoseconds taken by Radix Sort");
        startTime = System.nanoTime();
        //JAVA COLLECTIONS QUICK SORT, INPLACE SORT
        Arrays.sort(arr.clone());
        endTime=System.nanoTime();
        totalTime = endTime - startTime;
        System.out.println(totalTime+" nanoseconds taken by JAVA COLLECTIONS DUAL PIVOT QUICKSORT ");
        startTime = System.nanoTime();
        //MIN PRIORITY QUEUE O(NlogN); O(N) EXTRA SPACE
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for (int j : arr.clone())
            pq.add(j);
        endTime=System.nanoTime();
        totalTime = endTime - startTime;
        System.out.println(totalTime+" nanoseconds taken by HEAP SORT");
    }
}
