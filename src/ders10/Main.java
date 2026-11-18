package ders10;

import java.util.Stack;

public class Main {

  public static void main(String[] args) {
//    Stack<Integer> stack = new Stack<>();
//
//    stack.push(23);
//    stack.push(22);
//    stack.push(34);
//    stack.push(54);
//    System.out.println(stack);
//    stack.pop();
//    System.out.println(stack);
//    System.out.println(stack.peek());
//    System.out.println(stack);

    MyStack<Integer> myStack = new MyStack<>();
    System.out.println(myStack.empty());
    myStack.push(5);
    myStack.push(7);
    myStack.push(6);
    System.out.println(myStack);
    System.out.println(myStack.empty());
    System.out.println(myStack.size());
    myStack.pop();
    myStack.pop();
    myStack.pop();
    System.out.println(myStack.peek());
  }
}
