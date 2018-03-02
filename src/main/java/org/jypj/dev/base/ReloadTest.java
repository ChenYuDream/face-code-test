package org.jypj.dev.base;

import java.math.BigInteger;

/**
 * 重载的方法测试
 *
 * @author yu_chen
 * @create 2017-12-18 16:39
 **/
public class ReloadTest {

    public static void main(String[] args) {
        double x = 2;
        new ReloadTest().callTest(x);
    }


    public void callTest(int num) {
        System.out.println("int");
    }

    public void callTest(double num) {
        System.out.println("double");
    }

    public void callTest(char num) {
        System.out.println("char");
    }
}
