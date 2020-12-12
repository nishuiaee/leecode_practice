package Contest.Contest12_06;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-12-06 10:36
 **/
public class Solution {
    public String interpret(String command) {
        StringBuffer res = new StringBuffer();
        if (command.length() == 0) {
            return "";
        }
        for (int i = 0; i < command.length() - 2; i++) {
            char c = command.charAt(i);
            if (c == '(' && command.charAt(i + 1) == ')') {
                res.append("o");
                i = i + 1;
            } else if (c == '(' && command.charAt(i + 1) == 'a') {
                i = i + 3;
                res.append("al");
            } else {
                res.append("c");
            }
        }
        return res.toString();
    }
}
