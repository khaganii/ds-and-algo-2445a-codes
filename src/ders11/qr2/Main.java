package ders11.qr2;

public class Main {
  public static void main(String[] args) {
//    Queue<Integer> queue = new ArrayDeque<>();
//
//    queue.add(1);
//    queue.add(2);
//    queue.add(3);
//    queue.add(4);
//    queue.add(5);
//    queue.add(6);
// // 6 ->  5 4 3 2 1
//    System.out.println(queue);
//
//    queue.remove();
//    System.out.println(queue);


//    MyQueue<Integer> queue = new MyQueue<>();
//
//    queue.add(1);
//    queue.add(2);
//    queue.add(3);
//    queue.add(4);
//    queue.add(5);
//    queue.add(6);
    // 6 ->  5 4 3 2 1
//    System.out.println(queue);
//
//    queue.remove();
//    System.out.println(queue);


    MyCircularQueue<Integer> queue = new MyCircularQueue();

    queue.add(1);
    queue.add(2);
    queue.add(3);
    queue.add(4);
    queue.add(5);
    queue.add(6);
//     6 ->  5 4 3 2 1
    System.out.println(queue);

    queue.remove();
    System.out.println(queue);

  }
}
