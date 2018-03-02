package org.jypj.dev.base;

/**
 * 16进制的数转为十进制
 *
 * @author yu_chen
 * @create 2017-12-19 13:44
 **/
public class IntegerTest {

    public static void main(String[] args) {
        String str = "13abf";

        int len = str.length();

        int sum = 0;

        for (int i = 0; i < len; i++) {

            char c = str.charAt(len - 1 - i);

            int n = Character.digit(c, 16);

            System.out.println(n);

            sum += n * (1 << (4 * i));

        }
        String s = Integer.toBinaryString(-3);
        System.out.println(s);
        System.out.println(sum);
        System.out.println(Integer.parseInt("13abf", 16));
        System.out.println(Integer.MIN_VALUE+Integer.MAX_VALUE);
    }
}
