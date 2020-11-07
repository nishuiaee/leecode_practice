package Tree;

/**
 * @description: 255.验证前序遍历序列二叉树
 * @author: Yuner
 *
 * * @create: 2020-11-07 15:43
 **/
public class Solution255 {


    //暴力解法
    public boolean verifyPreorder(int[] preorder) {
        int len = preorder.length;
        for (int i = 0; i < len; i++) {
            boolean flag = false;
            for (int j = i + 1; j < len; j++) {
                if (flag && preorder[j] < preorder[i])
                    return false;

                if (preorder[j] > preorder[i]) {
                    flag = true;
                }
            }
        }
        return true;
    }

    //单调栈
    public boolean verify(int[] preorder) {
        int len = preorder.length;
        int[] stack =  new int[len];
        int top = -1;
        int min = Integer.MIN_VALUE;
        for (int value : preorder) {
           if (value < min) {
               return false;
           }
           while (top > -1 && value > stack[top]) {
               min = stack[top];
               top--;
           }
           stack[++top] = value;
        }
        return true;
    }
}
