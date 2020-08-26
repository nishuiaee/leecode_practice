package daily.sixmonth;

import javax.swing.tree.TreeNode;
import java.util.*;

public class Solution {

//    public int translateNum(int num) {
//        HashMap<Integer,Character> mapchar = new HashMap<>();
//        for(int i = 0; i < 26; i++){
//            mapchar.put(i,(char)('a'+i));
//        }
//        List<String> chars = new ArrayList<>();
//
//    }

    public boolean isPalindrome(int x) {
        if (x == 0 || (x < 10 && x > 0))
            return true;
        if (x < 0 || x % 10 == 0)
            return false;
        int temp = 0;
        int tempx = x;
        int a = 0;
        for (int i = 0; tempx > 10; i++) {
            a = tempx % 10;
            tempx /= 10;
            temp = temp * 10 + a;
        }
        if (temp * 10 + tempx == x)
            return true;
        else
            return false;
    }

    //11. 盛水最多的容器
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int volum = 0;
        while (left < right) {
            volum = Math.max(volum, Math.min(height[left], height[right]) * (right - left));
            if (height[left] > height[right])
                right--;
            else
                left++;
        }
        return volum;
    }

    //15.三数之和
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        List<List<Integer>> list = new ArrayList<>();
        for (int k = 0; k < nums.length - 2; k++) {
            if (nums[k] > 0) break;
            if (k > 0 && nums[k] == nums[k - 1]) continue;
            int i = k + 1;
            int j = nums.length - 1;
            while (i < j) {
                sum = nums[k] + nums[i] + nums[j];
                if (sum < 0) {
                    while (i < j && nums[i] == nums[++i]) ;
                } else if (sum > 0) {
                    while (i < j && nums[j] == nums[--j]) ;
                } else {
                    list.add(new ArrayList<Integer>(Arrays.asList(nums[k], nums[i], nums[j])));
                    while (i < j && nums[i] == nums[++i]) ;
                    while (i < j && nums[j] == nums[--j]) ;
                }
            }
        }
        return list;
    }

    //16.最接近的三数之和
    public int threeSumClosest(int[] nums, int target) {
       Arrays.sort(nums);
       int ans = nums[0] + nums[1] + nums[2];
       int start,end;
       int length = nums.length;
       int sum;
       for(int i = 0; i < length; i++){
           start = i + 1;
           end = length -1;
           while(start < end)
           {
               sum = nums[i] + nums[start] + nums[end];
               if(Math.abs(sum - target) < Math.abs(ans - target))
                   ans = sum;
               if(sum > target)
                   end--;
               else if(sum < target)
                   start++;
               else
                   return ans;
           }
       }
       return ans;
    }

    private List<String> list;
    private String letter[] = {"","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    //17.电话号码的字母组合
    public List<String> letterCombinations(String digits) {
        list = new ArrayList<String>();
        if(digits.length() != 0)
            letterCombinations("", digits);
        return list;
    }

    public void letterCombinations(String combination, String digits){
        if(digits.length() == 0)
            list.add(combination);
        else{
            int num = digits.charAt(0) - '0';
            String templetter = letter[num - 1];
            for(int i = 0; i < templetter.length(); i++){
                letterCombinations(combination+templetter.charAt(i),digits.substring(1));
            }
        }

    }

    //14.最长公共前缀
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0)
        {
            return "";
        }
        int count = strs.length;
        String prefix = strs[0];
        for(int i = 1; i < count; i++){
            if(prefix.length() == 0)
                return "";
            prefix = commonlongest(prefix,strs[i]);
        }
        return prefix;
    }

    public String commonlongest(String s1, String s2){
        int index = 0;
        int length = Math.min(s1.length(),s2.length());
        while(index < length && s1.charAt(index) == s2.charAt(index))
        {
            index++;
        }
        return s1.substring(0,index);
    }

    //12.整数转罗马数字
    public String intToRoman(int num) {
        int[]  values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] symblos = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < values.length; i++){
            while(values[i] <= num ){
                num -= values[i];
                sb.append(values[i]);
            }
        }
        return sb.toString();
    }
    // 297.

//    public String rserialize(TreeNode root, String str) {
//        if (root == null) {
//            str += "None,";
//        } else {
//            str += str.valueOf(root.val) + ",";
//            str = rserialize(root.left, str);
//            str = rserialize(root.right, str);
//        }
//        return str;
//    }
//
//    public String serialize(TreeNode root) {
//        return rserialize(root, "");
//    }
//
//    public TreeNode rdeserialize(List<String> l) {
//        if (l.get(0).equals("None")) {
//            l.remove(0);
//            return null;
//        }
//
//        TreeNode root = new TreeNode(Integer.valueOf(l.get(0)));
//        l.remove(0);
//        root.left = rdeserialize(l);
//        root.right = rdeserialize(l);
//
//        return root;
//    }
//
//    public TreeNode deserialize(String data) {
//        String[] data_array = data.split(",");
//        List<String> data_list = new LinkedList<String>(Arrays.asList(data_array));
//        return rdeserialize(data_list);
//    }
    //1014.最近观光组合
    public int maxScoreSightseeingPair(int[] A) {

        int sumI = 0;
        int sumJ = 0;
        for(int i = 0; i < A.length; i++){
            sumI = Math.max(sumI,A[i] + i);
            sumJ = Math.max(sumJ,A[i] - i );
        }
        return sumI + sumJ;
    }



}