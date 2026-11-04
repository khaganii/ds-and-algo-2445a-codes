package ders8;

import java.util.Arrays;
import java.util.Random;

public class QuickSort2 {

  public static void main(String[] args) {
    int [] arr = new int[]{1,4,1,1,2,1,0,1,5,8,9};

    quickSort(arr, 0, arr.length-1);
    System.out.println(Arrays.toString(arr));
  }

  private static void quickSort(int[] arr, int left, int right) {

    if(right <= left) return;

    int pivotIndex = partition(arr, left, right); // 3

    quickSort(arr, left, pivotIndex-1);
    quickSort(arr, pivotIndex+1, right);
  }

  private static int partition(int[] arr, int left, int right) {
    // 5 , 9  // 9-5+1 = 5 //  5, 1, 2, 3 ,9
    int randomIndex = new Random().nextInt(right-left+1) + left;
    int pivot = arr[randomIndex];
    swap(arr, randomIndex, right);

    int i = left-1;

    for (int j = left; j <= right-1; j++) {
      if(arr[j] < pivot) {
        i++;
        swap(arr, i, j);
      }
    }
    i++;

    swap(arr, i, right);

    return i;
  }

  private static void swap(int[] arr, int first, int last) {
    int tmp = arr[first];
    arr[first] = arr[last];
    arr[last] = tmp;
  }


}
