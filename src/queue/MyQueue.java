package queue;

/**
 * @program: datastructure
 * @Date: 2020/12/20 19:04
 * @Author: Shaffer
 * @Description:
 */
public interface MyQueue<E> {
    /**
     * 入队
     * @param e
     */
    void enqueue(E e);

    /**
     * 出队
     * @return
     */
    E dequeue();

    /**
     * 获取队首元素
     * @return
     */
    E getFront();

    /**
     * 获取队列大小
     * @return
     */
    int getSize();

    /**
     * 判空
     * @return
     */
    boolean isEmpty();
}
