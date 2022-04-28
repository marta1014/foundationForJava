package com.FIle_IO;

import java.io.*;

public class CopyDemo {
    public static void main(String[] args) {

        try {
            // InputStream is = new FileInputStream("/Users/madenghui/Downloads/i4ToolsDownloads/App/王者荣耀_3.72.10102.ipa");
            InputStream is = new FileInputStream("/Users/madenghui/Downloads/NFHemobileSit-UAT-C 2022-04-12.zip");
            // byte[] bytes = is.readAllBytes();
            OutputStream os = new FileOutputStream("/Users/madenghui/Documents/新尝试/allJAVA/JAVA/img/NFHemobileSit-UAT-C 2022-04-12.zip");
            byte[] b = new byte[1024];
            int len;
            if((len = is.read(b)) != -1) {
                os.write(b,0,len);
            }
            System.out.println("copy successful");
            is.close();
            os.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println();
    }
}
