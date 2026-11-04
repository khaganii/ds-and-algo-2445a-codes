package ders9;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyLinkedList<T> implements List<Integer> {

  Node head;
  Node tail;

  int SIZE;

  public MyLinkedList(){
    this.head = null;
    this.tail = null;
    this.SIZE = 0;
  }

  @Override
  public int size() {
    return SIZE;
  }

  @Override
  public boolean isEmpty() {
    return SIZE==0;
  }

  @Override
  public boolean contains(Object o) {
    Integer target = (Integer) o;
    Node cur = head;
    while(cur != null){
      if(cur.value == target) {
        return true;
      }
      cur = cur.next;
    }
    return false;
  }

  @Override
  public Iterator<Integer> iterator() {
    return null;
  }

  @Override
  public Object[] toArray() {
    return new Object[0];
  }

  @Override
  public <T> T[] toArray(T[] a) {
    return null;
  }

//  @Override // bad way
//  public boolean add(Integer integer) {
//    Node el = new Node(integer);
//
//    if(this.head == null) {
//      this.head = el;
//    }else{
//      Node cur = head;
//      while(cur.next != null){
//        cur = cur.next;
//      }
//      cur.next = el;
//    }
//    return true;
//  }

  @Override
  public boolean add(Integer integer) {
    Node el = new Node(integer);

    if(this.head == null) {
      this.head = el;
      this.tail = el;
    }else{
      tail.next = el;
      tail = el;
    }

    SIZE++;
    return true;
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("[");
    Node cur = head;
    while(cur != null){
      sb.append(cur.value);
      if(cur.next != null) sb.append(",");
      cur = cur.next;
    }
    sb.append("]");
    return sb.toString();
  }

  @Override
  public boolean remove(Object o) {
    if(this.head == null) return false;

    Integer target = (Integer) o;

    if(this.head.value == target) {
      this.head = head.next;
    }
    return false;
  }

  @Override
  public boolean containsAll(Collection<?> c) {
    return false;
  }

  @Override
  public boolean addAll(Collection<? extends Integer> c) {
    return false;
  }

  @Override
  public boolean addAll(int index, Collection<? extends Integer> c) {
    return false;
  }

  @Override
  public boolean removeAll(Collection<?> c) {
    return false;
  }

  @Override
  public boolean retainAll(Collection<?> c) {
    return false;
  }

  @Override
  public void clear() {

  }

  @Override
  public Integer get(int index) {
    return 0;
  }

  @Override
  public Integer set(int index, Integer element) {
    return 0;
  }

  @Override
  public void add(int index, Integer element) {

  }

  @Override
  public Integer remove(int index) {
    return 0;
  }

  @Override
  public int indexOf(Object o) {
    return 0;
  }

  @Override
  public int lastIndexOf(Object o) {
    return 0;
  }

  @Override
  public ListIterator<Integer> listIterator() {
    return null;
  }

  @Override
  public ListIterator<Integer> listIterator(int index) {
    return null;
  }

  @Override
  public List<Integer> subList(int fromIndex, int toIndex) {
    return List.of();
  }
}
