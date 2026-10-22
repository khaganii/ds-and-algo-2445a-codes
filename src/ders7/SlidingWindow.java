package ders7;

public class SlidingWindow {
//  public static void main(String[] args) {
//    int [] arr = new int[] {2,4,5,2,4,6,7,3,2,4};
//    int n = arr.length;
//    int max = Integer.MIN_VALUE;
//    for (int i = 0; i < n-3; i++) {
//      int temp  = 0;
//      for (int j = i; j <i+3 ; j++) {
//        temp+= arr[j];
//      }
//      if(max < temp) max = temp;
//    }
//    System.out.println(max);
//  }

  public static void main(String[] args) {
    int [] arr = new int[] {2,4,5,2,4,6,7,3,2,4};
    int n = arr.length;
    int max = Integer.MIN_VALUE;
    int k = 3;

    // Compute sum of first window of size k
    int max_sum = 0;
    for (int i = 0; i < k; i++)
      max_sum += arr[i];

    // Compute sums of remaining windows by
    // removing first element of previous
    // window and adding last element of
    // current window.
    int window_sum = max_sum;
    for (int i = k; i < n; i++) {
      window_sum += arr[i] - arr[i - k];
      max_sum = Math.max(max_sum, window_sum);
    }

    System.out.println(max);
  }

  static int maxSum(int arr[], int n, int k){
    // Initialize result
    int max_sum = Integer.MIN_VALUE;

    // Consider all blocks starting with i.
    for (int i = 0; i < n - k + 1; i++) {
      int current_sum = 0;
      for (int j = 0; j < k; j++)
        current_sum = current_sum + arr[i + j];

      // Update result if required.
      max_sum = Math.max(current_sum, max_sum);
    }

    return max_sum;
  }
}
