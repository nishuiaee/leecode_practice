package Offer;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-11-02 14:56
 **/
public class Offer45 {
    private void quickSort(String[] strs, int l, int r) {
        if (l < r) {
            int i = l, j = r;
            String vot = strs[i];
            while (i != j) {
                while (i < j && (strs[j] + vot).compareTo(vot + strs[j]) >= 0) j--;
                if (i < j) strs[i++] = strs[j];
                while (i < j && (strs[i] + vot).compareTo(vot + strs[i]) <= 0) i++;
                if (i < j) strs[j--] = strs[i];
            }
            strs[i] = vot;
            quickSort(strs, i + 1, r);
            quickSort(strs, l, i - 1);
        }
    }
    public String minNumber(int[] nums) {
        String[] strs = new String[nums.length];
        for (int i = 0; i < nums.length; i++)
            strs[i] = String.valueOf(nums[i]);
        quickSort(strs, 0, strs.length - 1);
        StringBuilder res = new StringBuilder();
        for (String s : strs) {
            res.append(s);
        }
        return res.toString();
    }
}
