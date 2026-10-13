package ders4;

import java.util.Arrays;

public class BubbleSort {
  public static void main(String[] args) {
    int [] arr = new int [] {7, 1, 3, 5, 5, 2, 6, 9};
    System.out.println(Arrays.toString(arr));

    Arrays.sort(arr);
    for (int i = 0; i < arr.length; i++) {
      boolean change = false;
      for (int j = 0; j < arr.length-1 - i; j++) {
        if (arr[j] > arr[j+1]) {
          int t = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = t;
          change = true;
          System.out.println("deyisiklik var");
        }
      }
      if(!change) {
        break;
      }


    }

    System.out.println("sorted: ");
    System.out.print(Arrays.toString(arr));
  }
}
