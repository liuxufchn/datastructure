package array;

import java.util.Arrays;

/**
 * @program: datastructure
 * @Date: 2020/12/19 15:51
 * @Author: Shaffer
 * @Description:
 */
public class MyArray<E> {

    private static final int DEFAULT_CAPACITY = 10;

    private int capacity;
    private int size;
    private E[] data;

    public MyArray(int capacity) {
        this.capacity = capacity;
        data = (E[]) new Object[capacity];
    }

    public MyArray() {
        this(DEFAULT_CAPACITY);
    }

    public void add(int index, E elem) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("非法索引。");
        }
        if (size >= capacity) {
            ensureCapacity();
        }
        for (int i = size - 1; i > index; i--) {
            data[i] = data[i - 1];
        }
        data[index] = elem;
        size++;
    }

    public void addFirst(E elem) {
        add(0, elem);
    }

    public void addLast(E elem) {
        if (size >= capacity) {
            ensureCapacity();
        }
        data[size++] = elem;
    }

    public boolean contains(E elem) {
        for (int i = 0; i < this.size; i++) {
            if (data[i].equals(elem)) {
                return true;
            }
        }
        return false;
    }

    public int find(E elem) {
        for (int i = 0; i < this.size; i++) {
            if (data[i].equals(elem)) {
                return i;
            }
        }
        return -1;
    }

    public E get(int index) {
        if (index < 0 || index >= this.size) {
            throw new IllegalArgumentException("非法索引。");
        }
        return data[index];
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return capacity;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public E remove(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("非法索引。");
        }
        E val = data[index];
        for (int i = index; i < size - 1; i++) {
            data[index] = data[index + 1];
        }
        size--;
        data[index] = null;
        return val;
    }

    public E removeFirst() {
        return remove(0);
    }

    public E removeLast() {
        return remove(size - 1);
    }

    public void set(int index, E newElem) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("非法索引。");
        }
        data[index] = newElem;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < size; i++) {
            sb.append(data[i]);
            if (i != size - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    private void ensureCapacity() {
        int oldLength = capacity;
        capacity = oldLength + (oldLength >> 1);
        if (capacity < 0) {
            throw new OutOfMemoryError();
        }
        capacity = Math.max(capacity, 2);
        data = Arrays.copyOf(data, capacity);
        System.out.println(capacity);
    }


}
