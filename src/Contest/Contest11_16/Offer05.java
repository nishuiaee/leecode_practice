package Contest.Contest11_16;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-11-16 18:54
 **/
public class Offer05 {
    public String replaceSpace(String s) {
        StringBuffer res = new StringBuffer();
        char[] chars = s.toCharArray();
        for (char c : chars) {
            if (c == ' ') {
                res.append("%20");
            } else {
                res.append(c);
            }
        }
        return res.toString();
    }
}
