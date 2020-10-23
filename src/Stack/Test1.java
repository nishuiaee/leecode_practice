package Stack;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

/**
 * @description: 匹配大括号小括号中括号
 * @author: Yuner
 * @create: 2020-10-23 19:44
 **/
public class Test1 {
    public boolean fun (String str) {
        Deque<String> stack = new LinkedList<>();
        for (int i = 0; i < str.length(); i++) {
            switch (str.charAt(i)) {
                case '{' :
                    stack.push("{");
                    break;

                case '[' :
                    stack.push("[");
                    break;

                case '(':
                    stack.push("(");
                    break;

                case '}' :
                    String temp1 = stack.pop();
                    if (!temp1.equals("{")) {
                        return false;
                    } else {
                        break;
                    }

                case ']' :
                    String temp2 = stack.pop();
                    if (!temp2.equals("[")) {
                        return false;
                    } else {
                        break;
                    }

                case ')' :
                    String temp3 = stack.pop();
                    if (!temp3.equals("(")) {
                        return false;
                    } else {
                        break;
                    }
            }
        }
        if (stack.size() != 0) {
            return false;
        } else {
            return true;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        System.out.println(new Test1().fun(str));
    }
}
