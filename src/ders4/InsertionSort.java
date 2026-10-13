package ders4;

import java.util.Arrays;

public class InsertionSort {
  public static void main(String[] args) {
    int [] arr = new int [] {3, 7 ,5, 6, 2, 1, 5, 9};
    System.out.println(Arrays.toString(arr));

    for (int i = 1; i < arr.length; i++) {
      int key = arr[i];
      int j = i - 1;
      while (arr[j] > key) {
        arr[j + 1] = arr[j];
        j--;
      }
      arr[j + 1] = key;
    }

    System.out.println("sorted: ");
    System.out.print(Arrays.toString(arr));
  }
}
