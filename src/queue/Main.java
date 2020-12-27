package queue;

/**
 * @program: datastructure
 * @Date: 2020/12/21 12:29
 * @Author: Shaffer
 * @Description:
 */
public class Main {
    public static void main(String[] args) {
        ArrayQueue<Character> s = new ArrayQueue<>();
        s.enqueue('a');
        s.enqueue('b');
        s.enqueue('c');

        System.out.println(s.dequeue());
        System.out.println(s.dequeue());
        System.out.println(s.dequeue());

        MyQueue<Character> ls = new LoopQueue<>();
        ls.enqueue('a');
        ls.enqueue('b');
        ls.enqueue('c');

        System.out.println(ls);

        System.out.println(ls.dequeue());
        System.out.println(ls.dequeue());
        System.out.println(ls.dequeue());


    }
}
