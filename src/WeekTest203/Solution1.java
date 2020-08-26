package WeekTest203;

import java.util.*;

public class Solution1 {

    public List<Integer> mostVisited(int n, int[] rounds) {
        HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
        int[] num = new int[n + 1];

        List list = new ArrayList<Integer>();

        for(int i = 0; i < rounds.length - 1; i++) {
            if(rounds[i + 1] > rounds[i]) {
                for(int j = rounds[i]; j < rounds[i + 1]; j++)   {
                    num[j]++;
                }
            }
            else if(rounds[i + 1] < rounds[i]){
                for(int j = rounds[i]; j <= n; j++)   {
                    num[j]++;
                }
                for(int j = 1; j < rounds[i + 1]; j++) {
                    num[j]++;
                }
            }
            else {
                for(int j = 1; j <= n ; j++) {
                    num[j]++;
                }
            }
        }
        num[rounds[rounds.length - 1]]++;

        int max = 0;
        for(int i = 0; i < n +1; i++) {
            if(num[i] > max)
                max = num[i];
        }

        for(int i = 0; i < n + 1; i++) {
            if(num[i] == max) {
                list.add(i);
            }
        }

        return list;
    }

    public static void main(String[] args) {
        new Solution1().mostVisited(4,new int[]{1,3,1,2});
    }
}
