package stack;

import java.util.LinkedList;

/**
 * @program: datastructure
 * @Date: 2020/12/20 17:52
 * @Author: Shaffer
 * @Description:
 */
public class ValidParentheses {
    public boolean isValid(String s) {
        LinkedList<Character> chs = new LinkedList<>();
        for (char c : s.toCharArray()) {
            if (c == '(') {
                chs.push(')');
            } else if (c == '[') {
                chs.push(']');
            } else if (c == '{') {
                chs.push('}');
            } else if (chs.isEmpty() || chs.pop() != c) {
                return false;
            }
        }
        return chs.isEmpty();
    }
}
