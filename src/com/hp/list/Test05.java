package com.hp.list;

import java.util.ArrayList;
import java.util.List;

/**
 * 创建一个List集合，并添加元素0-9
 * 将集合转换为一个Integer数组并输出数组每一个元素
 * @author Xiloer
 *
 */
public class Test05 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        System.out.println(list);
        Integer[] integers = list.toArray(new Integer[list.size()]);

        for (Integer integer : integers) {
            System.out.println("integer="+integer);
        }
        System.out.println("integers = " + integers);
    }
}
