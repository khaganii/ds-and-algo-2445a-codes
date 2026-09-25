package ders2;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
  public static void main(String[] args) {
    List<Integer> myList = new MyCustomArrayList<Integer>();

    myList.add(1);
    myList.add(12);
    myList.add(122);
    myList.add(13231);
    System.out.println(myList);
    System.out.println(myList.size());

  }
}
