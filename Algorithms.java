import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Algorithms
{
    public static void main(String[] args) {
      // create and initialize the wikipedia sized array
      int[] wiki = new int[5505945];
      for (int i = 0; i < wiki.length; i++)
        wiki[i] = i;

      // randomize the array
      shuffleArray(wiki);

      // make 4 copies, since arrays are stored globally
      int[] wiki1 = new int[5505945];
      int[] wiki2 = new int[5505945];
      int[] wiki3 = new int[5505945];
      int[] wiki4 = new int[5505945];

      System.arraycopy( wiki, 0, wiki1, 0, wiki.length );
      System.arraycopy( wiki, 0, wiki2, 0, wiki.length );
      System.arraycopy( wiki, 0, wiki3, 0, wiki.length );
      System.arraycopy( wiki, 0, wiki4, 0, wiki.length );

      // Create algorithm objects...
      ShellSort shellSort = new ShellSort();
      HeapSort heapSort = new HeapSort();
      MergeSort mergeSort = new MergeSort();
      QuickSort quickSort = new QuickSort();

      // Get starting time, run algorithm, print time took, repeat...

      // For Shellsort
      double startTime = System.nanoTime();
      shellSort.sort(wiki1);
      System.out.println("Shellsort took: " + ((System.nanoTime() - startTime) / Math.pow(10, 9)) +
                          " Seconds");
      // For Heapsort
      startTime = System.nanoTime();
      heapSort.sort(wiki2);
      System.out.println("Heapsort took: " + ((System.nanoTime() - startTime) / Math.pow(10, 9)) +
                          " Seconds");
      // For Mergesort
      startTime = System.nanoTime();
      mergeSort.sort(wiki3, 0, wiki3.length-1);
      System.out.println("Mergesort took: " + ((System.nanoTime() - startTime) / Math.pow(10, 9)) +
                          " Seconds");
      // For Quicksort
      startTime = System.nanoTime();
      quickSort.sort(wiki4, 0, wiki4.length-1);
      System.out.println("Quicksort took: " + ((System.nanoTime() - startTime) / Math.pow(10, 9)) +
                          " Seconds");
    }

    //Fisher-Yates shuffling algorighm
    static void shuffleArray(int[] ar)
    {
      Random rnd = ThreadLocalRandom.current();
      for (int i = ar.length - 1; i > 0; i--)
      {
        int index = rnd.nextInt(i + 1);
        // Simple swap
        int a = ar[index];
        ar[index] = ar[i];
        ar[i] = a;
      }
    }

    /* A utility function to print array of size n */
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
}
