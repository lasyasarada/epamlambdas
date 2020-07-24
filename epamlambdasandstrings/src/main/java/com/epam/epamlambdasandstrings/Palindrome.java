package com.epam.epamlambdasandstrings;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Palindrome {

    public static void main(String args[])
    {
        List<String> list1=new ArrayList<String>();
        list1.add("hello");
        list1.add("bye");
        list1.add("luck");
        list1.add("epam");
        list1.add("dad");
        list1=pal(list1);
        for(String i:list1)
            System.out.println(i);
    }
    static List<String> pal(List<String> l1)
    {
        List<String> l2=new ArrayList<String>();
        for(String i:l1)
        {String t = i.replaceAll("\\s+", "").toLowerCase();
            if( IntStream.range(0,t.length()/2).noneMatch(j -> t.charAt(j)!= t.charAt(t.length()-j-1)))
                l2.add(i);}
        return l2;
    }
    
}