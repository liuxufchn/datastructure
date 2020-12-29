package linkedlist;

import stack.MyStack;

/**
 * @program: datastructure
 * @Date: 2020/12/28 17:55
 * @Author: Shaffer
 * @Description:
 */
public class LinkedListStack<E> implements MyStack<E> {

    private MyLinkedList<E> linkedList;

    public LinkedListStack() {
        linkedList = new MyLinkedList<>();
    }

    @Override
    public int getSize() {
        return linkedList.getSize();
    }

    @Override
    public boolean isEmpty() {
        return linkedList.isEmpty();
    }

    @Override
    public void push(E e) {
        linkedList.addFirst(e);
    }

    @Override
    public E pop() {
        return linkedList.removeFirst();
    }

    @Override
    public E peek() {
        return linkedList.getFirst();
    }

    @Override
    public String toString() {
        return linkedList.toString();
    }

    public static void main(String[] args) {
        LinkedListStack<Integer> stack = new LinkedListStack<>();
        for (int i = 0; i < 10; i++) {
            stack.push(i);
        }
        stack.pop();
        System.out.println(stack);
    }

}
