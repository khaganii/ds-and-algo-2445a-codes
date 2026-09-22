package ders1;

public class Main {
  public static void main(String[] args) {
    int a = 8;
    String binary = "";
    while (a > 0) {
      int m = a % 2;

      binary += m;

      a /= 2;
    }

    System.out.println(binary);
  }
}