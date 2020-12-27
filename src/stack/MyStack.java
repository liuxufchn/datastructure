package stack;

/**
 * @program: datastructure
 * @Date: 2020/12/20 17:07
 * @Author: Shaffer
 * @Description:
 */
public interface MyStack<E> {
    /**
     * 获取栈大小
     * @return 栈大小
     */
    int getSize();

    /**
     * 判空
     * @return
     */
    boolean isEmpty();

    /**
     * 入栈
     * @param e
     */
    void push(E e);

    /**
     * 出栈
     * @return
     */
    E pop();

    /**
     * 获取栈顶元素
     * @return
     */
    E peek();
}
