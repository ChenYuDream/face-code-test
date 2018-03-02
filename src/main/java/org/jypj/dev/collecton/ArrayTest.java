package org.jypj.dev.collecton;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yu_chen
 * @create 2018-01-30 9:39
 **/
public class ArrayTest {

    public static void main(String[] args) {
        MyArrayList<String> arrayList = new MyArrayList<>();
        arrayList.add("青蛙1");
        arrayList.add("青蛙2");
        arrayList.add("青蛙3");
        arrayList.add("青蛙4");
        arrayList.add("青蛙5");
        arrayList.add("青蛙6");
        arrayList.add("青蛙7");
        arrayList.add("青蛙8");
        arrayList.add("青蛙9");
        arrayList.add("青蛙10");
        arrayList.add("青蛙11");
        arrayList.add("青蛙12");
        System.out.println(arrayList.getSize());

        System.out.println(arrayList.get(11));
    }
}
