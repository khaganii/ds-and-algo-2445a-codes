package ders5;

public class BinarySearch {
  public static void main(String[] args) {
    int [] arr = new int[]{0, 0, 1, 1, 2, 4, 5, 7, 8, 9};

    int left = 0;
    int right = arr.length-1; // 9

    int target = 8;

    while(left < right) {
//      int mid = (right + left) / 2;
      int mid = (right - left) / 2 + left;

      if(arr[mid] == target) {
        System.out.println("Found at: " + mid);
        break;
      }else if(target > arr[mid]){
        left = mid + 1;
      }else{
        right = mid;
      }
    }

  }
}
