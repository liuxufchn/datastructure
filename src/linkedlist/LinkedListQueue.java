package linkedlist;

import queue.MyQueue;

/**
 * @program: datastructure
 * @Date: 2020/12/28 18:01
 * @Author: Shaffer
 * @Description:
 */
public class LinkedListQueue<E> implements MyQueue<E> {

    private class Node {
        public E data;
        public Node next;

        public Node(E data) {
            this.data = data;
            this.next = null;
        }

        public Node(E data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    private int size;
    private Node head, tail;

    public LinkedListQueue() {
        size = 0;
        head = null;
        tail = null;
    }

    @Override
    public void enqueue(E e) {
        // 队列为空
        if (head == null) {
            head = new Node(e);
            tail = head;
        }
        // 入队
        else {
            tail.next = new Node(e);
            tail = tail.next;
        }
        size++;
    }

    @Override
    public E dequeue() {
        if (isEmpty()) {
            throw new IllegalArgumentException("队列为空。");
        }

        Node curNode = head;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        curNode.next = null;
        size--;

        return curNode.data;
    }

    @Override
    public E getFront() {
        if (isEmpty()) {
            throw new IllegalArgumentException("队列为空。");
        }
        return head.data;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node cur = head;
        while (cur.next != null) {
            sb.append(cur.data).append(", ");
            cur = cur.next;
        }
        sb.append(cur.data);
        return sb.toString();
    }

    public static void main(String[] args) {
        LinkedListQueue<Character> chs = new LinkedListQueue<>();
        for (int i = 0; i < 10; i++) {
            chs.enqueue((char) (i + 'a'));
        }
        System.out.println(chs.dequeue());
        System.out.println(chs);
    }

}
