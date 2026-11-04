package ders8;

import java.util.Arrays;
import java.util.Random;

public class QuickSort {
  public static void main(String[] args) {
    int [] arr = new int[]{1,4,1,1,5,8,9,1,0,1,2};

    quickSort(arr, 0, arr.length-1);
    System.out.println(Arrays.toString(arr));
  }

  private static void quickSort(int[] arr, int start, int end) {
    if (end <= start) return;  // eger araliq duzgun deyilse demeli sort oluna bilmir, dayaniriq

    int pivotInd = partition(arr, start, end);
    // bir pivot index qaytarilir bize hansiki hemin indexdeki elementden soldakilar ondan kicik,
    // soldakilar da boyuk veya beraberdir

    quickSort(arr, start, pivotInd-1);  // hemin indexden soldakilari yeniden sort edirik
    quickSort(arr, pivotInd+1, end);  // hemin indexden sagdakilari yeniden sort edirik
  }

  private static int partition(int[] arr, int start, int end) {

    int pivotIndex = new Random().nextInt(end-start+1) + start;
    // evvelce pivotindex secirik random olaraq, massiv ucun verilen araliqda
    swap(arr, pivotIndex, end);
    // hemin indexdeki elementi aparib qoyuruq veriler araliqin en sonuna

    int pivot = arr[end];
    // sondaki element artiq secilmis pivotdur onu gotururuk
    int i = start - 1;

    for (int j = start; j <= end-1; j++) {
      if(arr[j] < pivot) {
        // pivotdan balacalari massivin evvelinden baslayaraq duzuruk
        i++;
        swap(arr, i, j);
        // balacalari evvelden baslayaq duzmek ucun yerdeyisme edirik
      }
    }
    i++;
    swap(arr, i, end);

    // en sondaki elemeti getirib qoyuruq balaca elementlerin sonuna
    return i;

    // ve hemin indexi qaytatiririq
  }

  private static void swap(int[] arr, int first, int last) {
    int tmp = arr[first];
    arr[first] = arr[last];
    arr[last] = tmp;
  }


}
