package com.abstraction;

public class Visu {
    public static void main(String[] args) {
     String g  = "viswa";
        System.out.println(g.charAt(1));
        System.out.println(g.equals("VISWA"));
        System.out.println(g.equalsIgnoreCase("mahesh"));
        g+="viswa";
        System.out.println(g);

        StringBuffer  mb = new StringBuffer(1000);
        mb.capacity();
        System.out.println(mb);
    }
}
