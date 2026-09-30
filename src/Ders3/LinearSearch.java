package Ders3;

public class LinearSearch {
  public static void main(String[] args) {
    int[] myNumbers =  {1,3,5,6,7,6,8};

    int target = 6;
//index of
//    for (int i = 0; i < myNumbers.length; i++) {
//      if(myNumbers[i] == target) {
//        System.out.println("found in " + i);
//      }
//    }

    //last index of
    for (int i = myNumbers.length-1; i >= 0; i--) {
      if(myNumbers[i] == target) {
        System.out.println("found in " + i);
        break;
      }
    }
  }
}
