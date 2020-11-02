
import java.util.*;

public class test {

    public static void main(String[] args) {
        HashMap<Character,Integer> map = new HashMap();
        map.put('f',1);
        map.put('d',1);
        map.put('a',1);
        for (Map.Entry<Character, Integer> d : map.entrySet()) {
            System.out.println(d.getKey());
        }
    }
}