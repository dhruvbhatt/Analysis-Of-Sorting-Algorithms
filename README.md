# Analysis-Of-Sorting-Algorithms
Analysed the runtime of various sorting algorithms for a randomly generated array using Java System time. Algorithms which were included in the testing are Bubble Sort, Insertion Sort, Selection Sort, Quick Sort, Merge Sort, Counting Sort, Radix Sort (with a custom counting sort as sub routine), Java collections Dual Pivot Quick Sort and Heap Sort (using Min Priority Queue).

#### Runtime Of The Algorithms
*First Parameter is the maximum range, second is the minimum range and third is length of the array.* 

`randomArrGenerator arrGen=new randomArrGenerator(200,0,200);`

![13](https://user-images.githubusercontent.com/63405689/136925267-b0b71594-6f3f-4724-a109-67aee41db4f9.JPG) 

`randomArrGenerator arrGen=new randomArrGenerator(100000,0,100);`

![14](https://user-images.githubusercontent.com/63405689/136925476-115a3598-ee30-429e-9edd-7e3db4e17da7.JPG)

`randomArrGenerator arrGen=new randomArrGenerator(45000,0,1000);`

![12](https://user-images.githubusercontent.com/63405689/136924865-a553b5e3-c077-4521-a0c7-866d358efb45.JPG)

`randomArrGenerator arrGen=new randomArrGenerator(100,0,25000);`

![Capture](https://user-images.githubusercontent.com/63405689/136926168-346f83cd-9cee-4c90-94c4-7a882940e9cf.JPG)

`randomArrGenerator arrGen=new randomArrGenerator(6624344,0,33000);`

![asd](https://user-images.githubusercontent.com/63405689/136926307-147a5965-306a-4625-99b8-5ac173195c36.JPG)

From the above, we can conclude that Insertion Sort performs significantly better than its average case asymptotic compatriots namely, Bubble and Selection Sort. 

Merge Sort performs better for large databases with small range compared to Quick Sort, but for databases with larger range Quick Sort outperforms Merge Sort. 

Counting Sort despite having O(N) complexity struggles when range is N^2, where N is length. However, when used with large databases with small range, it outperforms all sorting algorithms. It can be optimised by using it as a Sub Routine in Radix sort for larger ranges. 

Heap Sort using Min Priority Queue was relatively slower compared to others, but it can be used when needed to extract the minimum values without having to pop all the elements into an array.

Java Collection's Dual Pivot Quick Sort outperformed all the algorithms in most cases.  
