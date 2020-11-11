package Contest;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-11-10 09:41
 **/
public class Offer33 {
    public boolean verifyPostorder(int[] postorder) {
        return volidate(postorder, 0, postorder.length - 1);
    }
    private boolean volidate(int[] postorder, int i, int j) {
        if (i >= j) return true;
        int p = i;
        while (postorder[p] < postorder[j]) p++;
        int m = p;
        while (postorder[p] > postorder[j]) p++;
        return p == j && volidate(postorder, i, m - 1) && volidate(postorder, m, j - 1);
    }
}
