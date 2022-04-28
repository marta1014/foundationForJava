package com.MapDemo1;

import java.util.HashMap;
import java.util.Map;

public class MapDemo1 {
    public static void main(String[] args) {
        UserInfo info1 = new UserInfo("admin","1000001","teacher",28,6000);
        UserInfo info2 = new UserInfo("user","1000002","student",22,4900);
        UserInfo info3 = new UserInfo("admin","1000003","teacher",37,7800);

        Map<String,UserInfo> m = new HashMap<>();
        m.put(info1.getUid(),info1);
        System.out.println(m.keySet());
    }
}
