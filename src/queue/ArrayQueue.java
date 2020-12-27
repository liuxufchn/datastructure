package queue;

import array.MyArray;

/**
 * @program: datastructure
 * @Date: 2020/12/20 19:06
 * @Author: Shaffer
 * @Description:
 */
public class ArrayQueue<E> implements MyQueue<E> {

    private MyArray<E> array;

    public ArrayQueue(int capacity) {
        array = new MyArray<>(capacity);
    }

    public ArrayQueue() {
        array = new MyArray<>();
    }

    @Override
    public void enqueue(E e) {
        array.addLast(e);
    }

    @Override
    public E dequeue() {
        return array.removeFirst();
    }

    @Override
    public E getFront() {
        return array.get(0);
    }

    @Override
    public int getSize() {
        return array.getSize();
    }

    @Override
    public boolean isEmpty() {
        return array.isEmpty();
    }
}
