package com.hp.list;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 创建一个List集合(ArrayList,LinkedList均可)
 * 存放元素"one","two","three","four"。
 * 获取集合第二个元素并输出。
 * 将集合第三个元素设置为"3"
 * 在集合第二个位置上插入元素"2"
 * 删除集合第三个元素。
 * @author Xiloer
 *
 */
public class Test03 {
    public static void main(String[] args) {


        Collection c1 = new ArrayList();
        c1.add("one");
        c1.add("two");
        c1.add("three");
        c1.add("four");
        System.out.println("c1 = " + c1);
        //获取集合第二个元素并输出。
        System.out.println(((ArrayList) c1).get(1));
        //将集合第三个元素设置为"3"
        ((ArrayList) c1).set(2,"3");
        System.out.println("c1 = " + c1);

        ((ArrayList) c1).add(1,2);
        System.out.println("c1 = " + c1);

        ((ArrayList) c1).remove(2);
        System.out.println("c1 = " + c1);


    }
}
