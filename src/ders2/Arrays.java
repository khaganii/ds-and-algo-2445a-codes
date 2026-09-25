package ders2;

public class Arrays {
//  public static void main(String[] args) {
//    int [] arr = {2,3,4,6,7,8,9};
//    int sum = 0;
//    for (int i = 0; i < arr.length; i++) {
//      sum = sum + arr[i];
//    }
//
//    System.out.println(sum);
//  }

//  public static void main(String[] args) {
//    int [] arr = {-2,-11,-4,-7,-8,-9};
//    int max = Integer.MIN_VALUE;
//    for (int i = 0; i < arr.length; i++) {
//      if(max < arr[i]) max = arr[i];
//    }
//    System.out.println(max);
//  }

//  public static void main(String[] args) {
//    int [] arr = {-2,-11,-4,-7,-8,-9, 0};
//    int even = 0;
//    for (int i = 0; i < arr.length; i++) {
//      if(arr[i] % 2 == 0 && arr[i] != 0) {
//        even++;
//      }
//    }
//    System.out.println(even);
//  }
//
//  public static void main(String[] args) {
//    int [] arr = {-2,-11,-4,-7,-8,-9, 0};
//
//    for (int i = arr.length-1; i >= 0; i--) {
//      System.out.println(arr[i]);
//    }
//  }
  /*
  * i = 0; -> -2
  * i = -1 -> arr[6]
  *
  *
  *
  * */

    public static void main(String[] args) {
    int [] arr = {-2,-11,-2,-7,-8,-2, 0};
    int target = -2;
    int count = 0;
    for (int i = 0; i < arr.length; i++) {
      if(arr[i] == target) count++;
    }
    System.out.println(count);
  }

}
