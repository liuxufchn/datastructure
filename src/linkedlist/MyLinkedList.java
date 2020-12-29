package linkedlist;

import java.util.Objects;

/**
 * @program: datastructure
 * @Date: 2020/12/28 12:29
 * @Author: Shaffer
 * @Description:
 */
public class MyLinkedList<E> {

    private class Node {
        public E data;
        public Node next;

        public Node(E data) {
            this.data = data;
            next = null;
        }

        public Node(E data, Node next) {
            this.data = data;
            this.next = next;
        }

    }

    private Node head;
    private int size;

    public MyLinkedList() {
        head = new Node(null, null);
        size = 0;
    }

    public void add(int index, E e) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("非法索引。");
        }

        Node pre = head;
        for (int i = 0; i < index; i++) {
            pre = pre.next;
        }

        pre.next = new Node(e, pre.next);
        size++;

    }

    public void addFirst(E e) {
        add(0, e);
    }

    public void addLast(E e) {
        add(size, e);
    }

    public boolean contains(E e) {
        if (!isEmpty()) {
            Node cur = head.next;
            while (cur != null) {
                if (Objects.equals(cur.data, e)) {
                    return true;
                }
                cur = cur.next;
            }
        }
        return false;
    }

    public E get(int index) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("非法索引。");
        }
        if (!isEmpty()) {
            Node cur = head.next;
            for (int i = 0; i < index; i++) {
                cur = cur.next;
            }
            return cur.data;
        }
        return null;
    }

    public E getFirst() {
        return get(0);
    }

    public E getLast() {
        return get(size);
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public E remove(int index) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("非法索引。");
        }

        if (!isEmpty()) {
            Node pre = head;
            for (int i = 0; i < index; i++) {
                pre = pre.next;
            }

            Node deleteNode = pre.next;
            pre.next = deleteNode.next;
            deleteNode.next = null;
            size--;
            return deleteNode.data;
        }

        return null;
    }

    public E removeFirst() {
        return remove(0);
    }

    public E removeLast() {
        return remove(size);
    }

    public void set(int index, E e) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("非法索引。");
        }

        if (!isEmpty()) {
            Node cur = head.next;
            while (index-- > 0) {
                cur = cur.next;
            }
            cur.data = e;
        }

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node cur = head.next;
        while (cur.next != null) {
            sb.append(cur.data).append(", ");
            cur = cur.next;
        }
        sb.append(cur.data);
        return sb.toString();
    }
}
