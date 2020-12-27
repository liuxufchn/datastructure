package queue;

import java.util.Arrays;

/**
 * @program: datastructure
 * @Date: 2020/12/27 0:19
 * @Author: Shaffer
 * @Description:
 */
public class LoopQueue<E> implements MyQueue<E> {

    private E[] data;
    private int front, tail;
    private int capacity;

    private static final int DEFAULT_CAPACITY = 10;

    public LoopQueue(int capacity) {
        this.capacity = capacity;
        data = (E[]) new Object[capacity];
    }

    public LoopQueue() {
        this(DEFAULT_CAPACITY);
    }

    @Override
    public void enqueue(E e) {
        // 队列满，扩容
        if ((tail + 1) % data.length == front) {
            ensureCapacity();
        }
        data[tail] = e;
        tail = (tail + 1) % data.length;
    }

    @Override
    public E dequeue() {
        if (isEmpty()) {
            throw new IllegalArgumentException("队列为空。");
        }
        E result = data[front];
        data[front] = null;
        front = (front + 1) % data.length;
        return result;
    }

    @Override
    public E getFront() {
        if (isEmpty()) {
            throw new IllegalArgumentException("队列为空。");
        }
        return data[front];
    }

    @Override
    public int getSize() {
        return (tail + data.length) % data.length - front;
    }

    @Override
    public boolean isEmpty() {
        return front % data.length == tail;
    }

    private void ensureCapacity() {
        int oldLength = capacity;
        capacity = oldLength + (oldLength >> 1);
        if (capacity < 0) {
            throw new OutOfMemoryError();
        }
        capacity = Math.max(capacity, 2);
        E[] newData = (E[]) new Object[capacity];
        int i = 0;
        while (i < data.length) {
            newData[i] = data[(i + front) % data.length];
            i++;
        }
        data = newData;
        front = 0;
        tail = i;
    }

    @Override
    public String toString() {
        return "LoopQueue{" +
                "data=" + Arrays.toString(data) +
                ", front=" + front +
                ", tail=" + tail +
                ", capacity=" + capacity +
                '}';
    }
}
