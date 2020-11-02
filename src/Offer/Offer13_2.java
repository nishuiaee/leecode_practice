package Offer;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @description: bfs
 * @author: Yuner
 * @create: 2020-11-01 14:21
 **/
public class Offer13_2 {
    public int movingCount (int m, int n, int k) {
        boolean[][] visited = new boolean[m][n];
        int res = 0;
        Deque<int[] > deque = new LinkedList<>();
        deque.add(new int[]{0, 0, 0, 0});
        while (!deque.isEmpty()) {
            int[] nums = deque.poll();
            int i = nums[0], j = nums[1], si = nums[2], sj = nums[3];
            if (i >= m || j >= n || k < si + sj || visited[i][j]) continue;
            visited[i][j] = true;
            res++;
            deque.add(new int[]{i + 1, j, (i + 1) % 10 != 0 ? si + 1 : si - 8, sj});
            deque.add(new int[]{i, j + 1, si, (j + 1) % 10 != 0 ? sj + 1 : sj - 8});
        }
        return res;
    }
}
