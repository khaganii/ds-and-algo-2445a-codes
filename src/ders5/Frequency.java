package ders5;

import java.util.Arrays;

public class Frequency {
  public static void main(String[] args) {
//    int [] arr = new int[]{1,4,1,1,5,8,9,1,0,1,2};
//
//    int [] temp = new int[100];
//    for (int i = 0; i < arr.length; i++) {
//      temp[arr[i]]++;
//    }
//
//    for (int i = 0; i < temp.length; i++) {
//      int k = temp[i];
//      if(k >= arr.length/2) {
//        System.out.println("found: " + i);
//      }
//    }
    String text = "given a string s consisting of words and spaces";
    int[] freq = new int[26];

    for (char c : text.toCharArray()) {
      if (c == ' ') {
        continue;
      }

      int index = c - 'a';
      freq[index]++;
    }
    System.out.println(Arrays.toString(freq));
  }
}
