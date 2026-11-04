package ders9;

public class Main {
  public static void main(String[] args) {
    MyLinkedList<Integer> myList = new MyLinkedList<>();
    myList.add(5);
    myList.add(2);
    myList.add(7);
    myList.add(12);

    System.out.println(myList);
    System.out.println(myList.size());
    System.out.println(myList.remove(Integer.valueOf(5)));
    System.out.println(myList);


  }
}
