package com.hp.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * 创建一个List集合并添加元素0-9
 * 然后获取子集[3,4,5,6]
 * 然后将子集元素扩大10倍
 * 然后输出原集合。
 * 之后删除集合中的[7,8,9]
 * @author Xiloer
 *
 */
public class Test04 {
    public static void main(String[] args) {
        List<Integer> c1 = new ArrayList();
        c1.add(0);
        c1.add(1);
        c1.add(2);
        c1.add(3);
        c1.add(4);
        c1.add(5);
        c1.add(6);
        c1.add(7);
        c1.add(8);
        c1.add(9);

        System.out.println("c1 = " + c1);
        List sub = c1.subList(3,7);
        System.out.println("sub = " + sub);
        for (int i = 0; i <sub.size() ; i++) {
            int n = (int) sub.get(i);
            n *=10;
            sub.set(i ,n);


        }
        System.out.println("c1 = " + c1);
        c1.subList(7,10).clear();
        System.out.println("c1 = " + c1);
    }
}
