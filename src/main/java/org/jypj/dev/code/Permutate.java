package org.jypj.dev.code;

import java.util.Arrays;

/**
 * 排列组合算法实现
 *
 * @author yu_chen
 * @create 2017-12-25 14:26
 **/
public class Permutate {
    private static String param = "abc";

    public static void main(String[] args) {

        arrange(param.toCharArray(), 0, param.length());
    }

    /**
     * 输出排列组合
     *
     * @param chs
     * @param start
     * @param len
     */
    public static void arrange(char[] chs, int start, int len) {
        if (start == len - 1) {
            for (int i = 0; i < chs.length; ++i) {
                System.out.print(chs[i]);
            }
            System.out.println();
            return;
        }
        for (int i = start; i < len; i++) {
            char temp = chs[start];
            chs[start] = chs[i];
            chs[i] = temp;
            arrange(chs, start + 1, len);
            temp = chs[start];
            chs[start] = chs[i];
            chs[i] = temp;
        }
    }


}
