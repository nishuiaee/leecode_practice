package Tree;

import Common.TreeNode;

import javax.imageio.plugins.tiff.TIFFImageReadParam;
import java.util.ArrayList;
import java.util.List;

/**
 * @description: 99.恢复二叉搜索树
 * @author: Yuner
 * @create: 2020-10-19 16:41
 **/
public class Solution99 {


    public void recoverTree(TreeNode root) {
        List<TreeNode> lists = new ArrayList<>();
        TreeNode x = null, y = null;
        dfs(root,lists);

        for (int i = 0; i < lists.size() - 1; i++) {
            if (lists.get(i).val > lists.get(i+1).val) {
                y = lists.get(i + 1);
                if (x == null){
                    x = lists.get(i);
                }
            }
        }

        if (x != null && y != null) {
            int temp = x.val;
            x.val = y.val;
            y.val = temp;
        }

    }

    private void dfs (TreeNode root,List<TreeNode> list) {
        if (root == null) {
            return ;
        }

        dfs(root.left,list);
        list.add(root);
        dfs(root.right,list);
    }
}
