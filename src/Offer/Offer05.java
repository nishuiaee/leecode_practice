package Offer;

/**
 * @description: 替换空格
 * @author: Yuner
 * @create: 2020-10-10 10:19
 **/
public class Offer05 {
    public String replaceSpace (String s) {
        char[] chars = new char[s.length() * 3];
        int size = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                chars[size++] = '%';
                chars[size++] = '2';
                chars[size++] = '0';
            }
            else chars[size++] = s.charAt(i);
        }
        return new String(chars, 0, size);
    }

}
