package ders5;

import java.util.Arrays;

public class CountingSortV2 {
  public static void main(String[] args) {
    int [] arr = new int[]{2,4,1,1,5,8,9,0,0,7};

    int max = arr[0];
    for (int i = 0; i < arr.length; i++) { //n
      if(arr[i] > max) max = arr[i];
    }
    System.out.println(Arrays.toString(arr));
    int temp [] = new int[max+1];
    for (int i = 0; i < arr.length; i++) { //n
      temp[arr[i]]++;
    }
    System.out.println(Arrays.toString(temp));

    int k = 0;
    for (int i = temp.length-1; i >= 0; i--) { //max
      while (temp[i] > 0) {
        arr[k++] = i;
        temp[i]--;
      }
    }
    System.out.println(Arrays.toString(arr));
  }
}
