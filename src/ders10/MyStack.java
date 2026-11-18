package ders10;

public class MyStack<T>{

  private int [] arr;
  private int TOP;
  private int CAPACITY;


  public MyStack (){
    this.CAPACITY = 10;
    this.arr = new int[CAPACITY];
    this.TOP = -1;
  }

  public Integer push(Integer item) {
    System.out.println(TOP + " -- " + CAPACITY);
    if(TOP >= CAPACITY) {
      throw new IndexOutOfBoundsException("yer yoxdur");
    }
    arr[++TOP] = item;
    return item;
  }

  public synchronized int size() {
    return TOP + 1;
  }

  public synchronized Integer pop() {
    if(empty()) {
      throw new IndexOutOfBoundsException("element yoxdur");
    }
    return arr[TOP--];
  }

  public synchronized Integer peek() {
    if(empty()) {
      throw new IndexOutOfBoundsException("element yoxdur");
    }
    return arr[TOP];
  }

  public boolean empty() {
    return TOP == -1;
  }

  public synchronized String toString() {
    if(TOP == -1) {
      return null;
    }
    StringBuilder b = new StringBuilder();
    b.append('[');
    for (int i = 0; ; i++) {
      b.append(arr[i]);
      if (i == TOP)
        return b.append(']').toString();
      b.append(", ");
    }
  }
}
