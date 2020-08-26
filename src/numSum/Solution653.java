package numSum;

import Common.TreeNode;

import java.util.HashSet;
import java.util.Set;

//653.两数之和四 - 输入BST
public class Solution653 {
    public boolean findTarget(TreeNode root, int k) {
       Set<Integer> set = new HashSet<>();
       return find(root, k, set);
    }

    public boolean find(TreeNode root, int k, Set<Integer> set) {
        if(root == null)
            return false;
        if(set.contains(k - root.val))
            return true;
        set.add(root.val);
        return find(root.left, k , set) || find(root.right, k , set);
    }
}
