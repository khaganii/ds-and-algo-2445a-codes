package ders5;

public class BinarySearchV2 {
  public static void main(String[] args) {
    int [] arr = new int[]{0, 0, 1, 1, 2, 4, 5, 7, 8};
    int target = 9;
    int left = 0; // 8
    int right = arr.length-1; // 8

    while (left <= right) {
//      int mid = (left + right) / 2; // 7
      int mid = left + (right - left) / 2; // 7

      if(arr[mid] == target) {
        System.out.println("found at: " + mid);
        break;
      }
      else if(arr[mid] > target) {
        System.out.println(mid + " - comparison: " + arr[mid] + "---------"+target);
        right = mid;
      }else {
        System.out.println(mid + " - comparison: " + arr[mid] + "======="+target);
        left = mid+1;
      }
    }

  }
}
