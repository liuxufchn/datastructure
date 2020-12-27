package stack;

import array.MyArray;

/**
 * @program: datastructure
 * @Date: 2020/12/20 17:10
 * @Author: Shaffer
 * @Description:
 */
public class ArrayStack<E> implements MyStack<E> {

    private MyArray<E> array;

    public ArrayStack(int capacity) {
        array = new MyArray<>(capacity);
    }

    public ArrayStack() {
        array = new MyArray<>();
    }

    @Override
    public int getSize() {
        return array.getSize();
    }

    @Override
    public boolean isEmpty() {
        return array.getSize() == 0;
    }

    @Override
    public void push(E e) {
        array.addLast(e);
    }

    @Override
    public E pop() {
        return array.removeLast();
    }

    @Override
    public E peek() {
        return array.get(array.getSize() - 1);
    }
}
