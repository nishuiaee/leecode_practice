
import java.util.*;

public class test {

    public static void main(String[] args) {
        String s1 = new String("aaaa");
        String s2 = s1.intern();
        String s3 = ("aaaa");
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s2 == s3);
    }
}