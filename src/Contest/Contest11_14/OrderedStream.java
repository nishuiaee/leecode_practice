package Contest.Contest11_14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-11-15 10:34
 **/
public class OrderedStream {

    HashMap<Integer, String> map;
    int ptr;
    int count;

    public OrderedStream(int n) {
        map = new HashMap<>();
        count = n;
        ptr = 1;
    }

    public List<String> insert(int id, String value) {
       map.put(id, value);
       if (ptr == id) {
          return print();
       }
       else
           return new ArrayList<>();
    }

    private List<String> print() {
        List<String> res = new ArrayList<>();
        while (map.containsKey(ptr)) {
            res.add(map.get(ptr));
            ptr++;
        }
        return res;
    }
}
