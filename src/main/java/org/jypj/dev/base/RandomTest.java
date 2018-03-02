package org.jypj.dev.base;

import java.util.Random;

/**
 * @author yu_chen
 * @create 2018-01-29 16:00
 **/
public class RandomTest {

    public static void main(String[] args) {

        for (int m = 0; m < 10; m++) {
            Random random = new Random(20);
            int i = random.nextInt(10);
            int j = random.nextInt(30);
            System.out.println("i=" + i + ",j=" + j);
        }

    }
}
