package com.TempTest;

public class Lesson {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("a dm in");
        String str = "user";
        System.out.println(sb.length());
        sb.trimToSize();
        System.out.println(sb.length());
    }
}
