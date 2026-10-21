package ders6;

public class FibonatchiMemoization {
  public static void main(String[] args) {
//    int n = 48; // 4 807 526 976
//    int n = 46; // 1836311903
    int n = 47; // 2971215073


    long fib [] = new long [50];
    fib[0] = 1;
    fib[1] = 1;
    System.out.println(findFibonatchi(n, fib));
  }

  private static long findFibonatchi(int n, long[] fib) {

    if(n==1 || n==2) return 1;
    long a;
    if(fib[n-2] != 0)
      a = fib[n-2];
    else {
      a = findFibonatchi(n-1, fib);
      fib[n-2] = a;
    }

    long b;
    if(fib[n-3] != 0)
      b = fib[n-3];
    else {
      b = findFibonatchi(n-2, fib);
      fib[n-3] = a;
    }
    return a + b;

  }
}
