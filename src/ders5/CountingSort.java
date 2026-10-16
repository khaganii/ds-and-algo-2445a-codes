package ders5;

import java.util.Arrays;

public class CountingSort {
  public static void main(String[] args) {
    int [] arr = new int[]{2,4,1,1,5,8,9,0,0,7};

    int max = arr[0];
    for (int i = 0; i < arr.length; i++) {
      if(arr[i] > max) max = arr[i];
    }
    System.out.println(Arrays.toString(arr));
    int [] temp = new int[max + 1];// [0,2,1,0,1,0,0,0,0,0,0,0,0]
    for (int i = 0; i < arr.length; i++) {
      temp[arr[i]]++;
    }
    System.out.println(Arrays.toString(temp));

    int k = 0;

    for (int i = 0; i < temp.length; i++) {
      while (temp[i] > 0) {
        arr[k++] = i;
        temp[i]--;
      }
    }
    System.out.println(Arrays.toString(arr));
  }
}
