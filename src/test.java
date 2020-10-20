
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class test {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(300);
        for(int i = 1; i < 200; i++) {
            list.add(i);
        }
        Iterator<Integer> iterator  = list.iterator();

        for (int i = 50; i < 60; i++) {
            int a = iterator.next();

            iterator.remove();
        }
       System.out.println(list.toString());
    }
}
