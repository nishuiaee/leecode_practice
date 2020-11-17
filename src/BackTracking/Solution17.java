package BackTracking;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 17.电话号码的字母组合
 * @author: Yuner
 * @create: 2020-11-17 15:41
 **/
public class Solution17 {
    private List<String> list;
    private String letter[] = {"","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String digits) {
        list = new ArrayList<>();

        if (digits.length() != 0) {
            backtrack("", digits);
        }
        return list;
    }

    private void backtrack(String path, String digitis) {
        if (digitis.length() == 0) {
            list.add(path);
            return;
        }
        int num = digitis.charAt(0) - '0';
        String temp = letter[num - 1];
        for (int i = 0; i < temp.length(); i++) {
            backtrack(path + temp.charAt(i), digitis.substring(1));
        }
    }
}
