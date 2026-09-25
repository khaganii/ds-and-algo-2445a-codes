package ders2;

public class Arrays2 {

//  public static void main(String[] args) {
//
//    int [] arr = {2,5,7,1,10,3};
//    int sum = 0;
//    for (int i = 0; i < arr.length; i++) {
//     sum += arr[i];
//    }
//
//    System.out.println(sum);
//  }

//  public static void main(String[] args) {
//
//    int [] arr = {2,5,7,1,10,3};
//    int sum = 0;
//    for (int i = 0; i < arr.length; i++) {
//      if(arr[i] % 2 == 0) {
//        sum += arr[i];
//      }
//    }
//
//    System.out.println(sum);
//  }

//  public static void main(String[] args) {
//
//    int [] arr = {2,5,7,1,10,3, 0};
//    int count = 0;
//    for (int i = 0; i < arr.length; i++) {
//      if(arr[i] % 2 == 0 && arr[i] != 0) {
//        count++;
//      }
//    }
//
//    System.out.println(count);
//  }

//  public static void main(String[] args) {
//
//    int [] arr = {2,5,7,1,10,3};
//
//    for (int i = arr.length-1; i >= 0; i--) {
//      System.out.println(arr[i]);
//    }
//  }

  /* i=0   -> 2
  *  i=1  -> 5
  *
  *
  *
  *
  **/

  public static void main(String[] args) {

    int [] arr = {2,5,7,1,10,3};
    int min = arr[0];
    for (int i = arr.length-1; i >= 0; i--) {
      if(min > arr[i]) min  = arr[i];
    }

    System.out.println(min);
  }

}
