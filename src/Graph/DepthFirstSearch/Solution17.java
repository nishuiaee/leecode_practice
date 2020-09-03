package Graph.DepthFirstSearch;

import java.util.ArrayList;
import java.util.List;

//17.电话号码的字母组合，树的深度优先搜索dfs
public class Solution17 {

    private List<String> list;
    private String letter[] = {"","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

    public List<String> letterCombinations(String digits) {
       list = new ArrayList<>();

       if(digits.length() != 0) {
            letterCombinations("",digits);
       }
        return list;
    }

    public void letterCombinations(String combination, String digits) {
        if(digits.length() == 0) {
            list.add(combination);
        } else {
            int num = digits.charAt(0) - '0';
            String templetter = letter[num - 1];
            for(int i = 0; i < templetter.length(); i++) {
                letterCombinations(combination + templetter.charAt(i),digits.substring(1));
            }
        }
    }

}
