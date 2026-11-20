package ders11.qr1;

import java.util.Collection;
import java.util.Iterator;

public class MyQueue <T> {

  int [] arr;
  int size;
  int head;
  int tail;
  int capacity;

  public MyQueue(){
    this.capacity = 10;
    this.head = -1;
    this.tail = -1;
    this.size = 0;
    this.arr = new int[capacity];
  }

  @Override
  public String toString() {
    if(size == 0) return "[-]";
    StringBuilder sb = new StringBuilder();
    for (int i = head; i <= tail; i++) {
      sb.append(arr[i] + " ");
    }
    return sb.toString();
  }

  public void addFirst(Integer integer) {

  }
  
  public void addLast(Integer integer) {

  }
  
  public boolean offerFirst(Integer integer) {
    return false;
  }
  
  public boolean offerLast(Integer integer) {
    return false;
  }
  
  public Integer removeFirst() {
    return 0;
  }
  
  public Integer removeLast() {
    return 0;
  }
  
  public Integer pollFirst() {
    return 0;
  }

  public Integer pollLast() {
    return 0;
  }

  public Integer getFirst() {
    return 0;
  }
  
  public Integer getLast() {
    return 0;
  }

  public Integer peekFirst() {
    return 0;
  }
  
  public Integer peekLast() {
    return 0;
  }
  
  public boolean removeFirstOccurrence(Object o) {
    return false;
  }
  
  public boolean removeLastOccurrence(Object o) {
    return false;
  }
  
  public boolean add(Integer integer) {
    if(isEmpty()) {
      head = 0;
      tail = 0;
      arr[head] = integer;
    }else {
      if(tail == capacity-1) {
        throw new IndexOutOfBoundsException("yer Yoxdur");
      }
      arr[++tail] = integer;
    }
    size++;
    return true;
  }

  public boolean offer(Integer integer) {
    return false;
  }
  
  public Integer remove() {
    if(isEmpty()) {
      throw new IndexOutOfBoundsException("onsuzda bosdur");
    }

    int el = arr[head];
    size--;
    if(isEmpty()) {
      head = -1;
      tail = -1;
    }else{
      head++;
    }

    return el;
  }

  public Integer poll() {
    return 0;
  }

  public Integer element() {
    return 0;
  }

  public Integer peek() {
    return 0;
  }
  
  public boolean addAll(Collection<? extends Integer> c) {
    return false;
  }

  public boolean removeAll(Collection<?> c) {
    return false;
  }
  
  public boolean retainAll(Collection<?> c) {
    return false;
  }
  
  public void clear() {

  }
  
  public void push(Integer integer) {

  }

  public Integer pop() {
    return 0;
  }
  
  public boolean remove(Object o) {
    return false;
  }
  
  public boolean containsAll(Collection<?> c) {
    return false;
  }
  
  public boolean contains(Object o) {
    return false;
  }

  public int size() {
    return 0;
  }

  public boolean isEmpty() {
    return size == 0;
  }

  
  public Iterator<Integer> iterator() {
    return null;
  }

  
  public Object[] toArray() {
    return new Object[0];
  }

  
  public <T> T[] toArray(T[] a) {
    return null;
  }

  
  public Iterator<Integer> descendingIterator() {
    return null;
  }
}
