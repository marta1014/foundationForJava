package com.XML;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;
import org.junit.Test;

import java.io.InputStream;

public class handleXML {
    @Test
    public void ParseXmldata() {
        SAXReader sr = new SAXReader();
        // 通过模块名对象定位文件
        InputStream is = handleXML.class.getResourceAsStream("/com/XML/test.xml");
        try {
            Document dom = sr.read(is);
            System.out.println(dom.getRootElement().getName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
