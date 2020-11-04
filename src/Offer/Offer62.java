package Offer;

import java.util.LinkedList;
import java.util.List;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-11-04 14:50
 **/
public class Offer62 {
    public int lastRemaining(int n, int m) {
        List<Integer> list = new LinkedList<>();
        int index = m - 1;
        for (int i = 0; i < n; i++) {
            list.add(i);
        }
        while (list.size() != 1) {
           list.remove(index);
           index = (index + list.size()) % list.size() - 1;
        }
        return list.get(0);
    }
}
