
import java.util.*;

public class test {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>() {{add(1);add(2);add(3);}};
        for (int i : list) {
            System.out.println(i);
        }
        LinkedList res = new LinkedList();
    }
}