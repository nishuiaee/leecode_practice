package Contest.Contest12_3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-12-03 10:13
 **/
public class test {
    public void solution1(HashMap<Integer, Integer> map) {

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }

    public void solution2(HashMap<Integer, Integer> map) {
        Iterator<Map.Entry<Integer, Integer>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<Integer, Integer> entry = iterator.next();
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }

    public void solution3(HashMap<Integer, Integer> map) {
        map.forEach((k, v) -> System.out.println(k + ":" + v));
    }
}
