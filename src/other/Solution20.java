package other;

import java.util.HashMap;
import java.util.Stack;

/**
 * @description:20.有效的括号
 * @author: Yuner
 * @create: 2020-11-23 21:33
 **/
public class Solution20 {
    public boolean isValid(String s) {
        HashMap<Character, Character> map = new HashMap<>();
        map.put('(',')');
        map.put('{', '}');
        map.put('[', ']');
        map.put('?','?');
        Stack<Character> stack = new Stack<>();
        stack.add('?');
        for (char c : s.toCharArray()) {
            if (map.containsKey(c)) {
                stack.push(c);
            } else {
                if (map.get(stack.pop()) != c) {
                    return false;
                }
            }
        }
        return stack.size() == 1;
    }
}
