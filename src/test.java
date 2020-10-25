
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
      StringBuilder s = new StringBuilder();
      s.append(1);
      list.add(s.toString());
      System.out.println(s);
      System.out.println(list.toString());
    }
}