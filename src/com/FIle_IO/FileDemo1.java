package com.FIle_IO;

import java.io.File;
import java.text.SimpleDateFormat;

public class FileDemo1 {
    public static void main(String[] args) {
        File f = new File("/Users/madenghui/Documents/image/IMG_0285.JPG"); // 绝对路径
        File f1 = new File("src/a.txt");
        File f3 = new File("src/addressTest.txt");

        /**
         *       f1.getAbsolutePath();
         *        f1.getPath();
         *        f1.getName();
         *        f1.isFile();
         *         f1.isDirectory();
         */
        System.out.println(f1.length());
        System.out.println(f3.delete());
        System.out.println(new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(f1.lastModified()));

        File f4 = new File("/Users/madenghui/Documents/新尝试/allJAVA/JAVA/untitled001/src");
        String[] ls = f4.list();
        for (String l : ls) {
            // System.out.println(l);
        }

        File f5 = new File("lesson.md");
        System.out.println(f5.lastModified());

        File[] files = f4.listFiles();
        for (File file : files) {
            System.out.println(file.getAbsolutePath());
        }
    }
}
