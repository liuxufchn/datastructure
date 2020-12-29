package linkedlist;

/**
 * @program: datastructure
 * @Date: 2020/12/28 14:37
 * @Author: Shaffer
 * @Description:
 */
public class Main {
    public static void main(String[] args) {
        MyLinkedList<Integer> linkedList = new MyLinkedList<>();
        linkedList.addFirst(10);
        linkedList.add(1, 11);
        System.out.println(linkedList);
        linkedList.remove(0);
        linkedList.set(0, 20);
        System.out.println(linkedList.isEmpty());
        System.out.println(linkedList);

        for (int i = 0; i < 10; i++) {
            linkedList.addLast(i + 100);
        }

        System.out.println(linkedList);

    }
}
