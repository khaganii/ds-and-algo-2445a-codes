package ders4;

import java.util.Arrays;

public class SelectionSort {
  public static void main(String[] args) {
    int [] arr = new int [] {3, 7 ,5, 6, 2, 1, 5, 9};
    System.out.println(Arrays.toString(arr));

    for (int i = 0; i < arr.length-1; i++) {
      int minIndex = i;
      for (int j = i+1; j < arr.length; j++) {
        if (arr[j] < arr[minIndex]) {
          minIndex = j;
        }
      }
      int t = arr[i];
      arr[i] = arr[minIndex];
      arr[minIndex] = t;
    }

    System.out.println("sorted: ");
    System.out.print(Arrays.toString(arr));
  }
}
