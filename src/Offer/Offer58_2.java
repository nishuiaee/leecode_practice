package Offer;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-11-04 13:45
 **/
public class Offer58_2 {
    public String reverseLeftWords(String s, int n) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(s.substring(n, s.length()));
        stringBuilder.append(s.substring(0, n));
        return stringBuilder.toString();
    }
}
