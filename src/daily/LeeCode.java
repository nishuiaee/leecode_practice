package daily;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class LeeCode {
    // 寻找最长序列
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hash_set = new HashSet<Integer>();
        int max = 0;
        for(int num: nums){
            hash_set.add(num);
        }

        for(int num: hash_set)
        {
            if(!hash_set.contains(num -1)){
                int current_num = num;
                int longestnum = 1;
                while(hash_set.contains(++num))
                {
                    longestnum++;
                }
                max = Math.max(longestnum,max);
            }
        }
        return max;
    }

    // 顺时针打印数组
    public int[] spiralOrder(int[][] matrix) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0)
        {
            return new int[0];
        }
        int rows = matrix.length, columns = matrix[0].length;
        int total = rows * columns;
        int[] num = new int[total];
        boolean[][] flag = new boolean[rows][columns];
        int[][] direction = {{0,1},{1,0},{0,-1},{-1,0}};
        int indexdirection = 0;
        int row = 0, column = 0;
        int nextrow = 0, nextcolumn = 0;
        for(int i = 0; i < total; i++){
            num[i] = matrix[row][column];
            flag[row][column] = true;
            nextrow = row + direction[indexdirection][0];
            nextcolumn = column +direction[indexdirection][1];
            if(nextrow < 0 || nextrow >= rows || nextcolumn < 0 || nextcolumn >= columns || flag[nextrow][nextcolumn])
            {
                indexdirection = (indexdirection+1)%4;
            }
            row += direction[indexdirection][0];
            column += direction[indexdirection][1];
        }
        return num;
    }

    // 990.等式方程的可满足性
    public boolean equationsPossible(String[] equations) {
        int length = equations.length;
        int[] parent = new int[26];
        for (int i = 0; i < 26; i++) {
            parent[i] = i;
        }
        for (String str : equations) {
            if (str.charAt(1) == '=') {
                int index1 = str.charAt(0) - 'a';
                int index2 = str.charAt(3) - 'a';
                union(parent, index1, index2);
            }
        }
        for (String str : equations) {
            if (str.charAt(1) == '!') {
                int index1 = str.charAt(0) - 'a';
                int index2 = str.charAt(3) - 'a';
                if (find(parent, index1) == find(parent, index2)) {
                    return false;
                }
            }
        }
        return true;
    }

    public void union(int[] parent, int index1, int index2) {
        parent[find(parent, index1)] = find(parent, index2);
    }

    public int find(int[] parent, int index) {
        while (parent[index] != index) {
            parent[index] = parent[parent[index]];
            index = parent[index];
        }
        return index;
    }

    //8.字符串转换整数
    public int myAtoi(String str) {
        char[] chars = str.toCharArray();
        int n = chars.length;
        int idx = 0;
        while (idx < n && chars[idx] == ' ') {
            // 去掉前导空格
            idx++;
        }
        if (idx == n) {
            //去掉前导空格以后到了末尾了
            return 0;
        }
        boolean negative = false;
        if (chars[idx] == '-') {
            //遇到负号
            negative = true;
            idx++;
        } else if (chars[idx] == '+') {
            // 遇到正号
            idx++;
        } else if (!Character.isDigit(chars[idx])) {
            // 其他符号
            return 0;
        }
        int ans = 0;
        while (idx < n && Character.isDigit(chars[idx])) {
            int digit = chars[idx] - '0';
            if (ans > (Integer.MAX_VALUE - digit) / 10) {
                // 本来应该是 ans * 10 + digit > Integer.MAX_VALUE
                // 但是 *10 和 + digit 都有可能越界，所有都移动到右边去就可以了。
                return negative? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
            ans = ans * 10 + digit;
            idx++;
        }
        return negative? -ans : ans;
    }
}
