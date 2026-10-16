package ders5;

import java.util.Arrays;

public class PrefixSum {
  public static void main(String[] args) {
    int [] arr = new int[]{2,4,1,1};

    int [] pre = new int[arr.length];
    int [] suf = new int[arr.length];

    for (int i = 1; i < arr.length; i++) { // n
        pre[i] = arr[i-1] + pre[i-1];
    }
    System.out.println(Arrays.toString(pre));

    for (int i = arr.length-2; i >=0 ; i--) { // bn
      suf[i] = suf[i+1] + arr[i+1];
    }
    System.out.println(Arrays.toString(suf));


    for (int i = 0; i < arr.length; i++) { // 3n
      if(pre[i] == suf[i]) {
        System.out.println("found at index: " + i);
        break;
      }
    }
  }
}
