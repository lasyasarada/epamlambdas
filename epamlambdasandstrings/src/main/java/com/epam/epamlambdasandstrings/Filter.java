package com.epam.epamlambdasandstrings;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {


    public static void main(String args[]) {
        List<String> list1 = new ArrayList<String>();
        list1.add("las");
        list1.add("lan");
        list1.add("lap");
        list1.add("sar");
        list1.add("lasyasarada");
        list1=search(list1);
        for(String i:list1)
            System.out.println(i);
    }
    static List<String> search(List<String> l1)
    {
        return l1.stream().filter(s -> s.startsWith("l")).filter(s -> s.length()==3).collect(Collectors.toList());
    }

}