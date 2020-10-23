
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("dddd");
        Iterator<String> iterator = list.iterator();
        iterator.hasNext();
        while (iterator.hasNext()) {
            String str = iterator.next();
            list.set(0,"2222");
            System.out.println(str);
        }
        for (String str : list) {
//            if (str.equals("bbb"))
//                list.remove("bbb");
//            if (str.equals("ccc"))
//                list.remove("ccc");
//            if (str.equals("dddd"))
//                list.remove("dddd");
        }
        System.out.println(list.toString());
    }
}