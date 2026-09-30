package Ders3;

public class Common {
  public static void main(String[] args) {
    int[][] myNumbers = { {1, 4, 2}, {3, 6, 8, 5, 2}, {1,3,5,6,7,8} };
//    {1, 4, 2}
//    {3, 6, 8, 5, 2}
//    {1,3,5,6,7,8}

//    for (int i = 0; i < myNumbers.length; i++) { //row - 0, 1, 2
//      for (int j = 0; j < myNumbers[i].length; j++) {
//        System.out.print(myNumbers[i][j] + " ");
//      }
//      System.out.println();
//    }


//    for (int i = 0; i < myNumbers.length; i++) { //row - 0, 1, 2
//      int sum  = 0;
//      for (int j = 0; j < myNumbers[i].length; j++) {
//        System.out.print(myNumbers[i][j] + " ");
//        sum += myNumbers[i][j];
//      }
//      System.out.print(" -> " + sum);
//      System.out.println();
//    }

    int n = 10;

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {

        int layer = Math.min(Math.min(i, j),
            Math.min(n - 1 - i, n - 1 - j));

        if (layer > 0 &&
            (i == layer || i == n - 1 - layer ||
                j == layer || j == n - 1 - layer)) {

          System.out.print("* ");
        } else {
          System.out.print("  ");
        }
      }
      System.out.println();
    }
  }
}
