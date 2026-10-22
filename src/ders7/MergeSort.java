package ders7;

public class MergeSort {
  public static void main(String[] args) {
    int arr[] = {27, 38, 10, 43};

    mergeSort(arr, 0, arr.length - 1); // arr, 0, 3

    int n = arr.length;
    for (int i = 0; i < n; ++i)
      System.out.print(arr[i] + " ");
  }

  static void mergeSort(int arr[], int l, int r){

    if (l < r) {
      // 0 1 2 3
      // 0 1                  // 2 3
      // 0 0 // 1 1           // 2 2    // 3 3


      // Find the middle point
      int m = l + (r - l) / 2; // 1

      // Sort first and second halves
      mergeSort(arr, l, m); // arr, 0, 1
      mergeSort(arr, m + 1, r); // arr, 3, 3

      // Merge the sorted halves
      merge(arr, l, m, r);
    }
  }

  static void merge(int arr[], int l, int m, int r){
    //{38, 27, 34, 10}; //0  0 1
    // Find sizes of two subarrays to be merged
    int n1 = m - l + 1; //1
    int n2 = r - m; // 1

    // Create temp arrays
    int L[] = new int[n1];
    int R[] = new int[n2];

    // Copy data to temp arrays
    for (int i = 0; i < n1; ++i)
      L[i] = arr[l + i];
    for (int j = 0; j < n2; ++j)
      R[j] = arr[m + 1 + j];

    // Merge the temp arrays
    //  L[i]
    //  R[j]
    // Initial indices of first and second subarrays
    int i = 0, j = 0;
    //  L[i] {38 40}
    //  R[j] [27]
    // Initial index of merged subarray array
    int k = l;
    while (i < n1 && j < n2) {
      if (L[i] <= R[j]) {
        arr[k] = L[i];
        i++;
      }
      else {
        arr[k] = R[j];
        j++;
      }
      k++;
    }

    // Copy remaining elements of L[] if any
    while (i < n1) {
      arr[k] = L[i];
      i++;
      k++;
    }

    // Copy remaining elements of R[] if any
    while (j < n2) {
      arr[k] = R[j];
      j++;
      k++;
    }
  }
}
