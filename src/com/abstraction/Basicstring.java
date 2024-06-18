package com.abstraction;

import java.util.Arrays;

public class Basicstring {
    public static void main(String[] args) {

        //two String together using the + operator and concat method
         String str= "mahesh";
         String str1= "dummy";
        System.out.println(str+" "+str1);
        // concat method
        String sr= "first";
        sr=sr.concat("pant");
        System.out.println(sr);
        // length string method
        String s= "hello world";
        System.out.println(s.length()-1);
        //string substring
        String s1= "singam reddy visweswara reddy ";
        String b = s1.substring(6);
        System.out.println(b);
        // string to char
        String c= "hello world";
       Character firstchar=c.charAt(0);
       char lastchar= c.charAt(str.length()-1);
       // split methhod
        String a1="mahesh babu";
        String a2= Arrays.toString(a1.split("babu"));
        System.out.println(a2);
        // even length words
        String mb= "singam reddy visweswara reddy";
       for (String word : mb.split(" "));
       if (mb.length()%2==0){
           System.out.println(mb);
       }
    }
}
