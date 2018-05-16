package kedup;

/**
 * @author kedupmail@gmail.com
 * @date 2018/5/15 15:50
 *
 * 从后往前用两个指针替换
 */
public class ReplaceSpace {
    public static String replaceSpace(StringBuffer str) {
        if (str == null || str.length() == 0) {
            return str.toString();
        }

        int oldLen = str.length();
        for (int i = 0; i < oldLen; i++) {
            if (str.charAt(i) == ' ') {
                str.append("  ");
            }
        }

        int p1=oldLen-1;
        int p2 = str.length() - 1;
        while (p1 >= 0 && p1 < p2) {
            char c = str.charAt(p1--);
            if (c == ' ') {
                str.setCharAt(p2--, '0');
                str.setCharAt(p2--, '2');
                str.setCharAt(p2--, '%');
            } else {
                str.setCharAt(p2--, c);
            }
        }
        return str.toString();
    }

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("We Are Happy");
        System.out.println(replaceSpace(sb));

    }
}
