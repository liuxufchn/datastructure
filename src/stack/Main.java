package stack;

/**
 * @program: datastructure
 * @Date: 2020/12/20 17:35
 * @Author: Shaffer
 * @Description:
 */
public class Main {
    public static void main(String[] args) {
        ArrayStack<Integer> nums = new ArrayStack<>(10);
        nums.push(1);
        nums.push(2);
        System.out.println(nums.pop());
        System.out.println(nums.peek());
    }
}
