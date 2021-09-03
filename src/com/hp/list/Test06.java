package com.hp.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 创建一个字符串数组:{"one","two","three"}
 * 然后将该数组转换为一个List集合
 * @author Xiloer
 *
 */
public class Test06 {
    public static void main(String[] args) {


        String[] animals = {"one","two","three"};

        List animalList = Arrays.asList(animals);

        for(Object str : animalList){
            System.out.println(str);

        }
        System.out.println("animalList = " + animalList);

    }
    }

