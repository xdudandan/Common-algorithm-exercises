/**
 * @ClassName: AlgoCasts
 * @Author: digital-galaxy
 * @Date: 2019-08-01 23:26
 * @Version: 1.0
 * @Description:
 *     题目：这个题目说的是，给你一个字符串，你要判断它是否是回文字符串。字符串里只考虑字母和数字，其它的字符可以无视。
 *           另外，对于字母，可以忽略大小写。
 *
 *          比如说，给你的字符串是：
 *           "race a E-car"
 *            只考虑字母数字并且忽略大小写，它是一个回文字符串，因此返回 true。再比如说，给你的字符串是
 *           "race a car"
 *           对比到最后，中间的 e 和 a 不相等，因此不是一个回文字符串，返回 false。
 *
 *
 **/
public class AlgoCasts {
    private boolean isAlphanumeric(char c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')
                || (c >= '0' && c <= '9');
    }

    private boolean isEqualIgnoreCase(char a, char b) {
        if (a >= 'A' && a <= 'Z') a += 32;
        if (b >= 'A' && b <= 'Z') b += 32;
        return a == b;
    }

    // Time: O(n), Space: O(1)
    public boolean isPalindrome(String s) {
        if (s == null || s.length() == 0) return true;

        int i = 0, j = s.length() - 1;
        for (; i < j; ++i, --j) {
            while (i < j && !isAlphanumeric(s.charAt(i))) ++i;
            while (i < j && !isAlphanumeric(s.charAt(j))) --j;
            if (i < j && !isEqualIgnoreCase(s.charAt(i), s.charAt(j))) return false;
        }
        return true;
    }
}







