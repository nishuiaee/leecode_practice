package Common;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-12-03 10:04
 **/
public class Hashmap {

    //通过ForEach循环进行遍历
    public void solution1(HashMap<Integer, Integer> map) {
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }

    //迭代器
    public void solution2(HashMap<Integer, Integer> map) {
        Iterator<Map.Entry<Integer, Integer>> entries = map.entrySet().iterator();
        while (entries.hasNext()) {
            Map.Entry<Integer, Integer> entry = entries.next();
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }

    //lambda表达式
    public void solution3(HashMap<Integer, Integer> map) {

        map.forEach((k, v) -> System.out.println(k + ":" + v));
    }
}
